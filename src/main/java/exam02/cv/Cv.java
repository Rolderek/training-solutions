package exam02.cv;

import java.util.ArrayList;
import java.util.List;

public class Cv {

    private String name;
    private List<Skill> skill = new ArrayList<>();

    public Cv(String name) {
        this.name = name;
    }

    public Cv(String name, List<Skill> skill) {
        this.name = name;
        this.skill = skill;
    }

    public Cv(List<Skill> skill) {
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public List<Skill> getSkills() {
        return skill;
    }

    /*public List<Skill> addSkill(Skill skills) {
        skill.add(skills);
        this.skill = skill;
    }
*/

    public static void main(String[] args) {
        Cv cv = new Cv("Laci");
        System.out.println(cv);
    }



}
