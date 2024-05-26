package tests;

import embaralhadores.Inverter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InverterTest {
    @Test
    public void testEmbaralhar() {
        Inverter inverter = new Inverter();

        assertEquals("arvalap", inverter.embaralhar("palavra"));
        assertNotEquals("palavra", inverter.embaralhar("palavra"));
        assertEquals(7, inverter.embaralhar("palavra").length());
        assertEquals(inverter.embaralhar("palavra"), inverter.embaralhar("palavra"));
    }
}
