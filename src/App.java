public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        TxtView view = new TxtView();
        Game g = new Game(view);
        
        g.start();

        // view.Start();
        // while(true) {
        //     view.showBoard(g.board);
        //     int[] move = view.getTurn();
        //     g.setMove(move[1], move[0]);
        //     g.switchTurn();
        // }
    }
}
