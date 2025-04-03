import java.util.Random;
public class Board {
   private boolean [][] board = new boolean[8][8];
    Random random = new Random();

    public void Attack(int x,int y){

    }

   public void printBoard(){
       // System.out.println("hello world");
       for (int i = 0;i<8;i++){
           for (int j = 0;j<8;j++){
               System.out.print("[");
               if(board[j][i]) System.out.print("X");
               else System.out.print(" ");


               System.out.print("]");

           }
           System.out.println();
       }
   }
   public boolean boardacsess(int row,int col){
        return board[row][col];
   }
   public void random(){
       int randdir=random.nextInt(0,2);
       int randx = random.nextInt(1,7);
       int randy = random.nextInt(1,7);
       System.out.print(randdir);


       //try{
       for (int i = 0;i<2;i++){
           System.out.println("i= "+i);
           if (board[randx][randy-i] || board[randx-i][randy]){
               board[randx][randy] = false;

               i = -1;
               System.out.print("collision restarting");
               randx = random.nextInt(1,7);
               randy = random.nextInt(1,7);
               continue;
           }
           if(randdir == 0  )//up and down

               board[randx][randy-i] = true;
           if(randdir == 1)

               board[randx-i][randy] = true;
       }

       //board[randx][randy] = true;




   }

}
