
public class ArrayFrequence {

    void count(int arr[], int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
            }
        }
        System.out.println("The count of " + key + " is " + count);
    }
}
