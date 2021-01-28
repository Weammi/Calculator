package calculator;

import java.util.ArrayList;

public class History {
    private ArrayList<HistoryVariable> arrayHistory=new ArrayList<>();

    public void historyUserArray(HistoryVariable historyUser){
        arrayHistory.add(historyUser);
    }

    public void printHistory(){
            for(int i=0; i<arrayHistory.size(); i++) {
                System.out.println("Вы ранее использовали программу номер "+arrayHistory.get(i).variableChooseUser+". "+ arrayHistory.get(i).variableResult);
            }
    }
}