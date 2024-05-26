package week2.deepenigClassesWithJava.comparingAttributesTypesStaticVsInstance;

public class Main {
    public static void main(String[] args) {
        Sum sum1 = new Sum();
        sum1.name = "Sum 1";

        Sum sum2 = new Sum();
        sum2.name = "Sum 2";

        Sum sum3 = new Sum();
        sum3.name = "Sum 3";

        for(int i = 0; i < 3; i++){
            sum1.sum();
            sum2.sum();
            sum3.sum();
        }
        sum3.sum();
        sum1.printSum();
        sum2.printSum();
        sum3.printSum();
    }
}
