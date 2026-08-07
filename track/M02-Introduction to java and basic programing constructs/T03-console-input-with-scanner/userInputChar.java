
import java.util.Scanner;

public class userInputChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        char ch = sc.next().charAt(2);
        System.err.println(ch);
    }
}
