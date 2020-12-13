package interfacemethods;

import java.time.LocalDateTime;

public interface CreatedInJanuary {

    LocalDateTime getCreatedAt();

    default boolean createdAfter(LocalDateTime dateTime) {
        return getCreatedAt().isAfter(dateTime);
    }

}
