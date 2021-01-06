package exam02.cv;

public class SkillNotFoundException extends RuntimeException {

    public SkillNotFoundException() {

    }

    public SkillNotFoundException(String message, String skillNotFound) {
        super(message);

    }

}
