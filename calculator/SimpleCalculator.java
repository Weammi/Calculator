package calculator;

public class SimpleCalculator implements NumberOfVisits {
    private int simpleNubmer;
    public SimpleCalculator() {
    }
    HistoryVariable historyUser;
    String userResult;
    History history=new History();

    public String addition(int first, int second, int userCase) {
        nubmerOfVisits(1);
        int result;
        result=first+second;
        userResult = first + "+"+second +"="+result;
        historyUser=new HistoryVariable(userCase, userResult);
        history.historyUserArray(historyUser);
        return first + "+"+second +"="+result;
    }

    public String subtraction(int first, int second, int userCase) {
        nubmerOfVisits(1);
        int result;
        result = first - second;
        userResult = first + "-"+second +"="+result;
        historyUser=new HistoryVariable(userCase,userResult);
        history.historyUserArray(historyUser);
        return first + "-"+second +"="+result;
    }

    public String multiplication(int first, int second, int userCase) {
        nubmerOfVisits(1);
        int result;
        result = first * second;
        userResult=first + "*"+second +"="+result;
        historyUser= new HistoryVariable(userCase,userResult);
        history.historyUserArray(historyUser);
        return first + "*"+second +"="+result;
    }
    public int multiplication1(int first, int second) {
        nubmerOfVisits(1);
        int result;
        result = first * second;
        return result;
    }

    public String division(int first, int second, int userCase) {
        nubmerOfVisits(1);
        int result;
        result = first / second;
        userResult=first + "/"+second +"="+result;
        historyUser=new HistoryVariable(userCase,userResult);
        history.historyUserArray(historyUser);
        return first + "/"+second +"="+result;
    }

    public void printHistoryUser(){
        history.printHistory();
    }

    @Override
    public void nubmerOfVisits(int nubmer) {
        this.simpleNubmer=simpleNubmer+nubmer;
    }


    @Override
    public int getAllNubmerOfVisits() {
        return simpleNubmer;
    }
}