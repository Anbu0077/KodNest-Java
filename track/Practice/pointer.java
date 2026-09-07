
import java.util.Scanner;

public class pointer {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int arr2[] = new int[arr1.length + 1];
        for (int i = 0; i < n; i++) {
            arr2[i] = arr1[i];
        }
        arr2[arr2.length - 1] = 77;
        for (int i : arr2) {
            System.out.println(i);
        }

    }
}
