package ballgame;
import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame {


    public void launchFrame() {
        setSize(400, 400);
        setLocation(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        BallGame ballGame = new BallGame();
        ballGame.launchFrame();
    }
}
