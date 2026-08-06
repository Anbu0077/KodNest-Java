
public class NestedWhileLoop {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            int j = 1;
            while (j <= 5) {
                System.err.println(j);
                j++;
            }
            System.err.println();
            i++;
        }
    }
}
