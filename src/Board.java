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


    public int getPlayer(int[] tile) {
        return this.getTile(tile).getPlayer();
    }

    public void setPlayer(int[] tile, int p) {
        this.getTile(tile).setPlayer(p);
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

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    private Tile getTile(int[] tile) {
        return this.tiles.get(tiles.size()-(width-tile[1])-(tile[0] * height));
    }

    public int countSameNeighbors(int[] tile, String dir) {
        int same = 0;
        int player = this.getPlayer(tile);
        switch (dir) {
            case "V":
                for(int i = tile[1]; i < this.height; i++) {
                    int[] next = new int[]{tile[0],i};
                    if(player == this.getPlayer(next)) {
                        same+=1;
                    }
                }
                for(int i = tile[1]; i >= 0; i--) {
                    int[] next = new int[]{tile[0],i};
                    if(player == this.getPlayer(next)) {
                        same+=1;
                    }
                }
                break;
            case "H":
                for(int i = tile[0]; i < this.width; i++) {
                    int[] next = new int[]{i,tile[1]};
                    if(player == this.getPlayer(next)) {
                        same+=1;
                    }
                }
                for(int i = tile[0]; i >= 0; i--) {
                    int[] next = new int[]{i,tile[1]};
                    if(player == this.getPlayer(next)) {
                        same+=1;
                    }
                }
                break;
            case "D":
                
                
                break;
        
            default:
                break;
        }
        return same;
    }
}
