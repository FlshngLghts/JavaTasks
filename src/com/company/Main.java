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
        //Объявление строк
        String str1 = "String";
        String str2 = "Test";
        String unstr = "Union: " + str1 + str2 + " " + b1 + b2 + b3;//Объявление строки с учетом объединения данных разных типов

        char[] sym = {'a', 'b', 'c'};//Массив символов
        String symbols = new String(sym);// Объявление строки через консткрутор

        System.out.println(str1.length());//Встроенный метод определения длины строки

        //Различные интерпретации конкатенации строк
        System.out.println(str1.concat(str2));//С помощью метода concat класса String
        System.out.println("This is " + str1 + " " + str2);//C помощью оператора +
        System.out.println(unstr);//При объявлении
        System.out.println(symbols);//С использованием конструктора

        //Написанные методы сравнения и конкатенации строк
        System.out.println(myCompare(str1, str2));//Срравнение
        System.out.println(newStr(str1, str2));//Конкатенация

        //Пункт 1 - вывод значений переменных через запятую (без пробелов), без переноса на новую строку
        //Вывод с помощью функции print
        /* System.out.print(b1 + "," + b2 + "," + b3 + "," + b4 + "," + b5 + ",");
        System.out.print(s1 + "," + s2 + "," + s3 + "," + s4 + "," + s5 + ",");
        System.out.print(c1 + "," + c2 + "," + c3 + "," + c4 + "," + c5 + ",");
        System.out.print(bl1 + "," + bl2 + "," + bl3 + "," + bl4 + "," + bl5 + ",");
        System.out.print(l1 + "," + l2 + "," + l3 + "," + l4 + "," + l5 + ",");
        System.out.print(d1 + "," + d2 + "," + d3 + "," + d4 + "," + d5 + ",");
        System.out.print(f1 + "," + f2 + "," + f3 + "," + f4 + "," + f5 + ",");
        System.out.print(i1 + "," + i2 + "," + i3 + "," + i4 + "," + i5); */

        //Вывод с помощью printf
        /*System.out.printf("%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%c,%c,%c,%c,%c,%f,%f,%f,%f,%f,%f,%f,%f,%f,%f,%b,%b,%b,%b,%b",
                b1, b2, b3, b4, b5, s1, s2, s3, s4, s5, i1, i2, i3, i4, i5, l1, l2, l3, l4, l5, c1, c2, c3, c4, c5, f1, f2, f3, f4, f5,
                d1, d2, d3, d4, d5, bl1, bl2, bl3, bl4, bl5);*/

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
        /*System.out.print("Byte vars: " + b1 + ", " + b2 + ", " + b3 + ", " + b4 + ", " + b5 + '\n');
        System.out.print("Short vars: " + s1 + ", " + s2 + ", " + s3 + ", " + s4 + ", " + s5 + '\n');
        System.out.print("Char vars: " + c1 + ", " + c2 + ", " + c3 + ", " + c4 + ", " + c5 + '\n');
        System.out.print("Boolean vars: " + bl1 + ", " + bl2 + ", " + bl3 + ", " + bl4 + ", " + bl5 + '\n');
        System.out.print("Long vars: " + l1 + ", " + l2 + ", " + l3 + ", " + l4 + ", " + l5 + '\n');
        System.out.print("Double vars: " + d1 + ", " + d2 + ", " + d3 + ", " + d4 + ", " + d5 + '\n');
        System.out.print("Float vars: " + f1 + ", " + f2 + ", " + f3 + ", " + f4 + ", " + f5 + '\n');
        System.out.print("Int vars: " + i1 + ", " + i2 + ", " + i3 + ", " + i4 + ", " + i5);*/

        //Вывод с помощью printf
        /*System.out.printf("Byte vars: %d, %d, %d, %d, %d\nShort vars: %d, %d, %d, %d, %d\nInt vars: %d, %d, %d, %d, %d\n" +
                        "Long vars: %,d, %,d, %,d, %,d, %,d\nChar vars: %c, %c, %c, %c, %c\nFloat vars: %f, %f, %f, %f, %f" +
                        "\nDouble vars: %f, %f, %f, %f, %.4f\nBoolean vars: %b, %b, %b, %b, %b",
                b1, b2, b3, b4, b5, s1, s2, s3, s4, s5, i1, i2, i3, i4, i5, l1, l2, l3, l4, l5, c1, c2, c3, c4, c5, f1, f2, f3, f4, f5,
                d1, d2, d3, d4, d5, bl1, bl2, bl3, bl4, bl5);*/

        //Пункт 3 - вывод
        /*System.out.printf("%d\n", sum(b1, b2));
        System.out.print(sub(s2, s5) + '\n');
        System.out.println(sum(i1, i3));
        System.out.println("Long division: " + "L2/L4 = " + div(l2, l4));
        System.out.printf("%.3f\n", sum(d5, d3));
        System.out.printf("%.3f\n", div(f3, f4));
        System.out.print(mul(c5, c4));*/

    }
    //Пункт 3 - Реализовать методы для сложения, вычитания, умножения, деления для каждого типа; ограничить вывод количества символов после запятой 3-мя
    static byte sum(byte x, byte y){
        return (byte) (x + y);
    }

    static short sub(short x, short y){
        return (short) (x - y);
    }

    static int sum(int x, int y, int z){
        return x + y + z;
    }

    static long div(long x, long y){
        return x / y;
    }

    static double sum(double x, double y){
        return x + y;
    }

    static char mul(char x, double y){
        return (char) (x * y);
    }

    static float div(float x, float y){
        return x / y;
    }

    //Пункт 5 - работа со строками
    //Метод сравнения строк
    private static int myCompare(String a, String b) { //Принимает 2 исходные строки
        int length1 = a.length(); //Определяем длины обеих
        int length2 = b.length();
        char[] ch1 = a.toCharArray(); //Переводим строки в символьный массив с пом toCharArray класса String
        char[] ch2 = b.toCharArray();
        int i; //Переменные счетчика и результата
        int res = 0;

        if (length1 != length2)//Условие: если длины строк разные, то результат 0 или false
            res = 0;
        else //Если одинаковые длины
            for (i = 0; i < length1; i++) {//От 0 до количества символов в строке-1
                if (ch1[i] != ch2[i])//Если соотвествующие элементы массивов разные, то результат 0 или false
                    res = 0;
                else
                    res = 1;//Иначе, 1 или true
            }
        return res;//Возвращаем результат
        }

        //Метод сложения строк
        private static String newStr(String a, String b){//Принимает 2 исходные строки
            char parser = ' ';//Разделитель
            String newStr = a + parser + b;//Объединяем при помощи оператора + с учетом разделителя в новую строку
            return newStr;//Возвращаем новую строку
        }
    }



