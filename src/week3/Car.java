package week3;

public class Car {
    public int power;
    public int speed;
    public String name;

    public void accelerate(){
        speed += power;
    }

    public void brake(){
        speed = speed / 2;
    }

    public int getSpeed() {
        return speed;
    }

    public void print(){
        System.out.println("The car " + name + " is at a speed of " + getSpeed() + " km/h");
    }
}
