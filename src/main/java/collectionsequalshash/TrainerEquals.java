package collectionsequalshash;

import java.util.Objects;

public class TrainerEquals {

    private String name;
    private int year;

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public TrainerEquals(String name, int year) {
        this.name = name;
        this.year = year;
    }

   /* @Override
    //mind a két végén meg kell nézni hogy null e és hogy eggyezik e a class-a
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != TrainerEquals.class) {
            return false;
        }
        if (this.name == null) {
            return false;
        }
        //return this.name.equals(((TrainerEquals) obj).getName()); van rövidítés
        return Objects.equals(this.name, ((TrainerEquals) obj).name) && this.year == (((TrainerEquals) obj).year);
    }

    @Override
    //itt ha egyezik a paraméter a két objektumnál akkor a hashcode ugyan az lesz
    public int hashCode() {
        return Objects.hash(name, year);
    }

    */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrainerEquals that = (TrainerEquals) o;
        return year == that.year &&
                name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year);
    }
}
