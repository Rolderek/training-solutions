package stringbuilder;

import org.junit.jupiter.api.Test;

public class StringBuilderTest {

    @Test
    public void testAppend() {
        StringBuilder sb = new StringBuilder("Jhon");
        new StringBuilder(1000); //csak ha tudjuk hogy mennyi karaktert akarunk belerakno!
        for (int i = 0; i < 3; i++) {
            sb.append("Jhon Doe");
        }
        String s = sb.toString();
       // assertThat(s, equalTo());

        sb.insert(1, "xxx");
        System.out.println(sb);

        sb.delete(1, 3);
        System.out.println(sb);

        System.out.println(sb.reverse());
    }
}
