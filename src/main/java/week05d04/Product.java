package week05d04;

import java.time.LocalDate;

public class Product {

    private String name;
    private LocalDate expiredDate;

    public Product(String name, int year, int month, int day) {
        this.name = name;
        this.expiredDate = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public LocalDate getExpiredDate() {
        return expiredDate;
    }
}
