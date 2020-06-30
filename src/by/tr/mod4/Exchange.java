package by.tr.mod4;

import java.util.Scanner;

public class Exchange {
    private final static double K_EUR_BYN = 2.49;
    private final static double K_USD_BYN = 2.24;
    private final static double K_BYN_EUR = 0.40;
    private final static double K_BYN_USD = 0.45;
    private final static double K_EUR_USD = 1.11;
    private final static double K_USD_EUR = 0.9;
    public static void main (String [] args) {
        double value, result;
        result = 0;
        String from,to;
        double kBynEur, kBynUsd, kEurByn, kUsdByn, kUsdEur,kEurUsd;

        from = readFromConsoleCurrency("Введите исходную валюту.");
        to = readFromConsoleCurrency("Введите итоговую валюту.");
        value = readFromConsoleAmount();
        result = exchangeFunction(from,to,value);
        System.out.println("Результат перевода "+ from.toUpperCase() + " в "+ to.toUpperCase() + " = " + result);
    }
    public static String readFromConsoleCurrency(String str)
    {
        String currency;
        Scanner sc = new Scanner(System.in);
        System.out.println(str + "Возможные значения: BYN, USD, EUR");
        currency = sc.next();
        while (!currency.toLowerCase().equals("byn") && !currency.toLowerCase().equals("usd") && !currency.toLowerCase().equals("eur"))
        {
            System.out.println("Вы ввели некорректное значение. Попробуйте снова. Возможные значения: BYN, USD, EUR");
            currency = sc.next();
        }
        return currency;
    }
    public static double readFromConsoleAmount()
    {
        double amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму");
        while (sc.hasNextDouble()==false){
            String str;
            str = sc.next();
            System.out.println("Вы ввели неверное/нечисловое значение суммы, попробуйте снова");
        }
        amount = sc.nextDouble();
        return amount;
    }
    public static double exchangeFunction(String from,String to, double value)
    {
        double result;
        result = 0;
        if (from.toLowerCase().equals("byn") && to.toLowerCase().equals("usd")){
            result = K_BYN_USD * value;
        }
        if (from.toLowerCase().equals("byn") && to.toLowerCase().equals("eur")){
            result = K_BYN_EUR * value;
        }
        if (from.toLowerCase().equals("usd") && to.toLowerCase().equals("byn")){
            result = K_USD_BYN * value;
        }
        if (from.toLowerCase().equals("usd") && to.toLowerCase().equals("eur")){
            result = K_USD_EUR * value;
        }
        if (from.toLowerCase().equals("eur") && to.toLowerCase().equals("usd")){
            result = K_EUR_USD * value;
        }
        if (from.toLowerCase().equals("eur") && to.toLowerCase().equals("byn")){
            result = K_EUR_BYN * value;
        }
        if (from.toLowerCase().equals(to.toLowerCase())) {
            result = value;
        }
        return result;
    }
}
// работа по модулю 4 зачтена
