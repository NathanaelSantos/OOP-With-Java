package tests;

import embaralhadores.Aleatorio;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AleatorioTest {
    @Test
    public void testEmbaralhar() {
        Aleatorio aleatorio = new Aleatorio();
        String palavra = "palavra";
        String embaralhada = aleatorio.embaralhar(palavra);

        assertEquals(palavra.length(), embaralhada.length());

        for (char c : palavra.toCharArray()) {
            assertTrue(embaralhada.contains(String.valueOf(c)));
        }

        assertNotEquals(palavra, embaralhada);

        String embaralhada2 = aleatorio.embaralhar(palavra);
        assertNotEquals(embaralhada, embaralhada2);
    }
}
