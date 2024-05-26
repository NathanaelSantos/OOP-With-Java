package week5;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(3);
        stack.pileUp("Nathan");
        stack.pileUp("Carlos");
        stack.pileUp("Ricardo");

        System.out.println(stack.topOfThePile());
        System.out.println(stack.stackSize());


        System.out.println("=================================");
        System.out.println(stack.unstack());
        System.out.println(stack.topOfThePile());
        System.out.println(stack.stackSize());
    }
}
