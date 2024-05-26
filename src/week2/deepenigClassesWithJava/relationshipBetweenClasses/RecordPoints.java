package week2.deepenigClassesWithJava.relationshipBetweenClasses;

public class RecordPoints {
    private CalculateBonus bonus;
    public RecordPoints(CalculateBonus calculateBonus) {
        this.bonus = calculateBonus;
    }

    public void createComment(User user) {
        user.points += bonus.bonus(user) * 3;
    }

    public void createTopic(User user) {
        user.points += bonus.bonus(user) * 5;
    }

    public void toLike(User user) {
        user.points += bonus.bonus(user);
    }
}
