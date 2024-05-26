package tests;

import classes.CarrinhoDeCompras;
import classes.Produto;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CarrinhoDeComprasTest {
    @Test
    public void testValorTotalDaCompra() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Produto p1 = new Produto("Produto 1", "001", 10.0);
        Produto p2 = new Produto("Produto 2", "002", 20.0);
        carrinho.adicionaProduto(p1, 1);
        carrinho.adicionaProduto(p2, 2);
        assertEquals(50, carrinho.valorTotalDaCompra(), 0.0001);
    }
}
