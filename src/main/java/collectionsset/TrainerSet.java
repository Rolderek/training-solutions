package collectionsset;

import java.util.HashSet;
import java.util.Set;
import java.util.Collection;
import java.util.Objects;

public class TrainerSet {

    private String name;

    public TrainerSet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "TrainerSet(" + "name=" + name + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrainerSet that = (TrainerSet) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
