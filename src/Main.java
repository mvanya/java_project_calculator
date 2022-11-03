import java.util.Scanner;

public class Main {
    private static int result;

    public static void main(String[] args) {

        boolean flag = true;
        Scanner scr = new Scanner(System.in);
        while (flag) {
            menuPrint();
            flag = menuChoice(scr.nextInt());
            System.out.println(result);

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
                result = sum(Integer.parseInt(symbols[0]), Integer.parseInt(symbols[2]));
                break;
            case "-":
                result = sub(Integer.parseInt(symbols[0]), Integer.parseInt(symbols[2]));
                break;
            case "*":
                result = mult(Integer.parseInt(symbols[0]), Integer.parseInt(symbols[2]));
                break;
            case "/":
                result = div(Integer.parseInt(symbols[0]), Integer.parseInt(symbols[2]));
                break;
            case "!":
                result = fact(Integer.parseInt(symbols[0]));
                break;
            case "^":
                result = pow(Integer.parseInt(symbols[0]), Integer.parseInt(symbols[2]));
                break;
            case "?":
                result = comp(Boolean.parseBoolean(Integer.parseInt(symbols[0]), Boolean.parseBoolean(String.valueOf(Integer.parseInt(symbols[2])))));
            default:
                System.out.println("Не известная операция, попробуй еще");
                result = Integer.parseInt(symbols[0]) + Integer.parseInt(symbols[2]);
        }
    }
        public static void effectiveValue () {
            Scanner scrNewValue = new Scanner(System.in);
            System.out.println("Выберите арифметическую операцию и введите второре число: ");
            System.out.println("Пример: 1 2, где 1 - сложение, 2 - число, которое будем прибавлять.\nВажно, числа вводить через пробел!");
            menuEffectiveValue();
            String operation = scrNewValue.nextLine();
            String[] symbols = operation.split(" ");
            switch (symbols[0]) {
                case "1":
                    result = sum(result, Integer.parseInt(symbols[1]));
                    break;
                case "2":
                    result = sub(result, Integer.parseInt(symbols[1]));
                    break;
                case "3":
                    result = mult(result, Integer.parseInt(symbols[1]));
                    break;
                case "4":
                    result = div(result, Integer.parseInt(symbols[1]));
                    break;
                case "5":
                    result = pow(result, Integer.parseInt(symbols[1]));
                    break;
                case "0":
                    menuPrint();
                    break;
                default:
                    System.out.println("Не известная операция, попробуй еще");
                    result = Integer.parseInt(symbols[0]) + Integer.parseInt(symbols[2]);
            }

        }


        public static int sum(int a, int b) {
            return a + b;
        }

        public static int sub(int a, int b) {
            return a - b;
        }

        public static int mult(int a, int b) {
            return a * b;
        }

        public static int div(int a, int b) {
        int div = 0;
        if (b == 0) {
                System.out.println("На ноль делить нельзя!");
            } else {
                div = a / b;
            }
            return div;
        }

        public static int fact(int a) {
            if (a != 1) {
                return a * fact(a - 1);
            } else {
                return 1;
            }
        }

        public static int pow(int a, int b) {
            return(int)Math.pow(a, b);
        }



        public static void exit () {
            System.out.println("До новых встреч! (:");
        }

        public static boolean comp(int a, int b) {
        if (a > b) {
            return true;
        } else if ( a < b) {
            return true;
        } else {
            return true;
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

