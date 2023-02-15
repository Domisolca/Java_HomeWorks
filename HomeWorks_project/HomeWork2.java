package HomeWorks_project;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи 1-ю строку: ");
        StringBuilder lineOne = new StringBuilder(scanner.nextLine());

        System.out.println("Введи 2-ю строку: ");
        StringBuilder lineTwo = new StringBuilder(scanner.nextLine());

        if (lineOne.toString().contains(lineTwo.toString())) {
            System.out.println("Первая строка содержит: " + lineTwo.toString());
        }

        StringBuilder lineTwoR = lineTwo.reverse();

        if (lineOne.toString().contains(lineTwoR.toString())) {
            System.out.println("Первая строка содержит: " + lineTwoR.toString());
        }

        System.out.println("Введи 1-е число: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.println("Введи 2-е число: ");
        int b = Integer.parseInt(scanner.nextLine());

        StringBuilder res = new StringBuilder("");
        System.out.println(res.append(a).append(" + ").append(b).append(" = ").append(a + b));

        res = new StringBuilder("");
        System.out.println(res.append(a).append(" - ").append(b).append(" = ").append(a - b));

        res = new StringBuilder("");
        System.out.println(res.append(a).append(" * ").append(b).append(" = ").append(a * b));

        StringBuilder res1 = new StringBuilder(res.toString());

        int startIndex = res.indexOf("=");
        res.insert(startIndex + 1, "равно");
        res.deleteCharAt(startIndex);

        System.out.println(res);

        res1.replace(startIndex, startIndex + 1, "равно");

        System.out.println(res1);
    }
}
