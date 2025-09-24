package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Jackpot {
    private List<Integer> jackpot;

    public Jackpot(String[] splits) {
        this.jackpot = new ArrayList<>();  // 리스트 초기화

        for (int i = 0; i < 6; i++) {
            jackpot.add(Integer.parseInt(splits[i]));
        }
        Collections.sort(this.jackpot);
    }

    public List<Integer> getJackpot() {
        return jackpot;
    }

    @Override
    public String toString() {
        return jackpot.toString();
    }
}
