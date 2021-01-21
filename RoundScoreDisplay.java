public class RoundScoreDisplay implements Observer {
    private Subject golfer;
    private int strokesTotal;
    private int parTotal;

    public RoundScoreDisplay(Subject golfer) {
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    public void update(int strokes, int par) {
        strokesTotal += strokes;
        parTotal += par;
        displayRoundScore();
    }

    public void displayRoundScore() {
        int counter = 0;
        System.out.println("Round stats: " + "\nPar: " + parTotal + "\nStrokes: " + strokesTotal);
        if (strokesTotal > parTotal) {
            counter = strokesTotal - parTotal;
            System.out.println(counter + " over par\n");
        } else if (strokesTotal < parTotal) {
            counter = parTotal - strokesTotal;
            System.out.println(counter + " under par\n");
        } else {
            System.out.println("Making par\n");
        }
    }
}
