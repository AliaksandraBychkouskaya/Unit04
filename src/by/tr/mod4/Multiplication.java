package by.tr.mod4;// минимум 4 уровня в пакетах

import java.util.Scanner;

public class Multiplication {

    public static void main(String [] args) {
    int a, b, result,expectedResult;// соблюдайте, пожалуйста, форматирование и code convention
    a = readFromConsole("Введите первый множитель");
    b = readFromConsole("Введите второй множитель");
    expectedResult = a * b;
    result = readFromConsole("Чему равно " + a + " * " + b + "?");
    while (!checkerMultiplication(result,expectedResult))
    {
        System.out.println("Попробуйте снова. Вы ввели неверное значение");
        result = readFromConsole("Чему равно " + a + " * " + b + "?");
    }
        System.out.println("Верно");
}
    public static int readFromConsole (String mes) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println(mes);
        System.out.print(">");
        while (sc.hasNextInt() == false) {
            System.out.println("Попробуйте снова. Вы ввели не int значение. ");
            System.out.print(">");
            String str = sc.nextLine();
        }
        x = sc.nextInt();
        sc.nextLine();

        return x;
    }
    public static boolean checkerMultiplication (int x, int y)
    {
        if (x == y) {
        return true;
        }
        else {
        return false;
        }
    }

}

