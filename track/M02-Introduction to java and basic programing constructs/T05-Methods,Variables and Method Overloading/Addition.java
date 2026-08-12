
class Addition {

    public static void main(String args[]) {
        CalApplication cl = new CalApplication();
        System.out.println(cl.add(10, 20));
        System.out.println(cl.add(10, 2.5));
        System.out.println(cl.add(10.5, 20));
        System.out.println(cl.add(10.5, 20.5));
        System.out.println(cl.add(10, 20, 30));
        System.out.println(cl.add(10.2, 20.4, 30.6));
        System.out.println(cl.add(10, 20.4, 30.6));
        System.out.println(cl.add(10.2, 20, 30.6));
        System.out.println(cl.add(10.2, 20.4, 30));
        System.out.println(cl.add(10, 20, 30.6));
        System.out.println(cl.add(10.2, 20, 30));

    }
}
