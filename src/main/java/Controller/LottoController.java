package Controller;

import Model.Jackpot;
import Model.LottoMatcher;
import Model.Lottos;
import View.InputView;
import View.OutView;

public class LottoController {
    public void startLotto() {
        InputView input = new InputView();
        int money = input.getMoney();

        Lottos lottos = new Lottos(money);

        OutView output = new OutView();

        output.printLottos(lottos);

        Jackpot jackpot = new Jackpot(input.getJackpot());

        LottoMatcher lottoMatcher = new LottoMatcher(lottos, jackpot);

        output.printLottoMatcher(lottoMatcher.getMatchCounts(), lottoMatcher.getRate(money));
    }
}
