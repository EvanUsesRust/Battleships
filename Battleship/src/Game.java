import java.io.IOException;

public class Game {
    public static Board b = new Board();
    public Game() throws IOException {
        System.out.print("Hello World");


        Graphics displayWindow = new Graphics();
        displayWindow.displayWindow();
        b.printBoard();
        for (int i=0;i<6;i++){
            b.random();
        }
        b.printBoard();
    }

}
