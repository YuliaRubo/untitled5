package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
//       Scanner sc = new Scanner(System.in);
//        int i = 0;
//        System.out.print("Введите ваш возраст: ");
//        if (sc.hasNextInt()) {
//            i = sc.nextInt();
//            System.out.println(i);
//        } else {
//            System.out.println("Вы ввели не целое число");
//        }
//        Scanner sc1 = new Scanner(System.in);
//        System.out.println("Введите любое слово или фразу: ");
//        String phrase1 = sc1.nextLine();
//        System.out.println(phrase1);
//
//        System.out.println("Меня зовут" + "  " + phrase1 + " ," + "мне" + " " + i);
//
//
//        Scanner sum = new Scanner(System.in);
//        System.out.println("Введите целое число:");
//        if (sum.hasNextInt()) {
//            int one = sum.nextInt();
//            int two = sum.nextInt();
//            int sumM = one + two;
//            System.out.println("Сумма чисел " + one + " и " + two + " равна " + sumM);
//        } else
//            System.out.println("Вы ввели не целое число");

//        int num;
//        System.out.println("Введите четное число");
//        Scanner chet = new Scanner(System.in);
//         num = chet.nextInt();
//        if(num%2==0){
//            System.out.println("Вы  ввели четное число " + num);
//        }
//        else {
//            System.out.println("Вы ввели не четное число");
//        }
//        int n = 10;
//        do {
//            System.out.println("Тик " + n--);
//        } while (n > 0);

//        int num = 5;
//        if(num==1){
//            System.out.println("Сегодня понедельник");
//        }
//        else  if(num==2){
//            System.out.println("Сегодня вторник");
//        }
//        else if(num==3){
//            System.out.println("Сегодня среда");
//        }
//        else if(num==4){
//            System.out.println("Сегодня четверг");
//        }
//        else if(num==5){
//            System.out.println("Сегодня пятница");
//        }
//        else {
//            System.out.println("Сегодня выходной");
//        }

        int[] myArray = {2,3,4,6,2,4};
        double result = 0;
        for(int sumOne: myArray){
           result+=sumOne;

        }
        System.out.println(result/myArray.length);


    }
}


