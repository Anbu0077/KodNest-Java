
public class EmployeeApplication {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 22;
        e1.name = "Raja";
        System.out.println(e1.id);
        System.out.println(e1.name);
        e1.work();
        e1.completion();

        Employee e2;
        e2 = e1;
        e2.id = 23;
        e2.name = "Raju";
        System.out.println(e2.id);
        System.out.println(e2.name);
        System.out.println(e1.id);
        System.out.println(e1.name);

        e2.work();
        e2.completion();

    }

}
