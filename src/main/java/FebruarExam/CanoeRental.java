package FebruarExam;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CanoeRental {

    private String name;
    private CanoeType canoeType;
    private LocalDateTime startTime;
    private LocalDateTime endTime;


    public CanoeRental(String name, CanoeType canoeType, LocalDateTime startTime) {
        this.name = name;
        this.canoeType = canoeType;
        this.startTime = startTime;
    }

    public String getName() {
        return name;
    }

    public CanoeType getCanoeType() {
        return canoeType;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "(Név: " + name + ", " + "Szín: "+ canoeType + ", " + "Bérlés kezdete: " + startTime + ", " + "Bérlés vége: " + endTime + ")";
    }
}
