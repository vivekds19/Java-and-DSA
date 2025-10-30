// Java Program 
// Calling Multiple Methods

class function_2 {
    public static void main(String[] args) {
        // Main method starts
        System.out.println("Main Begins");

        // Calling fun1 method
        fun1();

        // Main method ends
        System.out.println("Main Ends");
    }

    // fun1 method that calls fun2
    public static void fun1() {
        // Printing message when fun1 starts
        System.out.println("fun1 Begins");

        // Calling fun2 method
        fun2();

        // Printing message when fun1 ends
        System.out.println("fun1 Ends");
    }

    // fun2 method that prints a message
    public static void fun2() {
        // Printing message inside fun2
        System.out.println("Inside fun2");
    }
}