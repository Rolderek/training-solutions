package exam02.cv;

public class SkillNotFoundException extends RuntimeException {

    private String skillNotFound;

    public SkillNotFoundException(String message, String skillNotFound) {
        super(message);
        this.skillNotFound = skillNotFound;
    }

    public String getSkillNotFound() {
        return skillNotFound;
    }
}
