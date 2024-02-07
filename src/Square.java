import java.awt.*;

/**
 * A class written to support the TicTacToe Game.
 *
 * Each Square object is one position of the TicTacToe
 * board. It maintains information on the marker, its
 * location on the board, and whether it is part
 * of the winning set.
 *
 * @author: Nandhini Namasivayam
 * @version: Jan 2023
 */

public class Square {

    private String marker;
    private int row;
    private int col;
    private boolean isWinningSquare;
   // private  TicTacToe t;
    private TicTacToeViewer board;
    private Image o;
    private Image x;


    /**
     * Constructor to initialize one Square of the
     * TicTacToe board
     * @param row the row the square is in
     * @param col the column the square is in
     */
    public Square(int row, int col, TicTacToeViewer board) {
        this.row = row;
        this.col = col;

        this.marker = TicTacToe.BLANK;
        this.isWinningSquare = false;
        this.board = board;
        x = board.getxImage();
        o = board.getoImage();

    }

    /******************** Getters and Setters ********************/
    public String getMarker() {
        return this.marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public void setWinningSquare() {
        this.isWinningSquare = true;
    }

    /**
     * Checks if the square has the BLANK marker
     * @return True if the square is empty, False otherwise
     */
    public boolean isEmpty() {
        return this.marker.equals(TicTacToe.BLANK);
    }

    /**
     * @return the marker for the square
     */
    public String toString() {
        return this.marker;
    }
    // TODO: Our Square objects should be responsible for drawing themselves into the UI
    //TODO: How can our Square objects keep track of and interact with the TicTacToeViewer object?
    public void draw(Graphics g) {
        // square draw itself

        // should draw the right image
        g.setColor(Color.black);
        g.drawRect(150 + (row*100), 150 + (col*100), 100, 100);
        // if winningsquare
        if (isWinningSquare){
            //
            g.setColor(Color.GREEN);
            g.fillRect(150+ (col*100),150 + (row*100), 100, 100 );
        }
        if (marker == TicTacToe.O_MARKER){
            g.drawImage(o, 150 + (col * 100), 150 + (row * 100), 100, 100,board );
        }
        else if (marker == TicTacToe.X_MARKER){
            g.drawImage(x, 150 + (col * 100), 150 + (row * 100), 100, 100,board);
        }
        // public
        // draw the image
    }
}
