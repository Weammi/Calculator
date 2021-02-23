package calculator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class History {
    private ArrayList<HistoryVariable> arrayHistory=new ArrayList<>();
    File historyText = new File("C:fullHistory.txt");
    File fullHistoryText= new File("C:newHistory.txt");
    public void historyUserArray(HistoryVariable historyUser){
        arrayHistory.add(historyUser);
    }

    public void saveFullHistory(){
        try {
            FileWriter pushText = new FileWriter ("fullHistory.txt");
            for(HistoryVariable s: arrayHistory) {
                pushText.write("Вы ранее использовали программу номер " + s.variableChooseUser + ". " + s.variableResult + "\n");
            }
            pushText.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileWriter pushFullText = new FileWriter(fullHistoryText, true);
            Scanner readHistory = new Scanner(historyText);
            while (readHistory.hasNextLine()){
                String dataText = readHistory.nextLine();
                pushFullText.write(dataText+"\n");
            }
            pushFullText.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void printHistory(){
//            for(int i=0; i<arrayHistory.size(); i++) {
//                System.out.println("Вы ранее использовали программу номер "+arrayHistory.get(i).variableChooseUser+". "+ arrayHistory.get(i).variableResult);
//            }
        try {
            Scanner readHistory = new Scanner(historyText);
            while(readHistory.hasNextLine()){
                String data=readHistory.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void printFullHistory(){
        try {
            Scanner readFullHistory= new Scanner(fullHistoryText);
            while (readFullHistory.hasNextLine()){
                String dataFullText=readFullHistory.nextLine();
                System.out.println(dataFullText);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}