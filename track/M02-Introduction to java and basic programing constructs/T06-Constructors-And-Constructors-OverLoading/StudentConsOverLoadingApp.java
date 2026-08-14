
public class StudentConsOverLoadingApp {

    public static void main(String args[]) {
        StudentConsOverLoading s1 = new StudentConsOverLoading();

        s1.display();
        StudentConsOverLoading s2 = new StudentConsOverLoading("Ramu");

        s2.display();
        StudentConsOverLoading s3 = new StudentConsOverLoading("Raja", 22, 6.6);

        s3.display();
    }
}
