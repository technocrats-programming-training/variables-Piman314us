public class Main {
    public static void main(String[] args) {
        // DO NOT CHANGE 
        String firstName = args[0];
        String lastName = args[1];
        int age = 0;
        try {
            age = Integer.parseInt(args[2]);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
    
    
        // Print out the following string: "Hello, I am <firstName> <lastName>, and I am <age> years old"
 System.out.println("Hello, I am " + firstName + " " + lastName + ", and i am " + age + " years old");
        // Print out whether age is even
if (age%2 == 1) {
  System.out.println("Age Is Odd");
} else {
  System.out.println("Age Is Even");
}
        // Print out whether firstName equals lastName
if (firstName == lastName) {
  System.out.println("firstName Equals lastName");
} else {
  System.out.println("firstName does not equal lastName");
}
        // Print out whether age is greater than 0
      if (age > 0) {
        System.out.println("age is greater than 0");
      } else {
        System.out.println("age is less than 0");
      }
}}