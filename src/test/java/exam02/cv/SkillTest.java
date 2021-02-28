package exam02.cv;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SkillTest {

    @Test
    public void testCreate() {
        Skill skill = new Skill("programming", 3);
        assertEquals("programming", skill.getName());
        assertEquals(3, skill.getLevel());
    }
}