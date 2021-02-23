package calculator;

import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        SimpleCalculator someSimpleCalculator = new SimpleCalculator();
        EngineeringCalculator someEngineeringCalculator = new EngineeringCalculator();
        NumberOfVisits engineeringNubmerOfVisits = someEngineeringCalculator;
        ProgrammSelection choiseUser;
        choiseUser = new ProgrammSelection();
        NumberOfVisits simpleNubmerOfVisits = someSimpleCalculator;
        boolean end = true;
        boolean back = true;
        TwoInt userData;
        int userCase;
        do {
            printMenu();
            switch (selectedProgrammPrintMenu()) {
                case 1:
                    do {
                        printHello();
                        switch (choiseUser.programmSelection()) {
                            case 1:
                                userCase = 1;
                                userData = fillUserData();
                                System.out.println(someSimpleCalculator.addition(userData.first, userData.second, userCase));
                                break;
                            case 2:
                                userCase = 2;
                                userData = fillUserData();
                                System.out.println(someSimpleCalculator.subtraction(userData.first, userData.second, userCase));
                                break;
                            case 3:
                                userCase = 3;
                                userData = fillUserData();
                                System.out.println(someSimpleCalculator.multiplication(userData.first, userData.second, userCase));
                                break;
                            case 4:
                                userCase = 4;
                                userData = fillUserData();
                                System.out.println(someSimpleCalculator.division(userData.first, userData.second, userCase));
                                break;
                            case 5:
                                userCase = 5;
                                System.out.println(someEngineeringCalculator.vozvedenieVkvadrat(oneFillUserData(), userCase));
                                break;
                            case 6:
                                userCase = 6;
                                userData = fillUserData();
                                System.out.println(someEngineeringCalculator.vCtepenb(userData.first, userData.second, userCase));
                                break;
                            case 7:
                                userCase = 7;
                                System.out.println(someEngineeringCalculator.korenb(oneFillUserData(), userCase));
                            case 8:
                                back = false;
                                clearScreen();
                                someSimpleCalculator.saveHistory();
                                break;
                        }
                    } while (back);
                    break;
                case 2:
                    someSimpleCalculator.printHistoryUser();
                    break;
                case 3:
                    someSimpleCalculator.saveFullHistory();
                    break;
                case 4:
                    System.out.println("Вы выбрали закончить работу с этой программой");
                    System.out.println("Вы зашли в инженерный калькулятор в количестве  " + someEngineeringCalculator.getAllNubmerOfVisits() + " раз");
                    System.out.println("Вы зашли в простой калькулятор в количестве  " + someSimpleCalculator.getAllNubmerOfVisits() + " раз");
                    end = false;
                    break;
            }
        }while(end);
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
                "\n 8. Вернуться назад "
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

    public static void printMenu(){
        System.out.println("Выберите действие, которое хотите совершить."+
                "\n 1. Работать с канкулятором"+
                "\n 2. Показать историю последних совершенных операций."+
                "\n 3. Показать всю историю совершенных операций."+
                "\n 4. Закончить работу."
                );
    }

    public static int selectedProgrammPrintMenu(){
        Scanner in=new Scanner(System.in);
        int choicePrintMenu=in.nextInt();
        return choicePrintMenu;
    }
    public static void clearScreen() {
        for(int i=0; i<25;i++){
            System.out.println();
        }
    }
}