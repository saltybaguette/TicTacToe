import java.util.ArrayList;

public class Board {
    private int height;
    private int width;
    
    private ArrayList<Tile> tiles;

    public Board() {
        this.height = 3;
        this.width = 3;

        this.tiles = initializeBoard(this.height*this.width);
    }


    public int getPlayer(int x, int y) {
        return this.tiles.get(x*y).getPlayer();
    }

    public void setPlayer(int x, int y, int p) {
        this.tiles.get(tiles.size()-(width-y)-(x * height)).setPlayer(p);
    }

    public String toString() {
        String s = "";

        for(int i = 0; i < tiles.size(); i+=width) {
            for(int j = 0; j < width; j++){
                s+=tiles.get((i+j)).toString();
                //s+=(i+j) + "";
                if(width == (j+1) ) {
                    s+= "\n";
                }
                else {
                    s+="|";
                }
            }
        }
        return s;
    }

    private ArrayList<Tile> initializeBoard(int size) {
        ArrayList<Tile> tiles = new ArrayList<Tile>();
        for(int i = 0; i < size; i++) {
            tiles.add(new Tile());
        }
        return tiles;
    }
}
