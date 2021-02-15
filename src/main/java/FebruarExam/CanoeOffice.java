package FebruarExam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CanoeOffice {

    public List<CanoeRental> crList = new ArrayList<>();

    public void addRental(CanoeRental cr) {
        crList.add(cr);
    }

    public boolean isActive(CanoeRental cr){
        return (cr.getEndTime() == null);
    }

    public CanoeRental findRentalByName(String name) {
        for (CanoeRental cr : crList) {
        if (cr.getName().equals(name) && isActive(cr)) {
            System.out.println(cr);
                return cr;
            }
        }
        throw new IllegalArgumentException("Can't find rental");
    }

    public CanoeRental closeRentalByName(String name, LocalDateTime endTime) {
        CanoeRental found = null;
        for (int i = 0; i < crList.size(); i++) {
            if (crList.get(i).getName().equals(name)) {
                crList.get(i).setEndTime(endTime);
                found = crList.get(i);
            }
        }
        System.out.println(found.toString());
        return found;
    }

    public double getRentalPriceByName(String name, LocalDateTime endTime) {
        double pricePerHour = 5000;
        for (int i =0; i < crList.size(); i++) {
            if (crList.get(i).getName().equals(name)) {
                crList.get(i).setEndTime(endTime);
                System.out.println(crList.get(i).getStartTime().compareTo(crList.get(i).getEndTime()));

            }
        }
        return pricePerHour;
    }

    public static void main(String[] args) {
        CanoeRental cr1 = new CanoeRental("Laci", CanoeType.RED, LocalDateTime.of(2021, 1, 20, 10, 15));
        CanoeRental cr2 = new CanoeRental("Eszter", CanoeType.GREEN,LocalDateTime.of(2021, 2, 20, 10, 15));
        CanoeRental cr3 = new CanoeRental("Lévi", CanoeType.BLUE,LocalDateTime.of(2021, 3, 20, 10, 15));
        CanoeOffice co = new CanoeOffice();

        co.addRental(cr1);
        co.addRental(cr2);
        co.addRental(cr3);
        co.findRentalByName("Laci");
        co.closeRentalByName("Laci", LocalDateTime.of(2021, 1, 20, 12, 15));
    }


}
