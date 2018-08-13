/*
 * @author Kirill Kovalev
 * @version 1 dated Aug 13, 2018
 *	Homework 1 - Java Lesson 1
 */

public class HomeWork1 {
    public static void main(String[] args){
        data();
        System.out.println("a * (b + (c / d)) = " + calc(3,3,3,3));
        System.out.println(tentwenty(2, 11));
        sPositiveOrNegative(6);
        System.out.println(isNegative(1));
        greetings("Петрович");
        whatyear(1996);
    }

    //Создать переменные всех пройденных типов данных, и инициализировать их значения;
    private static void data() {
        System.out.println(" - Инициализация : ");
        byte a = 1 ;
        short b = 2;
        int c = 3 ;
        long d = 4 ;
        float e =0.15f ;
        double f =111.11 ;
        char g = 'э';
        boolean h = true;
        System.out.println("byte - " + a);
        System.out.println("short - " + b);
        System.out.println("int - " + c);
        System.out.println("long - " + d);
        System.out.println("float - " + e);
        System.out.println("double - " + f);
        System.out.println("char - " + g);
        System.out.println("boolean - " + h);
    }

    //Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    // где a, b, c, d – входные параметры этого метода;
    private static int calc(int a, int b, int c, int d) {
        System.out.println(" - Высчитываем сложную формулу");
        return a * (b + (c / d));
    }

    //Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в
    //пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    private static boolean tentwenty(int x1, int x2) {
        System.out.println(" - Находится ли число в пределах от 10 до 20 ??? Складываем числа : " + x1 + " и "+ x2);
        int sum = x1 + x2;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }

    //Написать метод, которому в качестве параметра передается целое число, метод должен
    //напечатать в консоль положительное ли число передали, или отрицательное; Замечание:
    //ноль считаем положительным числом.
    private static void sPositiveOrNegative(int x) {
        System.out.println(" - Проверяем положительное или отрицательное число " + x + " ?");
        if (x >= 0) System.out.println("Число " + x + " положительное");
        else System.out.println("Число " + x + " отрицательное");
    }

    //Написать метод, которому в качестве параметра передается целое число, метод должен
    //вернуть true, если число отрицательное;
    private static boolean isNegative(int x) {
        System.out.println(" - Проверяем отрицательное ли число? " + x );
        return x < 0;
    }

    //Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    //метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    private static void greetings(String name) {
        System.out.println(" - Привет, " + name + "!");
    }

    //*Написать метод, который определяет является ли год високосным, и выводит сообщение в
    //консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й –
    //високосный.

    private static void whatyear(int year) {
        System.out.println(" - Проверим високосный ли год - " + year );
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " год  - не високосный");
        else System.out.println("Проверяемый "+ year + " год  - високосный");
    }
}
