package calculator;


public class EngineeringCalculator extends SimpleCalculator{
    private int engineeringNubmer;
    public EngineeringCalculator() {
    }

    public String vozvedenieVkvadrat(int first, int userCase) {
        nubmerOfVisits(1);
        return multiplication(first, first, userCase);
    }

    public String vCtepenb(int first, int second, int userCase) {
        nubmerOfVisits(1);
        int result = 1;
        for (int i = 0; i < second; i++) {
            result=multiplication1(result, first);
        }
        userResult=first + "^"+second +"="+result;
        historyUser=new HistoryVariable(userCase,userResult);
        history.historyUserArray(historyUser);
        return first + "^"+second +"="+result;
    }

    public String korenb(double first, int userCase) {
        nubmerOfVisits(1);
        double result = Math.sqrt(first);
        userResult="✓"+first+"="+Math.sqrt(first);
        historyUser=new HistoryVariable(userCase, userResult);
        history.historyUserArray(historyUser);
        return (String) "✓"+first+"="+Math.sqrt(first);
    }



    @Override
    public void nubmerOfVisits(int nubmer) {
    this.engineeringNubmer=engineeringNubmer+nubmer;
    }

    @Override
    public int getAllNubmerOfVisits() {
        return engineeringNubmer;
    }

}
