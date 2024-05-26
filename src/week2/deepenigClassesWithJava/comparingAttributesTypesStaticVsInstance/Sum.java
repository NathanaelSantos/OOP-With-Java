package week2.deepenigClassesWithJava.comparingAttributesTypesStaticVsInstance;

public class Sum {
    String name;
    int valueInstance = 0;
    static int valueStatic = 0;

    void sum() {
        valueInstance++;
        valueStatic++;
    }

    void printSum() {
        System.out.println(" Sum " + name + ": instance = " + valueInstance + " and static = " + valueStatic);
    }
}
