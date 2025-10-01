package Controller;

import Model.Jackpot;
import Model.LottoMatcher;
import Model.Lottos;
import View.InputView;
import View.OutView;

import java.util.List;

public class LottoController {
    public void startLotto() {
        InputView inputView = new InputView();

        int money = inputView.getMoney();
        int manualLottoNumber = inputView.getManualLottoNumber();

        List<String> rawNumbersList = inputView.manualLotto(manualLottoNumber);

        Lottos lottos = new Lottos(money, rawNumbersList);

        OutView outView = new OutView();

        outView.printLottosStaus(lottos.getAutoLottoCount(money, manualLottoNumber), manualLottoNumber);

        outView.printLottos(lottos);

        String[] winningNumber = inputView.getJackpotNumber();
        int bonusNumber = inputView.getBonus();

        Jackpot jackpot = new Jackpot(winningNumber, bonusNumber);

        LottoMatcher lottoMatcher = new LottoMatcher(lottos, jackpot);

        outView.printLottoMatcher(lottoMatcher.getMatchCounts(), lottoMatcher.getRate(money));
    }
}
