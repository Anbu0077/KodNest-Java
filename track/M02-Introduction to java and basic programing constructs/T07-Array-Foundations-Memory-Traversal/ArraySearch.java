
public class ArraySearch {

    void search(int ref[], int key) {
        boolean found = false;
        for (int i = 0; i < ref.length; i++) {
            if (ref[i] == key) {
                found = true;
                System.out.println("Element found at index: " + i);
            }
        }
        if (found) {
            System.out.println("Element are found");
        } else {
            System.out.println("Element are not found");
        }
    }

}
