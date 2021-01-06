package exam02.cv;

import java.util.ArrayList;
import java.util.List;

public class Cv {

    private String name;
    private List<Skill> skills = new ArrayList<>();

    public Cv(String name) {
        this.name = name;
    }

    public Cv(String name, List<Skill> skill) {
        this.name = name;
        this.skills = skill;
    }


    public String getName() {
        return name;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void addSkills(List<Skill> nSkill) {
        for (Skill skill: nSkill) {
            skills.add(skill);
        }

    }

    public void findSkillLevelByName(Cv c, String a) {
        if (c.getSkills() == null || c.getSkills().isEmpty()) {
            throw new SkillNotFoundException("Skill not found", a);
        }

    }






}
