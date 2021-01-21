public class HoleScoreDisplay implements Observer {
    private Subject golfer;
    private int strokes;
    private int par;

    public HoleScoreDisplay(Subject golfer) {
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    public void update(int strokes, int par) {
        this.strokes = strokes;
        this.par = par;
        displayCurrentScore();
    }

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
