package creational.factory;

public class MagicMazeGame extends MazeGame {
    @Override
    protected Room makeRoom() {
    	System.out.println("MagicRoom is created.");
        return new MagicRoom();
    }
}