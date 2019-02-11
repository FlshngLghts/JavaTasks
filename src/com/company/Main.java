package com.company;

public class Main {

    public static void main(String[] args) {
        //Создание переменных примитивного типа данных (8 типов)
        byte b1 = 1, b2 = 2, b3 = 3, b4 = 4, b5 = 5; // 8 бит - от -127 до 127
        short s1 = -5, s2 = -10, s3 = 15, s4 = 20, s5 = 25; // 16 бит - от -32768 до 32767
        char c1 = 'a', c2 = 117, c3 = 'c', c4 = '\u0112', c5 = 'e'; // 16 бит - беззнаковое число - символ в кодировке
        int i1 = -30, i2 = -56, i3 = 256, i4 = 440, i5 = 1111; // 32 бит - от -2147483648 до 2147483647
        long l1 = 5789403247983102L, l2 = 3791848790193838193L, l3 = 648798313648739L, l4 = 641890381239146L, l5 = 351237281399L; // постфикс 'L' - 64 бит - от -9223372036854775808L до 9223372036854775807L
        float f1 = 523.59023f, f2 = 2348.432789f, f3 = 34289.3424f, f4 = 8.434329f, f5 = 54.34209f; // постфикс 'f' - 32 бит - от -1.4e-45f до 3.4e+38f
        double d1 = 432.4985, d2 = 4398.1237, d3 = 42389.0913, d4 = 2592.4593, d5 = 839.98592; // 64 бит - от -4.9e-324 до 1.7e+308
        boolean bl1 = true, bl2 = false, bl3 = false, bl4 = true, bl5 = true; // логический тип - два значения - true или false

        //Пункт 1 - вывод значений переменных через запятую (без пробелов), без переноса на новую строку
       /* System.out.print(b1 + "," + b2 + "," + b3 + "," + b4 + "," + b5 + ",");
        System.out.print(s1 + "," + s2 + "," + s3 + "," + s4 + "," + s5 + ",");
        System.out.print(c1 + "," + c2 + "," + c3 + "," + c4 + "," + c5 + ",");
        System.out.print(bl1 + "," + bl2 + "," + bl3 + "," + bl4 + "," + bl5 + ",");
        System.out.print(l1 + "," + l2 + "," + l3 + "," + l4 + "," + l5 + ",");
        System.out.print(d1 + "," + d2 + "," + d3 + "," + d4 + "," + d5 + ",");
        System.out.print(f1 + "," + f2 + "," + f3 + "," + f4 + "," + f5 + ",");
        System.out.print(i1 + "," + i2 + "," + i3 + "," + i4 + "," + i5); */

        //Пункт 2 - вывод знаачений переменных через запятую с пробелами и переносом строки для каждого нового типа данных
        //Вывод с помощью функции println
        /*System.out.println("Byte vars: " + b1 + ", " + b2 + ", " + b3 + ", " + b4 + ", " + b5);
        System.out.println("Short vars: " + s1 + ", " + s2 + ", " + s3 + ", " + s4 + ", " + s5);
        System.out.println("Char vars: " + c1 + ", " + c2 + ", " + c3 + ", " + c4 + ", " + c5);
        System.out.println("Boolean vars: " + bl1 + ", " + bl2 + ", " + bl3 + ", " + bl4 + ", " + bl5);
        System.out.println("Long vars: " + l1 + ", " + l2 + ", " + l3 + ", " + l4 + ", " + l5);
        System.out.println("Double vars: " + d1 + ", " + d2 + ", " + d3 + ", " + d4 + ", " + d5);
        System.out.println("Float vars: " + f1 + ", " + f2 + ", " + f3 + ", " + f4 + ", " + f5);
        System.out.println("Int vars: " + i1 + ", " + i2 + ", " + i3 + ", " + i4 + ", " + i5);*/

        //Вывод с помощью функции print
        System.out.print("Byte vars: " + b1 + ", " + b2 + ", " + b3 + ", " + b4 + ", " + b5 + '\n');
        System.out.print("Short vars: " + s1 + ", " + s2 + ", " + s3 + ", " + s4 + ", " + s5 + '\n');
        System.out.print("Char vars: " + c1 + ", " + c2 + ", " + c3 + ", " + c4 + ", " + c5 + '\n');
        System.out.print("Boolean vars: " + bl1 + ", " + bl2 + ", " + bl3 + ", " + bl4 + ", " + bl5 + '\n');
        System.out.print("Long vars: " + l1 + ", " + l2 + ", " + l3 + ", " + l4 + ", " + l5 + '\n');
        System.out.print("Double vars: " + d1 + ", " + d2 + ", " + d3 + ", " + d4 + ", " + d5 + '\n');
        System.out.print("Float vars: " + f1 + ", " + f2 + ", " + f3 + ", " + f4 + ", " + f5 + '\n');
        System.out.print("Int vars: " + i1 + ", " + i2 + ", " + i3 + ", " + i4 + ", " + i5);

        //Пункт 3 - Реализовать методы для сложения, вычитания, умножения, деления для каждого типа; ограничить вывод количества символов после запятой 3-мя





    }
}
