package week2.deepenigClassesWithJava.relationshipBetweenClasses;

public class CalculateBonus {
    public int bonusDay = 1;

    public int bonus(User user) {
        int multiplicator = bonusDay;

        if(user.vip)
            multiplicator *= 5;
        return multiplicator;
    }
}
