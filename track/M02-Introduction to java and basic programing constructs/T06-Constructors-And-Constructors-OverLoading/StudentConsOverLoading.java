
class StudentConsOverLoading {

    String name;
    int age;
    double height;

    StudentConsOverLoading() {
        name = "Rani";
        age = 18;
        height = 5.5;
    }

    StudentConsOverLoading(String name) {
        this.name = name;
    }

    StudentConsOverLoading(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}
