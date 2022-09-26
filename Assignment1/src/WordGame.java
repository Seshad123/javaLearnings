import java.util.*;
public class WordGame
{
    char[][]arrHold ;
    boolean [][]reveal ;
    int row = 0;
    int col = 0;
   /* public void assign(int x, int y){
        for (int i=0; i<x; i++)
            for (int j=0; j < y; j++)  arrHold[i][j]='\0';
    }*/
    public char[][] fillBoard()
    {
        for(int i = 0; i < arrHold.length; i++)
        {
            for(int j =0; j < 2; j++)
            {
                char myChar = 'A';
                Random rand = new Random();
                row = rand.nextInt(arrHold.length);
                col = rand.nextInt(arrHold.length);
                //arrHold[row][col] = 'A';

                if (arrHold[row][col]== '\u0000')
                {
                    arrHold[row][col] = myChar;
                    myChar++;

                }
                //myChar++;
            }
        }
        return arrHold;
        }
        public void printBoard()
        {
            for(int i = 0; i <arrHold.length; i++)
            {
                for(int j =0; j <arrHold[i].length; j++)
                {
                    if(reveal[i][j]) {
                        System.out.print(arrHold[i][j] + "");
                    }
                    else{
                        System.out.print("+");
                    }
                }
                System.out.println();
            }
        }
        public WordGame(int x)
        {
            if(x % 2 == 0)
            {
                arrHold = new char[x][x];
                reveal = new boolean[x][x];
            }
            else
            {
                System.out.println("Must be an even number");
                return;
            }
            arrHold = fillBoard();
        }
        public void showPosition(int r, int c)
        {
            reveal[r][c] = true;
        }
        public void hidePos(int r, int c)
        {
            reveal[r][c] = false;
        }
        public boolean allRevealed()
        {
            boolean flag = false;

            for(int i = 0; i < reveal.length; i++)
            {
                for(int j = 0 ; j <reveal[i].length; j++)
                {
                    //System.out.println(reveal[i][j]);
                    if(reveal[i][j] = true)
                    {
                        flag = true;
                    }
                    else{
                        flag = false;
                    }
                }
            }
            return flag;
        }
        public boolean match(int row, int col, int row2, int col2)
        {
            if(arrHold[row][col] ==arrHold[row2][col2])
            {
                return false;
            }
            else{
                return false;
            }
        }
}
