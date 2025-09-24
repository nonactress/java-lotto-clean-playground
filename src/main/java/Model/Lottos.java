package Model;

import java.util.ArrayList;
import java.util.List;

public class Lottos {
    private List<Lotto> lottoList;


    public Lottos(int money) {
        int COST_PER_TICKET = 1000;
        int numberOfLottos=money/COST_PER_TICKET;
        this.lottoList = new ArrayList<>();

        for (int i = 0; i < numberOfLottos; i++) {
            lottoList.add(new Lotto()); // new Lotto()가 호출될 때마다 새로운 로또 번호 6개가 생성됩니다.
        }
    }

    public void printLottos() {

        for (Lotto lotto : lottoList) {
            System.out.println(lotto);
        }
    }

    public List<Lotto> getLottoList() {
        return lottoList;
    }


}
