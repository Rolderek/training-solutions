package lambdaintermediate;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cafe {

    private List<CoffeeOrder> cafeList = new ArrayList<>();

    public Cafe(List<CoffeeOrder> cafeList) {
        this.cafeList = cafeList;
    }

    public List<CoffeeOrder> getCafeList() {
        return cafeList;
    }

    public void add(CoffeeOrder co) {
        cafeList.add(co);
    }

    public BigDecimal getTotalIncome() {
        return cafeList.stream()
                .flatMap(c -> c.getCoffeeList().stream())
                .map(co -> co.getPrice())
                .reduce(BigDecimal.ZERO, (a, b) -> a.add(b), (c, z) -> c.add(z).setScale(2, RoundingMode.HALF_UP));
    }

    public BigDecimal getTotalIncome(LocalDate date) {
        return cafeList.stream()
                .filter(cafeList -> cafeList.getDateTime().toLocalDate().equals(date))
                .flatMap(c -> c.getCoffeeList().stream())
                .map(co -> co.getPrice())
                .reduce(BigDecimal.ZERO, (a, b) -> a.add(b), (c, z) -> c.add(z).setScale(2, RoundingMode.HALF_UP));
    }
    public long getNumberOfCoffee(CoffeeType type) {
        return cafeList.stream()
                .flatMap(x -> x.getCoffeeList().stream())
                .map(a -> a.getType())
                .filter(type::equals)
                .count();
    }

    public List<CoffeeOrder> getOrdersAfter(LocalDateTime from){
        return cafeList.stream()
                .filter(x -> x.getDateTime().isAfter(from))
                .collect(Collectors.toList());
    }

    public List<CoffeeOrder> getFirstFiveOrder(LocalDate date) {
        return cafeList.stream()
                .filter(x -> x.getDateTime().toLocalDate().equals(date))
                .sorted((a, b) -> a.getDateTime().compareTo(b.getDateTime()))
                .limit(5)
                .collect(Collectors.toList());
    }
}
