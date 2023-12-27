package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1.Создайте final массив чисел. Увеличьте каждый его элемент вдвое.\n");
        final int []uno = new int[10];
        Random random = new Random();
        for (int i = 0; i < uno.length; i++){
            uno[i] = random.nextInt(12, 87);
            System.out.print("[" + i + ":" + uno[i] + "]");
            uno[i] = uno[i] * 2;
            System.out.print("[" + i + ":" + uno[i] + "]");
        }


      System.out.println("\n 2.Найдите наибольшее число из трех, используя только final-переменные.\n");

        final int a = 126;
        final int b = 34;
        final int c = 84;
      final int[] dos = new int[3];
      dos[0] = a;
      dos[1] = b;
      dos[2] = c;
      int max = 0;
      for(int i = 0; i < dos.length; i++){
          if(max < dos[i]){
              max = dos[i];
          }
      } System.out.println(max);


      /*  System.out.println("3.Измените final переменную. Получилось?");
        final int a = 126;
        a = 23;
        System.out.println(a);
 */

        System.out.println("\n 4.Пользователь вводит слово, подсчитайте количество уникальных букв в этом слове." +
                " (Повторяющиеся считаем за одну, в слове окно - три уникальные буквы, окн)." +
                " Используйте только final-переменные. Подсказка: используйте массив.");

        final Scanner sc = new Scanner(System.in);
        System.out.print("Введите слово: ");
        final String str = sc.next();
        final char[] ch = str.toCharArray();
        Arrays.sort(ch);

        System.out.println(ch);

        final char[] buf = {0};
        final int[] counter = {0};
        for (final char s : ch) {
            if (buf[0] != s) {
                buf[0] = s;
                counter[0]++;
            }
        }
        System.out.println(counter[0]);
    }
}
