package methodchain;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RobotTest {

    private Robot robot;

    @Test
    public void createRobot() {
        robot.go(5).rotate(6);
        assertEquals(5, robot.getDistance());
        assertEquals(6, robot.getAzimut());
    }
}
