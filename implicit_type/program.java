package implicit_type;

public class program {
    public static void main(String[] args) {
        var i = 123;                            // Если невозможно определить тип можно воспользоваться var
        System.out.println(i);
        var d = 123.456;
        System.out.println(d);
        System.out.println(getType(i));
        System.out.println(getType(d));
        d = 1022;
        System.out.println(d);
    }
    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }
}
