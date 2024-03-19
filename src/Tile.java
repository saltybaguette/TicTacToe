public class Tile {

    private int player;

    public Tile() {
        this.player = 0;
    }

    public int getPlayer() {
        return this.player;
    }

    public void setPlayer(int p) {
        this.player = p;
    }

    public String toString() {
        return ""+ this.player;
    }
    
}
