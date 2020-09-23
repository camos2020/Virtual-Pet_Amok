package VP.amokTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ShelterWorkerTest {

    ShelterWorker underTest = new ShelterWorker();
        String empName;
        String empShift;


    @Test
    public void shouldSayShelterWorkerName() {
        ShelterWorker underTest = new ShelterWorker();
        underTest.getEmpName("Shelly");
        Assertions.assertEquals("Shelly", underTest.getEmpName);
    }

    @Test
    public void shouldSayShelterWorkerShift() {
        ShelterWorker underTest = new ShelterWorker();
        underTest.getEmpShift("AM");
        assertEquals("AM", underTest.getEmpShift);
    }

    @Test
    public void hasCageBeenCleaned() {
        ShelterWorker underTest = new ShelterWorker();
        underTest.getCageCleanliness();
        assertThat(cageCleanliness (100));
         }






}
