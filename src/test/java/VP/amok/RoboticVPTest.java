package VP.amok;

import org.assertj.core.internal.bytebuddy.matcher.ElementMatcher;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RoboticVPTest {
    RoboticVP underTest = new RoboticVP();
    private String empName;


    @Test
    public void oilLevelShouldIncrease() {
        RoboticVP roboticVP = new RoboticVP();
        int oilLevelBefore = roboticVP.getOilLevel1();
        underTest.fillOil(roboticVP);
        int oilLevelAfter = roboticVP.getOilLevel1();
        assertThat(oilLevelBefore - oilLevelAfter, is(60));

    }

    private void assertThat(int i, ElementMatcher.Junction<Object> objectJunction) {
    }

    @Test
    public void shouldSayShelterWorkername() {
        ShelterWorker underTest = new ShelterWorker();
        underTest.getEmpName("Shelly");
        assertEquals("Shelly", underTest.getEmpName);
    }
}



