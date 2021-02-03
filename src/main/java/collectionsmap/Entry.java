package collectionsmap;

import java.time.LocalDate;

public class Entry {

    private String ip;
    private String login;
    private LocalDate entryDay;

    public Entry(String ip, String login, LocalDate entryDay) {
        this.ip = ip;
        this.login = login;
        this.entryDay = entryDay;
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
