
public class Game {

    int currentPlayer;
    //int[][] board;
    Board board;
    View view;
    int numPlayers;
    int winner;
    

    
    public Game() {
        this.numPlayers = 2;
        this.currentPlayer = 1;
        this.board = new Board();
        this.winner = -1;
    }
    public Game(View view) {
        this.numPlayers = 2;
        this.currentPlayer = 1;
        this.view = view;
        this.board = new Board();
        this.winner = -1;
    }

    public void start() {
        while(this.winner == -1) {
            int[] move = view.getTurn();
            this.setMove(move);
            this.checkWin(move);
            this.switchTurn();

        }
    }

    private void setMove(int[] move) {
        board.setPlayer(move, currentPlayer);
    }

    private void switchTurn() {
        this.currentPlayer = (this.currentPlayer == numPlayers ? 1 : this.currentPlayer+1);
    }

    private void checkWin(int[] move) {
        if(board.countSameNeighbors(move, "V") == board.getHeight() ||
           board.countSameNeighbors(move, "H") == board.getWidth()  ||
           board.countSameNeighbors(move, "D") == board.getHeight()) {
            this.winner = currentPlayer;
           }
    }
}
