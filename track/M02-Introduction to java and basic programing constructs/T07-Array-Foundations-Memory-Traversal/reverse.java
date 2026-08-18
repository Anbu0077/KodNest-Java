
import java.util.Scanner;

public class reverse {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter the array Elements : ");
        for (int i = a.length - 1; i >= 0; i--) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array Elements are : ");
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println(a[i]);
        }
    }
}
