package week3.test;

import org.junit.jupiter.api.Test;
import week3.Car;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {


    @Test
    void accelerate() {
        Car car = new Car();
        car.power = 10;
        car.accelerate();
        assertEquals(10, car.getSpeed());
    }

    @Test
    void brake() {
        Car car = new Car();
        car.speed = 10;
        car.brake();
        assertEquals(car.getSpeed(), 5);
    }

    @Test
    void brakeToZero() {
        Car car = new Car();
        car.speed = 10;

        for(int i=0; i < 4; i++)
            car.brake();

        assertEquals(0, car.getSpeed());
    }

    @Test
    void getSpeed() {
        Car car = new Car();
        car.speed = 10;
        assertEquals(10, car.getSpeed());
    }

    @Test
    void print() {
    }
}