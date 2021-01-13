package exceptionmulticatch;

import activity.Track;
import algorithmstransform.Trainer;

public class TrainerParser {

    public static final String SEAPRATOR = ";";

    public Trainer parse(String line) {
        try {
            String[] fields = line.split(SEAPRATOR);
            return new Trainer(fields[0], Integer.parseInt(fields[1]));
        }
        catch ( NullPointerException | IllegalArgumentException |IndexOutOfBoundsException e ) {
            throw new ParserException("Invalid line: " + line, e);
        }
    }
}
