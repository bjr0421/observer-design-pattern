/**
 * Displays the score total for the round for a Golfer
 * @author Brooks Robinson
 */
public class RoundScoreDisplay implements Observer {
    private Subject golfer;
    private int strokesTotal;
    private int parTotal;

    /**
     * Constructor for the RoundScoreDisplay object
     * @param golfer
     */
    public RoundScoreDisplay(Subject golfer) {
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    /**
     * Updates the total stroke and par values for the round with the values from the hole
     * @param strokes strokes taken at a given hole
     * @param par par of the hole
     */
    public void update(int strokes, int par) {
        strokesTotal += strokes;
        parTotal += par;
        displayRoundScore();
    }

    /**
     * Displays the stroke and par totals for the current round, as well as if the player is
     * below, above, or at par
     */
    public void displayRoundScore() {
        int counter = 0;

        System.out.println("\nRound stats: " + "\nPar: " + parTotal + "\nStrokes: " + strokesTotal);

        if (strokesTotal > parTotal) {
            counter = strokesTotal - parTotal;
            System.out.println(counter + " over par");
        } else if (strokesTotal < parTotal) {
            counter = parTotal - strokesTotal;
            System.out.println(counter + " under par");
        } else {
            System.out.println("Making par");
        }
    }
}
