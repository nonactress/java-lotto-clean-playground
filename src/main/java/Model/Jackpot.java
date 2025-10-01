package Model;

import java.util.Collections;
import java.util.List;

public class Jackpot {
    private List<Integer> jackpot;
    private int bounsNumber;

    public Jackpot(String[] inputJackpot,int bounsNumber) {
        JackpotGenerator from = JackpotGenerator.from(inputJackpot);
        this.jackpot = from.getNumber();

        this.bounsNumber = bounsNumber;
    }

    public List<Integer> getJackpot() {
        return Collections.unmodifiableList(jackpot);
    }

    public int getBounsNumber() {return bounsNumber;}

    @Override
    public String toString() {
        return jackpot.toString();
    }
}
