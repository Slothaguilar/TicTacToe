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

        // draw the grid
        g.drawString("0", 200, 100);
        g.drawString("1", 300, 100);
        g.drawString("2", 400, 100);

        g.drawString("0", 100, 200);
        g.drawString("1", 100, 300);
        g.drawString("2", 100, 400);

        // have the square draw itself
        // t.getBoard()[0][0].draw(g);
        for (int i = 0; i < t.getBoard().length; i++){
            for (int j = 0; j < t.getBoard()[0].length; j++){
                t.getBoard()[i][j].draw(g);
                // update the fornt end with each move
                // ask for the marker , X or O and place where they are
                if (t.getBoard()[i][j].getMarker() == TicTacToe.O_MARKER){
                    // draw an o
                    // g.drawImage(oImage, i, j, this);
                    g.drawImage(oImage,150 + (j *100), 150 + (i*100),100, 100, this);
                }
                else if (t.getBoard()[i][j].getMarker() == TicTacToe.X_MARKER){
                    // dran an X in teh place
                    //g.drawImage(xImage,i, j, this);
                    g.drawImage(xImage,150 + (j *100), 150 + (i*100),100, 100, this);
                }
                // print out the winner
                if (t.getGameOver()){
                    // first check tiq
                    if (t.checkTie()){
                        g.drawString("Tie", 300, 500);
                    }
                    else{
                        // get winner
                        String winner = t.getWinner();
                        // TODO: set the squares to green

                        // print out who one
                        g.drawString(winner + " wins!", 300, 500);
                    }

                }
            }
        }




    }


}
