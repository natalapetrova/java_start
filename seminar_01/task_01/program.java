/*Задание №1+

В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида 
"Доброе утро, <Имя>!", если время от 05:00 до 11:59
"Добрый день, <Имя>!", если время от 12:00 до 17:59;
"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
*/

package seminar_01.task_01;

import java.time.LocalDateTime;
import java.util.Scanner;
 
public class program {
   
    public static void main(String[] args) {
           
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите имя ");
        String name = iScanner.nextLine();
        
        int hour =LocalDateTime.now().getHour();
        String text = "";

        if((hour >= 5) && (hour < 12)) text = "Доброе утро, ";
        if((hour >= 12) && (hour < 18)) text = "Добрый день, ";
        if((hour >= 18) && (hour < 23)) text = "Добрый вечер, ";
        else text = "Доброй ночи, ";



        System.out.printf("%s %s", text, name);
        iScanner.close();
    }
}