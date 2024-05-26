package tests;

import static org.junit.Assert.*;

import classes.ProdutoComTamanho;
import org.junit.Test;

import java.util.Objects;

public class ProdutoComTamanhoTest {
    @Test
    public void testEquals() {
        ProdutoComTamanho p1 = new ProdutoComTamanho("Produto 1", "001", 10.0, "M");
        ProdutoComTamanho p2 = new ProdutoComTamanho("Produto 2", "001", 20.0, "M");
        assertTrue(p1.equals(p2));
    }

    @Test
    public void testHashCode() {
        ProdutoComTamanho p = new ProdutoComTamanho("Produto", "001", 10.0, "M");
        assertNotEquals(Objects.hash("001", "M"), p.hashCode());
    }
}
