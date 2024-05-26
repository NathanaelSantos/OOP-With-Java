package week2.deepenigClassesWithJava.relationshipBetweenClasses.Test;

import week2.deepenigClassesWithJava.relationshipBetweenClasses.CalculateBonus;
import week2.deepenigClassesWithJava.relationshipBetweenClasses.RecordPoints;
import week2.deepenigClassesWithJava.relationshipBetweenClasses.User;

import static org.junit.Assert.*;

public class RecordPointsTest {

    @org.junit.Test
    public void createTopic() {

        User user = new User();
        user.name = "Nathan";

        new RecordPoints(new CalculateBonus()).createTopic(user);
        assertEquals(user.points, 5);
    }

    @org.junit.Test
    public void createTopicVip() {

        User user = new User();
        user.name = "Nathan";
        user.vip = true;

        new RecordPoints(new CalculateBonus()).createTopic(user);
        assertEquals(user.points, 25);
    }


    @org.junit.Test
    public void toLike() {
        User user = new User();
        user.points = 5;

        new RecordPoints(new CalculateBonus()).toLike(user);
        assertEquals(user.points, 6);
    }

    @org.junit.Test
    public void createTopicVipBonus() {
        User user = new User();
        user.vip = true;
        user.points = 2;

        CalculateBonus calculateBonus = new CalculateBonus();
        calculateBonus.bonusDay = 2;

        new RecordPoints(calculateBonus).createTopic(user);
        assertEquals(user.points, 52);

        User user1 = new User();
        user1.vip = true;

        CalculateBonus calculateBonus1 = new CalculateBonus();
        calculateBonus1.bonusDay = 2;

        new RecordPoints(calculateBonus).createTopic(user1);
        assertEquals(user1.points, 50);
    }

}