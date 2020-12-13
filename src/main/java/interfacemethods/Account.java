package interfacemethods;

import catalog.AudioFeatures;

import java.time.LocalDateTime;

public class Account implements Audited, CreatedInJanuary {

    private LocalDateTime localDateTime;

    public Account(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public LocalDateTime getCreatedAt() {
        return localDateTime;
    }

    @Override
    public boolean createdAfter(LocalDateTime dateTime) {
        return Audited.super.createdAfter(dateTime);
        //return CreatedAtJanuary.super.createdAfter(dateTime);
    }
}
