package algorithmstransform;

import java.util.ArrayList;
import java.util.List;

public class Transformations {

    public List<String> toNames(List<Trainer> trainers) {
        List<String> name = new ArrayList<>();
        for (Trainer trainer: trainers) {
            name.add(trainer.getName());
        }
        return name;
    }

    public List<String> toNamesYearOfBirthBefore(List<Trainer> trainers, int year) {
        List<String> name = new ArrayList<>();
        for (Trainer trainer: trainers) {
            if (trainer.getYearOfBirth() < year) {
                name.add(trainer.getName());
            }
        }
        return name;
    }
}
