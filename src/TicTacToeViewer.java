import javax.swing.*;
import java.awt.*;

public class TicTacToeViewer extends JFrame {
    // TODO: Complete this class
    // Your board must have labeled axes
    // The pieces in the board must be images. You’ve been provided with images, but
    //you may change them if you’d like.

    // instance varables
    // window size
    private final int WINDOW_WIDTH = 800;
    private final int WINDOW_HEIGHT = 600;

    // images
    private Image xImage;
    private Image oImage;
    private TicTacToe t;

    // constructor
    public TicTacToeViewer(TicTacToe t){
        this.t = t;
        xImage = new ImageIcon("Resources/X.png").getImage();
        oImage = new ImageIcon("Resources/O.png").getImage();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Tic Tac Tow");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setVisible(true);
    }

    // The winning squares should be filled in green
    // The winner should be displayed at the bottom of the window
    // How can you keep track of the data from the backend?
    public void paint(Graphics g) {
        // use t to connect to tictactoe

    }


}
