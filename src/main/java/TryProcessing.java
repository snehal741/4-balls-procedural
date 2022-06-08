
import processing.core.PApplet;
public class TryProcessing extends PApplet{

    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    public static final int DIAMETER = 5;
    int x1 = 0, x2 = 0, x3 = 0, x4 = 0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        //ellipse(WIDTH/2, HEIGHT/2, 100, 100);
    }

    @Override
    public void draw() {
        drawCircle(x1, HEIGHT/5);
        drawCircle(x2, 2 * (HEIGHT/5));
        drawCircle(x3, 3 * (HEIGHT/5));
        drawCircle(x4, 4 * (HEIGHT/5));
        x1 = x1 + 1;
        x2 = x2 + 2;
        x3 = x3 + 3;
        x4 = x4 + 4;
    }

    private void drawCircle(int x, int y ) {
        ellipse(x, y, DIAMETER, DIAMETER);
    }

}

