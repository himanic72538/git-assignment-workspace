import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.println("Hey there Friend !, " + username );
        System.out.println("Good Morning, " + username + "!");
	System.out.println("BY Developer B");
        scanner.close();
    }
}
