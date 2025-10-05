package View;

import Model.Lotto;
import Model.Lottos;

import java.util.Map;

public class OutView {

    public void printLottoMatcher(Map<Integer, Integer> matchCounts, double rate) {
        System.out.println("당첨 통계");
        System.out.println("------");
        System.out.println("3개 일치(5,000원): " + matchCounts.getOrDefault(3, 0) + "개");
        System.out.println("4개 일치(50,000원): " + matchCounts.getOrDefault(4, 0) + "개");
        System.out.println("5개 일치(1,500,000원): " + matchCounts.getOrDefault(5, 0) + "개");
        System.out.println("5개 일치, 보너스 볼 일치(30,000,000원): " + matchCounts.getOrDefault(7, 0) + "개");
        System.out.println("6개 일치(2,000,000,000원): " + matchCounts.getOrDefault(6, 0) + "개");
        System.out.printf("총 수익률은 %.2f입니다.", rate);
    }

    public void printLottosStaus(int AutoLottoNumber, int manualLottoNumber) {
        System.out.println();
        System.out.println("수동으로 " + manualLottoNumber + "장, 자동으로" + AutoLottoNumber + "개를 구매했습니다.");
    }

    public void printLottos(Lottos lottos) {
        for (Lotto lotto : lottos) {
            System.out.println(lotto);
        }
    }
}
