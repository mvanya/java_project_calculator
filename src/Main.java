import java.util.Scanner;

public class Main {
    private static int result;

    public static void main(String[] args) {

        boolean flag = true;
        Scanner scr = new Scanner(System.in);
        while (flag) {
            menuPrint();
            flag = menuChoice(scr.nextInt());

        }

    }

    public static void menuPrint() {
        System.out.println("1. Ввести пример");
        System.out.println("2. Продолжить работу с предыдущим ответом");
        System.out.println("3. Выход");
    }

    public static boolean menuChoice(int menu) {
        switch (menu) {
            case 1:
                newValue();
                return true;
            case 2:
                effectiveValue();
                return true;
            case 3:
                exit();
                return false;
            default:
                return true;
        }

    }

    public static void newValue() {
        Scanner scrNewValue = new Scanner(System.in);
        System.out.println("Введите два числа и арифметическую операцию: ");
        System.out.println("Пример: 1 + 1, где каждый символ ввводим через пробел");
        String operation = scrNewValue.nextLine();
        String[] symbols = operation.split(" ");
        switch (symbols[1]) {
            case "+":
                sum(Integer.parseInt(symbols[0]), Integer.parseInt(symbols[2]));
                break;
            case "-":
                sub(Integer.parseInt(symbols[0]), Integer.parseInt(symbols[2]));
                break;
            case "*":
                mult(Integer.parseInt(symbols[0]), Integer.parseInt(symbols[2]));
                break;
            case "/":
                div(Integer.parseInt(symbols[0]), Integer.parseInt(symbols[2]));
                break;
            case "!":
                System.out.println(fact(Integer.parseInt(symbols[0])));
                break;
            case "^":
                pow(Integer.parseInt(symbols[0]), Integer.parseInt(symbols[2]));
                break;
            case "?":
                comp(symbols[0], symbols[2]);
                break;
            default:
                System.out.println("Не известная операция, попробуй еще");
        }
    }

    public static void effectiveValue() {
        Scanner scrNewValue = new Scanner(System.in);
        System.out.println("Выберите арифметическую операцию и введите второре число: ");
        System.out.println("Пример: 1 2, где 1 - сложение, 2 - число, которое будем прибавлять.\nВажно, числа вводить через пробел!");
        menuEffectiveValue();
        String operation = scrNewValue.nextLine();
        String[] symbols = operation.split(" ");
        switch (symbols[0]) {
            case "1":
                sum(result, Integer.parseInt(symbols[1]));
                break;
            case "2":
                sub(result, Integer.parseInt(symbols[1]));
                break;
            case "3":
                mult(result, Integer.parseInt(symbols[1]));
                break;
            case "4":
                div(result, Integer.parseInt(symbols[1]));
                break;
            case "5":
                pow(result, Integer.parseInt(symbols[1]));
                break;
            case "0":
                menuPrint();
                break;
            default:
                System.out.println("Не известная операция, попробуй еще");
                result = Integer.parseInt(symbols[0]) + Integer.parseInt(symbols[2]);
        }

    }


    public static void sum(int a, int b) {
        var sum = a + b;
        System.out.println(sum);
        result = sum;
    }

    public static void sub(int a, int b) {
        var sub = a - b;
        System.out.println(sub);
    }

    public static void mult(int a, int b) {
        var mult = a * b;
        System.out.println(mult);
        result = mult;
    }

    public static void div(int a, int b) {
        int div = 0;
        if (b == 0) {
            System.out.println("На ноль делить нельзя!");
        } else {
            div = a / b;
        }
        System.out.println(div);
        result = div;
    }

    public static int fact(int a) {
        if (a != 1) {
            return a * fact(a - 1);
        } else {
            return 1;
        }
    }

    public static void pow(int a, int b) {
        var pow = Math.pow(a, b);
        System.out.println(pow);
        result = (int) pow;
    }


    public static void exit() {
        System.out.println("До новых встреч! (:");
    }

    public static void comp(String a, String b) {
        var integerA = Integer.parseInt(a);
        var integerB = Integer.parseInt(b);
        if (integerA > integerB) {
            System.out.printf("%d > %d", integerA, integerB);
        } else if (integerA < integerB) {
            System.out.printf("%d < %d", integerA, integerB);
        } else {
            System.out.printf("%d == %d",  integerA, integerB);
            System.out.println();
        }
    }

    public static void menuEffectiveValue() {
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        System.out.println("5. Возведение в степень");
        System.out.println("6. Сравнение");
        System.out.println("0. Назад");
    }
}

