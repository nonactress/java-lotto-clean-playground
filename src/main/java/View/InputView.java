package View;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class InputView {
    Scanner scanner = new Scanner(System.in);

    public int getMoney() {
        return scanner.nextInt();
    }



    public String[] getJackpotNumber() {
        return scanner.nextLine().split(",");
    }


    public int getManualLottoCount() {
        return scanner.nextInt();
    }

    public List<String> manualLotto(int manualLottoNumber) {
        List<String> manualLottoLines = new ArrayList<>();

        scanner.nextLine();

        for (int i = 0; i < manualLottoNumber; i++) {
            manualLottoLines.add(scanner.nextLine());
        }
        return manualLottoLines;
    }

    public int getBonus() {
        return scanner.nextInt();
    }


}
