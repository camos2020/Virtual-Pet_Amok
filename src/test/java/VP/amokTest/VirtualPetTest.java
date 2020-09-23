package VP.amokTest;

import VP_amok.VirtualPet;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class VirtualPetTest {
    VirtualPet underTest = new VirtualPet();
    String empName;
    String VirtualPetName;


    @Test
    public void shouldSayName() {
        VirtualPet underTest = new VirtualPet();
        underTest.setName("Fido");
        assertEquals("Fido", underTest.getName());
    }

    @Test
    public void shouldSayHunger() {
        VirtualPet underTest = new VirtualPet();
        int result = underTest.getHungerLevel();
        assertEquals(100, result);
    }

    @Test
    public void shouldSayThirst() {
        VirtualPet underTest = new VirtualPet();
        int result = underTest.getThirstLevel();
        assertEquals(100, result);
    }

    @Test
    public void shouldSayBoredom() {
        VirtualPet underTest = new VirtualPet();
        int result = underTest.getBoredomeLevel();
        assertEquals(100, result);
    }

    @Test
    public void shouldSaywellness() {
        VirtualPet underTest = new VirtualPet();
        int result = underTest.getWellnessLevel();
        assertEquals(100, result);
    }

    @Test
    public void shouldSaysleepLevel() {
        VirtualPet underTest = new VirtualPet();
        int result = underTest.getSleepLevel();
        assertEquals(100, result);
    }

}

