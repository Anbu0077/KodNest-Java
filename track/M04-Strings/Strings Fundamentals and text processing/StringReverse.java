
import java.util.Scanner;

public class StringReverse {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");

        String str = sc.next();

        char arr[] = str.toCharArray();

        char newArray[] = new char[arr.length];

        int j = newArray.length - 1;
        for (int i = 0; i < arr.length; i++) {
            newArray[j] = arr[i];
            j--;
        }

        String revStr = new String(newArray);

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + revStr);
    }
}
