package algorithmsmax.trainer;

import java.util.List;

public class MaxAgeCalculator {

    public Trainer trainerWidthMaxAge(List<Trainer> trainers) {
        Trainer trainerWidthMaxAge = null;
        for (Trainer trainer: trainers) {
            if (trainerWidthMaxAge == null || trainer.getAge() > trainerWidthMaxAge.getAge()) {
                trainerWidthMaxAge = trainer;
            }
        }
        return trainerWidthMaxAge;
    }
}
