package week3;

import org.junit.*;
import org.w3c.dom.ls.LSOutput;

import static org.junit.Assert.*;

public class TestMethodOrderTest {

    @Test
    public void processPayment() {
        System.out.println("3");
    }

    @Before
    public void reservationConfirmed() throws Exception {
        System.out.println("2");
    }

    @After
    public void roomAvailability() throws Exception {
        System.out.println("4");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("5");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("1");
    }
}