import javax.swing.*;
import java.awt.*;

public class TicTacToeViewer extends JFrame {
    // TODO: Complete this class
    // Your board must have labeled axes
    // The pieces in the board must be images. You’ve been provided with images, but
    //you may change them if you’d like.

    // instance varables
    // window size
    public final int WINDOW_WIDTH = 800;
    public final int WINDOW_HEIGHT = 600;

    // width of square and where it is supposed to be

    // images
   private Image xImage;
   private Image oImage;
   private TicTacToe t;

    // constructor
    public TicTacToeViewer(TicTacToe a) {
        this.t = a;
        xImage = new ImageIcon("Resources/X.png").getImage();
        oImage = new ImageIcon("Resources/O.png").getImage();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Tic Tac Tow");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setVisible(true);
    }

    public Image getxImage() {
        return xImage;
    }

    public Image getoImage() {
        return oImage;
    }

    // The winning squares should be filled in green
    // The winner should be displayed at the bottom of the window
    // How can you keep track of the data from the backend?
    public void paint(Graphics g) {
        // use t to connect to tictactoe

        // draw the grid
        g.setColor(Color.red);
        g.drawString("0", 200, 100);
        g.drawString("1", 300, 100);
        g.drawString("2", 400, 100);

        g.drawString("0", 100, 200);
        g.drawString("1", 100, 300);
        g.drawString("2", 100, 400);

        // have the square draw itself
        // drawing the board
        for (int i = 0; i < t.getBoard().length; i++) {
            for (int j = 0; j < t.getBoard()[0].length; j++) {
                // have the square draw itself
                g.setColor(Color.black);
                t.getBoard()[i][j].draw(g);
            }
        }
        // when the game is over
        if (t.getGameOver()){
            g.setFont(new Font("Serif", Font.BOLD, 50));
            if (t.checkTie()) {
                g.drawString("Tie", 200, 500);
            } else {
                String winner = t.getWinner();
                g.setColor(Color.black);
                g.drawString(winner + " wins!", 200, 500);
            }
        }


    }

}
