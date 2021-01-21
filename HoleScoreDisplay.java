/**
 * Displays the score for the current hole for a Golfer
 * @author Brooks Robinson
 */
public class HoleScoreDisplay implements Observer {
    private Subject golfer;
    private int strokes;
    private int par;

    /**
     * Constructor for the HoleScoreDisplay object
     * @param golfer
     */
    public HoleScoreDisplay(Subject golfer) {
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    /**
     * Updates the total stroke and par values for the hole
     * @param strokes number of strokes taken at the hole
     * @param par par of the holes
     */
    public void update(int strokes, int par) {
        this.strokes = strokes;
        this.par = par;
        displayCurrentScore();
    }

    /**
     * Displays the strokes taken at the hole as well as the par of the hole
     */
    public void displayCurrentScore() {
        int counter = 0;

        System.out.println("Current hole stats: " + "\nPar: " + this.par + "\nStrokes: " + this.strokes);
        
        if (this.strokes > this.par) {
            counter = this.strokes - this.par;
            System.out.println(counter + " over par\n");
        } else if (this.strokes < this.par) {
            counter = this.par - this.strokes;
            System.out.println(counter + " under par\n");
        } else {
            System.out.println("Made par\n");
        }
    }
}
