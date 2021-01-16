package activity;

import java.util.ArrayList;
import java.util.List;

public class Activities {

    private List<Activity> activities;

    public Activities(List<Activity> activities) {
        this.activities = new ArrayList<>(activities);
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public int numberOfTrackActivities() {
        int counter = 0;
        for (Activity activity: activities) {
            //itt az instaceof nem a legjobb vélasztás István szerint alább azzal csinltam
            if (activity.hasTrack()) {
                counter++;
            }
        }
        return counter;
    }

    public int numberOfWithoutTrackActivities() {
        int counter = 0;
        for (Activity activity: activities) {
            if (!activity.hasTrack()) {
                counter++;
            }
        }
        return counter;
    }

    public List<Report> distancesByTypes() {
         double[] sum = new double[ActivityType.values().length];
         for (Activity activity: activities) {
             sum[activity.getType().ordinal()] += activity.getDistance();
         }
         List<Report> result = new ArrayList<>();
         for (ActivityType activityType: ActivityType.values()) {
             result.add(new Report(activityType, sum[activityType.ordinal()]));
         }
         return result;
    }
}

    /* public List<Report> distancesByTypes() {
        List<Report> reports = new ArrayList<>();
        for (int i = 0; i < ActivityType.values().length; i++) {
            ActivityType activityType = ActivityType.values()[i];
            double distance = 0;
            for (Activity activity : activities) {
                if (activity.getType().equals(ActivityType.values()[i])) {
                    distance += activity.getDistance();
                }
            }
            reports.add(new Report(activityType, distance));
        }
        return reports;
    }

    public int numberOfTrackActivities() {
        int result = 0;
        for (Activity activity : activities) {
            if (activity instanceof ActivityWithTrack) {
                result++;
            }
        }
        return result;
    }

    public int numberOfWithoutTrackActivities() {
        return activities.size() - numberOfTrackActivities();
    }


    */


