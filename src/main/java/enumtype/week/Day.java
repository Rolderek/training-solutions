package enumtype.week;

public enum Day {
    HÉTFŐ(DayType.WORKDAY), KEDD(DayType.WORKDAY), SZERDA(DayType.WORKDAY), CSÜTRÖTÖK(DayType.WORKDAY), PÉNTEK(DayType.WORKDAY), SZOMBAT(DayType.HOLIDAY), VASÁRNAP(DayType.HOLIDAY);

    private final DayType dayType;

    Day(DayType dayType) {
        this.dayType = dayType;
    }

    public DayType getDayType() {
        return dayType;
    }

}
