/*Задание №2

Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.

*/

package seminar_01.task_02;

/**
 * program
 */
public class program {

    public static void main(String[] args) {
        int[] arr = new int[]{1,1,0,1,1,1,0,0,1,1,1,1,1,1,1,1};
        int count = 0;
        int maxcount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count += 1;
            if (maxcount < count) {
                maxcount = count;
                }
            } else {
                count = 0;
            }
        }
        System.out.println(maxcount);

    }
}