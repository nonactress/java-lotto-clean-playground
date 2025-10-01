package View;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class InputView {
    Scanner scanner = new Scanner(System.in);

    public int getMoney() {
        System.out.println("구입금액을 입력해 주세요.");
        while (true) {
            try {
                int money = scanner.nextInt();
                validate(money);
                return money;
            } catch (InputMismatchException e) {
                System.out.println("금액은 숫자로 입력해주세요!");
                scanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void validate(int money) {
        if (money < 0)
            throw new IllegalArgumentException("금액이 0보다 작을 순 없습니다!");
        if (money % 1000 != 0)
            throw new IllegalArgumentException("1000원 단위로 입력해주세요!");
    }

    public String[] getJackpotNumber() {
        System.out.println("정답 로또번호를 입력해주세요( ','로 구분해서 입력)");
        return scanner.nextLine().split(",");
    }


    public int getManualLottoNumber() {
        System.out.println("수동으로 구매할 로또 수를 입력해 주세요.");
        return scanner.nextInt();
    }

    public List<String> manualLotto(int manualLottoNumber) {
        List<String> manualLottoLines = new ArrayList<>();

        scanner.nextLine();
        System.out.println("수동으로 구매할 번호를 입력해 주세요.");
        for (int i = 0; i < manualLottoNumber; i++) {
            manualLottoLines.add(scanner.nextLine());
        }
        return manualLottoLines;
    }

    public int getBonus() {
        System.out.println("보너스 볼을 입력해 주세요.");
        return scanner.nextInt();
    }
}
