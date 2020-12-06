package methodchain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RobotTest {

    private Robot robot;

    @Test
    public void createRobot() {
        robot.go(5).rotate(6);
        assertEquals(5, robot.getDistance());
        assertEquals(6, robot.getAzimut());
    }
}
