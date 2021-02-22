package ReverseText;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
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
        ArrayList<String> myArray = new ArrayList<>();
        try {
            Scanner readText = new Scanner(myText);
            while (readText.hasNextLine()){
                String data = readText.nextLine();
                System.out.println(data);
                myArray.add(data);
            }
        } catch (Exception e) {
            System.out.println("Произошла ошибка");
            e.printStackTrace();
        }

        Collections.sort(myArray, Collections.reverseOrder());
        System.out.println("\n"+"Испаравленный текст"+"\n");
        for(String str: myArray){
            System.out.println(str);
        }
    }
}
