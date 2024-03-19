import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TxtView extends View{
    

    public TxtView() {
    }

    public void Start() {
        System.out.println("game started");
    }


    public void showBoard(Board board) {
        System.out.println(board.toString());
    }

    public int[] getTurn() {
        int[] move = new int[2];

             // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
 
        // Reading data using readLine
        try {
            System.out.print("Please enter X cord:");
            move[0] = Integer.valueOf(reader.readLine());
            System.out.print("Please enter Y cord:");
            move[1]= Integer.valueOf(reader.readLine());
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        return move;
    }
}
