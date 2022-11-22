package type_of_char;

/**
 * program
 */
public class program {

    public static void main(String[] args) {
        char ch = '1';
        System.out.println(Character.isDigit(ch));      // true
        ch = 'a';
        System.out.println(Character.isDigit(ch));      // false
    }
}