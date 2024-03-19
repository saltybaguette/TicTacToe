
public class Game {

    int p1Score;
    int p2Score;
    int turn;
    //int[][] board;
    Board board;
    

    
    public Game() {
        this.p1Score = 0;
        this.p2Score = 0;
        this.turn = 1;
        this.board = new Board();
        //this.board = new int[3][3];
    }

    public void setMove(int x, int y) {
        board.setPlayer(x, y, turn);
    }

    public void switchTurn() {
        this.turn = (this.turn == 1 ? 2 : 1);
    }
}
