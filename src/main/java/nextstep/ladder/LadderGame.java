package nextstep.ladder;

public class LadderGame {
    private static final int FIRST_LADDER_INDEX = 0;

    private Ladders ladders;

    public LadderGame(int size, int height) {
        ladders = new Ladders();
        for (int i = 0; i < size; i++) {
            ladders.add();
        }

        init(height);
    }

    private void init(int height) {
        for (int i = 0; i < height; i++) {
            initHeight(i);
        }
    }

    private void initHeight(int height) {
        for (int i = 0; i < ladders.size(); i++) {
            Direction direction = randomDirection(i, height);
            ladders.initHeight(i, direction);
        }
    }

    private Direction randomDirection(int index, int height) {
        if (previousLadderDirectionIsRight(index, height)) {
            return Direction.LEFT;
        }

        return Direction.getRandomDirection();
    }

    private boolean previousLadderDirectionIsRight(int index, int height) {
        if (index == FIRST_LADDER_INDEX) {
            return false;
        }

        Direction previousLadderDirection = ladders.ladderDirection(index - 1, height);
        return Direction.RIGHT.equals(previousLadderDirection);
    }

    public int size() {
        return ladders.size();
    }

    public int height() {
        return ladders.height();
    }
}
