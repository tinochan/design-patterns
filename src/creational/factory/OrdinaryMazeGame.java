package creational.factory;

public class OrdinaryMazeGame extends MazeGame {
    @Override
    protected Room makeRoom() {
    	System.out.println("OrdinaryRoonm is created.");
        return new OrdinaryRoom();
    }
}