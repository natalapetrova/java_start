package boolean_lesson;
/**
 * program
 */
public class program {

    public static void main(String[] args) {
        boolean flag1 = 123 <= 234;
        System.out.println(flag1);
        boolean flag2 = 123 >= 234 || flag1;
        System.out.println(flag2);
        boolean flag3 = flag1 ^ flag2;          // Логическая дизъюнкция
        System.out.println(flag3);
    }
}