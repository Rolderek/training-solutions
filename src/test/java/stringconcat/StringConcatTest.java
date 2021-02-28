package stringconcat;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringConcatTest {

    @Test
    public void testConcat() {
        String s = "Jhon";
        //s = s.concat(" Doe");
        s = s + " Doe";
      //  System.out.println(s);
    //    assertThat(s, equalsTo("Jhon Doe"));

        String t = 1+ 2 + " value";
        System.out.println(t);
    }
}
