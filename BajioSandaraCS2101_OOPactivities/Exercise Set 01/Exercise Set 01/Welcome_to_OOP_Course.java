import java.util.Scanner;
class Welcome_to_OOP_Course {
    public static void main(String[]args){
        System.out.println("Welcome to CS 211: Object-oriented Programming!");
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("This course will be fun, " +name + "!");
        scanner.close();
    }
}
