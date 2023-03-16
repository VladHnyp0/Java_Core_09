package ua.lviv.lgs.calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception, MyException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type first int num");
        int a = scanner.nextInt();
        scanner = new Scanner(System.in);
        System.out.println("Type second int num");
        int b = scanner.nextInt();

        Methods calculate = new Methods(a, b);

        calculate.plus();
        calculate.minus();
        calculate.multiple();
        calculate.divided();
    }
}
