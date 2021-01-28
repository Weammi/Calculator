package calculator;

import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        SimpleCalculator someSimpleCalculator = new SimpleCalculator();
        EngineeringCalculator someEngineeringCalculator = new EngineeringCalculator();
        NumberOfVisits engineeringNubmerOfVisits=someEngineeringCalculator;
        ProgrammSelection choiseUser;
        choiseUser = new ProgrammSelection();
        NumberOfVisits simpleNubmerOfVisits=someSimpleCalculator;
        boolean end=true;
        TwoInt userData;
        int userCase;
        do {
            printHello();
            switch (choiseUser.programmSelection()) {
                case 1:
                    userCase=1;
                    userData= fillUserData();
                    System.out.println(someSimpleCalculator.addition(userData.first,userData.second, userCase));
                    break;
                case 2:
                    userCase=2;
                    userData = fillUserData();
                    System.out.println(someSimpleCalculator.subtraction(userData.first, userData.second, userCase));
                    break;
                case 3:
                    userCase=3;
                    userData= fillUserData();
                    System.out.println(someSimpleCalculator.multiplication(userData.first, userData.second, userCase));
                    break;
                case 4:
                    userCase=4;
                    userData= fillUserData();
                    System.out.println(someSimpleCalculator.division(userData.first,userData.second, userCase));
                    break;
                case 5:
                    userCase=5;
                    System.out.println(someEngineeringCalculator.vozvedenieVkvadrat(oneFillUserData(), userCase));
                    break;
                case 6:
                    userCase=6;
                    userData= fillUserData();
                    System.out.println(someEngineeringCalculator.vCtepenb(userData.first,userData.second,userCase));
                    break;
                case 7:
                    userCase=7;
                    System.out.println(someEngineeringCalculator.korenb(oneFillUserData(),userCase));
                    break;
                case 8:
                    System.out.println("Вы выбрали закончить работу с этой программой");
                    System.out.println("Вы зашли в инженерный калькулятор в количестве  "+ someEngineeringCalculator.getAllNubmerOfVisits() + " раз");
                    System.out.println("Вы зашли в простой калькулятор в количестве  "+ someSimpleCalculator.getAllNubmerOfVisits() + " раз");
                    end=false;
                    break;
                case 9:someSimpleCalculator.printHistoryUser();
                    break;
            }
        } while (end);
    }

    public static void printHello() {
        System.out.println("Выберите номер программы в которой хотите работать." +
                "\n 1. Сложение." +
                "\n 2. Вычитание." +
                "\n 3. Умножение." +
                "\n 4. Деление." +
                "\n 5. Возведение в квадрат." +
                "\n 6. Возведение в степень." +
                "\n 7. Нахождение квадратного корня. " +
                "\n 8. Закончить работу "+
                "\n 9. показать историю "
        );
    }
    public static TwoInt fillUserData() {
        Scanner in = new Scanner(System.in);
        int first;
        int second;
        System.out.println("Введите первое значние");
        first = in.nextInt();
        System.out.println("Введите Второе значние");
        second = in.nextInt();
        return new TwoInt(first, second);
    }

    public static int oneFillUserData(){
        Scanner in=new Scanner(System.in);
        int first;
        System.out.println("Введите значение");
        first=in.nextInt();
        return first;
    }
}
//25.12.2020 17:45
//          Написать приложение в котором будет класс канкулятор ,
//        1)который будет уметь делать обычные математические вычисления
//        2)создать класс инженерного конкулятора, который будет расширять функционал обычного калькулятора,
//        такими функциями как возведение в квадрат, возведение в н степень, и нахождение квадратного корня.
//          http://developer.alexanderklimov.ru/android/java/extends.php

//08.01.2012
//интерфейс
//https://www.youtube.com/watch?v=7zf1TBbTrRE&feature=youtu.be
//09.01.2021
//Добавить историю в которой будет сохраняться история изменений
//https://habr.com/ru/post/237043/
//https://youtu.be/0AqXx977ogU
//11.01.2021
//доработка хистори
// сущность чтобы всё посчитывала, вторая сущность чтобы хранила 2 переменные программ селекшен и ответ.