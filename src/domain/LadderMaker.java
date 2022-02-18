package domain;

import java.util.ArrayList;
import java.util.List;

public class LadderMaker {

    private final int WIDTH;
    private final int HEIGHT;
    private List<Line> ladder = new ArrayList<>();
    private List<Player> playerList;
    private List<String> prizeList;
    public LadderMaker(List<Player> playerList, List<String> prizeList, int height) {
        this.playerList = playerList;
        this.prizeList = prizeList;
        this.WIDTH = playerList.size() * 2 - 1;
        this.HEIGHT = height;
    }

    void make() {
        for (int row = 0; row < HEIGHT; row++) {
            ladder.add(new Line(WIDTH));
        }
    }

    protected List<Line> getLadderList() {
        return ladder;
    }

    public void calculate() {
        for (int i = 0; i < playerList.size(); i++) {
            findResult(i);

        }
    }

    private void findResult(int startIndex) {
        for (int i = 0; i < ladder.size(); i++) {
            /*findNextIndex(startIndex);*/

        }
    }

    private void findNextIndex() {
        /*findDirection(startIndex);*/
    }

    private void findDirection(int startIndex) {
       /* ladder.get(0).getLine(startIndex);*/ // Line

    }
}