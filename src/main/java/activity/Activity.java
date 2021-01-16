package activity;

public interface Activity {

    //ez ugyan az, szóval nem másolta be megint
    double getDistance();

    ActivityType getType();

    default boolean hasTrack() {
        return false;
    }

}
