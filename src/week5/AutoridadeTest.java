import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutoridadeTest {
    @Test
    public void testInformal() {
        Autoridade autoridade = new Autoridade("João", "Silva", new Informal());
        assertEquals("João", autoridade.getTratamento());
    }

    @Test
    public void testRespeitosoMasculino() {
        Autoridade autoridade = new Autoridade("João", "Silva", new Respeitoso(true));
        assertEquals("Sr. Silva", autoridade.getTratamento());
    }

    @Test
    public void testRespeitosoFeminino() {
        Autoridade autoridade = new Autoridade("Maria", "Silva", new Respeitoso(false));
        assertEquals("Sra. Silva", autoridade.getTratamento());
    }

    @Test
    public void testComTitulo() {
        Autoridade autoridade = new Autoridade("João", "Silva", new ComTitulo("Doutor"));
        assertEquals("Doutor João Silva", autoridade.getTratamento());
    }
}