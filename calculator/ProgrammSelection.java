package calculator;

import java.util.Scanner;

public class ProgrammSelection {
    public int programmSelection() {
        Scanner in = new Scanner(System.in);
        int chooseUser = in.nextInt();
        if(chooseUser!=8) {
            System.out.println("Вы выбрали программу номер " + chooseUser);
        }
        return chooseUser;
    }
}
