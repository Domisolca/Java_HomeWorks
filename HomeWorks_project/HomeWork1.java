package HomeWorks_project;

import java.util.Random;

/**
 * HomeWork1
 */
public class HomeWork1 {

    public static void main(String[] args) {

        Random random = new Random();
        int i = random.nextInt(2000);

        System.out.println("Cлучайное целое число в диапазоне от 0 до 2000: " + i);

        int n = 0;
        int tmp = i;
        if (i != 0) {
            n = 1;
            tmp = tmp / 2;
            while (tmp != 0) {
                tmp = tmp / 2;
                n++;
            }
        }

        System.out.println("Номер старшего значащего бита числа " + i + " = " + n);

        if (n != 0) {
            int length1 = 0;
            for (int j = i; j <= Short.MAX_VALUE; j++) {
                if (j % n == 0)
                    length1++;
            }

            int[] m1 = new int[length1];
            int k = 0;
            for (int j = i; j <= Short.MAX_VALUE; j++) {
                if (j % n == 0) {
                    m1[k] = j;
                    k++;
                }
            }
            System.out.print("Массив m1: ");
            for (int j = 0; j < m1.length; j++) {
                System.out.print(m1[j] + "; ");    
            }

            int length2 = 0;
            for (int j = Short.MIN_VALUE; j <= i; j++) {
                if (j % n != 0)
                    length2++;
            }

            int[] m2 = new int[length2];
            k = 0;
            for (int j = Short.MIN_VALUE; j <= i; j++) {
                if (j % n != 0) {
                    m2[k] = j;
                    k++;
                }
            }
            System.out.print("Массив m2: ");
            for (int j = 0; j < m2.length; j++) {
                System.out.print(m2[j] + "; ");    
            }
        }
    }
}