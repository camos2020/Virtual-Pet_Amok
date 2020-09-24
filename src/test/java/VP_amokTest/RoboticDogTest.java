package VP_amokTest;

import VP_amok.RoboticDog;
import org.assertj.core.internal.bytebuddy.matcher.ElementMatcher;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RoboticDogTest {
    RoboticDog underTest = new RoboticDog();
    private String empName;


    @Test
    public void oilLevelShouldIncrease() {
        RoboticDog roboticDog = new RoboticDog();
        int oilLevelBefore = roboticDog.getOilLevel1();
        underTest.getOilLevel1(roboticDog);
        //fillOil(roboticVP);
        int oilLevelAfter = roboticDog.getOilLevel1();
        assertThat(oilLevelBefore - oilLevelAfter, is(60));

    }

    private void assertThat(int i, ElementMatcher.Junction<Object> objectJunction) {
    }


}




