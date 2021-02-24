package ReverseText;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class reverseText {
    public static void main(String[] args) {
        File myText = new File("C:Text1.txt");
//        try {
//            if (myText.createNewFile()) {
//                System.out.println("Файл создан " + myText.getName());
//            } else {
//                System.out.println("Такой фаил уже существует");
//                System.out.println(myText.getAbsolutePath());
//            }
//        } catch (IOException e){
//            System.out.println("Произошла ошибка");
//            e.printStackTrace();
//        }
        try {
            FileWriter pushText = new FileWriter ("Text1.txt");
            pushText.write("    Давно выяснено, что при оценке дизайна и композиции"+
                    "\n читаемый текст мешает сосредоточиться. Lorem Ipsum"+
                    "\n используют потому, что тот обеспечивает более или менее"+
                    "\n стандартное заполнение шаблона, а также реальное"+
                    "\n распределение букв и пробелов в абзацах, которое не"+
                    "\n получается при простой дубликации Здесь ваш текст.. (Здесь"+
                    "\n ваш текст.. Здесь ваш текст..) Многие программы электронной"+
                    "\n вёрстки и редакторы HTML используют Lorem Ipsum в качестве"+
                    "\n текста по умолчанию, так что поиск по ключевым словам"+
                    "\n lorem ipsum сразу показывает, как много веб-страниц всё"+
                    "\n ещё дожидаются своего настоящего рождения. За прошедшие"+
                    "\n годы текст Lorem Ipsum получил много версий. Некоторые"+
                    "\n версии появились по ошибке, некоторые - намеренно"+
                    "\n (например, юмористические варианты).");
            pushText.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] myArray= new String[14];
        try {
            Scanner readText = new Scanner(myText);
            int i=0;
            while (readText.hasNextLine()){
                String data = readText.nextLine();
                myArray[i++]=data;
            }
        } catch (Exception e) {
            System.out.println("Произошла ошибка");
            e.printStackTrace();
        }
        int i, j;
        String temp;
        for(i=0, j=(myArray.length-1); i<=j; i++, j--){
            temp = myArray[i];
            myArray[i] = myArray[j];
            myArray[j] = temp;
            System.out.println(myArray[i]);
        }
        for(i=myArray.length-1, j=0 ; i>=j; i--, j++){
            temp = myArray[i];
            myArray[i] = myArray[j];
            myArray[j] = temp;
            System.out.println(myArray[j]);
        }
    }
}
