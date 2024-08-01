//2. Write a Java program that throws an exception and catch it using a try-catch block.


public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        // A string that cannot be converted to an integer
        String invalidNumber = "abc";

        try {
            // Attempt to convert the string to an integer
            // This line will throw a NumberFormatException
            int number = Integer.parseInt(invalidNumber);
            // If the conversion is successful, print the number
            System.out.println("The number is: " + number);
        } catch (NumberFormatException e) {
            // This block will execute if a NumberFormatException is thrown
            // Print an error message and stack trace
            System.out.println("Caught exception: " + e.getMessage());
            e.printStackTrace();
        }

        // This line will execute whether an exception was thrown or not
        System.out.println("Program continues after the catch block.");
    }
}

/*
Output

Caught exception: For input string: "abc"
java.lang.NumberFormatException: For input string: "abc"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:588)
        at java.base/java.lang.Integer.parseInt(Integer.java:685)
        at ExceptionHandlingDemo.main(ExceptionHandlingDemo.java:12)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at jdk.compiler/com.sun.tools.javac.launcher.SourceLauncher.execute(SourceLauncher.java:264)
        at jdk.compiler/com.sun.tools.javac.launcher.SourceLauncher.run(SourceLauncher.java:153)
        at jdk.compiler/com.sun.tools.javac.launcher.SourceLauncher.main(SourceLauncher.java:78)
Program continues after the catch block.
*/
