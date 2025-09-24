package View;

import Model.Jackpot;
import java.util.Scanner;

public class InputView {
    Scanner scanner = new Scanner(System.in);

    public int getMoney()
    {
        System.out.println("구입금액을 입력해 주세요.");
        return scanner.nextInt();
    }

    public String[]  getJackpot()
    {
        scanner.nextLine();
        System.out.println("정답 로또번호를 입력해주세요( ','로 구분해서 입력)");
        return scanner.nextLine().split(",");
    }
}
