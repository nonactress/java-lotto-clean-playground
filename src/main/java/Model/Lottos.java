package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lottos {
    private List<Lotto> lottoList;
    private static final int COST_PER_TICKET = 1000;

    public Lottos(int money, List<String> manualLottoLines) {
        this.lottoList = new ArrayList<>();
        int manualLottosNumber = manualLottoLines.size();

        // 수동 로또 생성
        for (String line : manualLottoLines) {
            lottoList.add(new ManualLotto(line));
        }

        // 자동 로또 생성
        for (int i = 0; i < getAutoLottoCount(money,manualLottosNumber); i++) {
            lottoList.add(new AutoLotto());
        }
    }

    public List<Lotto> getLottoList() {
        return Collections.unmodifiableList(lottoList);
    }

    public int getAutoLottoCount(int money,int manualLottosNumber) {
        return money / COST_PER_TICKET - manualLottosNumber;
    }
}
