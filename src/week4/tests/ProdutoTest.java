package tests;
import classes.Produto;
import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ProdutoTest {
    @Test
    public void testEquals() {
        Produto p1 = new Produto("Produto 1", "001", 10.0);
        Produto p2 = new Produto("Produto 2", "001", 20.0);
        assertTrue(p1.equals(p2));
    }

    @Test
    public void testHashCode() {
        Produto p = new Produto("Produto", "001", 10.0);
        assertEquals(Objects.hash("001"), p.hashCode());
    }
}