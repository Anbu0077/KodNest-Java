
public class InBuildMethods3 {

    public static void main(String args[]) {
        String s = "  Java   ";
        String res = s.trim();
        System.out.println(res);

        String s1 = new String("Raja");
        String s2 = new String("Rani");
        String s3 = s1.concat(s2);
        System.out.println(s3);

        String s4 = new String("Raja");
        String s5 = new String("Rani");
        String s6 = s4 + s5;
        System.out.println(s6);

        String s7 = "Java";
        String s8 = s7.toUpperCase();
        System.out.println(s8);
    }
}
