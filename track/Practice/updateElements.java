
import java.util.Scanner;

public class updateElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int element = sc.nextInt();
        int index = sc.nextInt();
        int arr2[] = new int[n + 1];
        for (int i = 0; i < index; i++) {
            arr2[i] = arr[i];
        }
        arr2[index] = element;
        for (int i = index; i < n; i++) {
            arr2[i + 1] = arr[i];
        }
        for (int i : arr2) {
            System.out.println(i);
        }

    }
}
