package collectionsmap;

import java.time.LocalDate;

public class EntryMap {

    private String ip;
    private LocalDate entryDay;
    private String login;

    //192.168.0.1 2021.02.06 vezérürü11 valahogy így néz ki a söveges file

    public EntryMap(String ip, LocalDate entryDay, String login) {
        this.ip = ip;
        this.entryDay = entryDay;
        this.login = login;
    }

    public String getIp() {
        return ip;
    }

    public String getLogin() {
        return login;
    }

    public LocalDate getEntryDay() {
        return entryDay;
    }
}
