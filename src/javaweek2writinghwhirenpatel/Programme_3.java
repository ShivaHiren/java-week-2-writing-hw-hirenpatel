package javaweek2writinghwhirenpatel;

/*Write a Java Programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static method inside the print statement.
3.5 Declare the main method.
3.6 Call both instance and static methods into the main methid and run the Programme.
 */
public class Programme_3 {
    //3.1 Declare one instance and one static variables.
    String name = "Prime";
    static String surname = "Testing";

    //3.2 Declare instance method
    //3.4 Call both instance and static variables into both instance and static method inside the print statement.
    public static void instanceMethod() {
        System.out.println();
        System.out.println(Programme_3.surname);
    }

    //3.3 Declare one static method
    //3.4Call both instance and static variables into both instance and static method inside the print statement.
    public static void staticMethod() {
        Programme_3 programme3 = new Programme_3();
        System.out.println(programme3.name);
        System.out.println(surname);
    }

    //3.5 Declare the Main method.
    //3.6 Call Both instance and static methods into the main method and run the programme.
    public static void main(String[] args) {
        Programme_3 programme_3 = new Programme_3();
        Programme_3.instanceMethod();
        staticMethod();

    }
}

