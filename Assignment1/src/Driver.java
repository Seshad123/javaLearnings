import java.util.*;
public class Driver
{
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What size would you like the board to be? (pick an even number!");

        int dimn = scan.nextInt();

        int finalDimn = dimn * dimn;
        WordGame stage = new WordGame(dimn);

        do
        {
            stage.fillBoard();
            stage.printBoard();
            System.out.println("Enter First Row");
            int rPick = scan.nextInt();

            System.out.println("Enter First Column");
            int cPick = scan.nextInt();

            stage.showPosition(rPick, cPick);
            stage.printBoard();
            System.out.println("Enter second Row");
            int rPick2 = scan.nextInt();

            System.out.println("Enter second Column");
            int cPick2 = scan.nextInt();

            stage.showPosition(rPick2, cPick2);
            stage.printBoard();
            if(stage.match(rPick, cPick, rPick2, cPick2) == false)
            {
                stage.hidePos(rPick, cPick);
                stage.hidePos(rPick2,cPick2);
            }
        }while(stage.allRevealed()==true);

    }
}
