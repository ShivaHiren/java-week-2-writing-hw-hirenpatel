package javaweek2writinghwhirenpatel;
/* Write a Java Programme using following steps.
2.1 Declare two static variables
2.2 Declare one static method
2.3 Call both static variable into the static method inside the print statement.
2.4 Declare the main method.
2.5 Call the static method into the main method and run the Programme
 */
public class Programme_2 {
    //2.1 Declare two static variables
    static int a = 100;
    static int b = 200;

    //2.2Declare one static method
    //Call both static variable into the static method inside the print statement.
    public static void staticMethod() {
        System.out.println(a);
        System.out.println(b);
    }
    //2.4 Declare the main method.
    //2.5 Call the static method into the main method and run the Programme.
    public static void main(String[] args) {
        staticMethod();
    }
}
