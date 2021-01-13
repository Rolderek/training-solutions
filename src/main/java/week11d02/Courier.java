package week11d02;

import java.util.ArrayList;
import java.util.List;

public class Courier {

    private List<Ride> rides = new ArrayList<>();

    public void addRide(Ride ride) {
        int a = rides.size();
        if (a == 0) {
            if (ride.getRideNumber() == 1 ) {
                rides.add(ride);
            } else {
                throw new IllegalArgumentException("Incorrect ride!");
            }
        }
        if (a != 0) {
            Ride previous = rides.get(a - 1);
            if (previous.getDayNumber() == ride.getDayNumber() && previous.getRideNumber() + 1 == ride.getRideNumber()) {
                rides.add(ride);
            }
            else if (previous.getDayNumber() < ride.getDayNumber() && ride.getRideNumber() == 1) {
                rides.add(ride);
            } else {
                throw new IllegalArgumentException("Incorrect ride!");
            }

        }

    }

    public int noWork() {
        for ( int i = 1; i < 8; i++) {
            for (Ride item : rides) {
                if (i == item.getDayNumber()) {
                    break;
                }
                return i;
            }
        }
        return -1;
    }
}
