package Model;

import java.util.List;

public class LottoMatcher {
    private final int[] matchCounts;

    public LottoMatcher(Lottos lottos, Jackpot jackpot) {
        this.matchCounts = new int[7];

        for (Lotto lotto : lottos.getLottoList()) {
            int matches = countMatches(jackpot.getJackpot(), lotto.getLotto());
            matchCounts[matches]++;
        }
    }

    private int countMatches(List<Integer> jackpotNumbers, List<Integer> lottoNumbers) {
        int count = 0;
        for (int number : lottoNumbers) {
            count += getMatchValue(jackpotNumbers, number);
        }
        return count;
    }

    private int getMatchValue(List<Integer> jackpotNumbers, int number) {
        if (jackpotNumbers.contains(number)) {
            return 1;
        }
        return 0;
    }

    public int[] getMatchCounts() {
        return matchCounts;
    }

    public double calculateTotalEarnings() {
        return matchCounts[3] * 5000
                + matchCounts[4] * 50000
                + matchCounts[5] * 1500000
                + matchCounts[6] * 2000000000;
    }

    public double getRate(int money)
    {
        return (double)calculateTotalEarnings()/money;
    }
}
