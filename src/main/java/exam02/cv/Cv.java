package exam02.cv;

import java.util.ArrayList;
import java.util.List;

public class Cv {

    private String name;
    private List<Skill> skills;

    public Cv(String name) {
        this.name = name;
        skills = new ArrayList<>();
    }

    public Cv(String name, List<Skill> skill) {
        this.name = name;
        this.skills = skill;
    }


    public String getName() {
        return name;

    }

    public List<Skill> getSkills() {
        return new ArrayList<>(skills);
    }

    public void addSkills(String... nSkill) {
        for (String i: nSkill) {
            String[] j = i.split(" \\(");
            this.skills.add(new Skill(j[0], Integer.parseInt(j[1].replace(")", ""))));
        }
    }

    public int findSkillLevelByName(String skillN) {
        for (Skill i: skills) {
            if (i.getName().equals(skillN)) {
                return i.getLevel();
            }
        }
        throw new SkillNotFoundException("Nem található a keresett elem." + skillN);
    }

    /*public boolean findSkillByName(String stringToFind) {
        for (Skill skill: skills) {
            if (skill.getName().contains(stringToFind)) {
                return true;
            }
        }
        return false;
    }



     */




}
