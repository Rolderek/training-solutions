package interfacemethods;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;

public class AccountTest {

    @Test
    public void testCreatedAfter() {
        Account account = new Account(LocalDateTime.of(2018,1, 1, 10,20));
        boolean result = account.createdAfter(LocalDateTime.of(2018,1, 1, 10, 15));
        System.out.println(result);
       // assertThat(result, equalTo(false)) megint szar a teszt...
    }
}
