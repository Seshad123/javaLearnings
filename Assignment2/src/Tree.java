import java.util.*;
public class Tree
{
    private int height;
    private char myChar;

    public Tree()
    {
        this.height = height;
        if(height<0)
        {
            height = 0;
        }
        else{
            height = height;
        }
        myChar = 'V';

    }

    public char getMyChar()
    {
        return this.myChar;
    }
    public int getHgt()
    {
        return this.height;
    }
    public void setMyChar(char myChar)
    {
        this.myChar = myChar;
    }
    public void setHgt(int height)
    {
        this.height = height++;
    }
    public void grow(double mmRain) {
        if (mmRain >= 12.0)
        {
            height++;
            System.out.println("We are growing!");
        }
        else if (mmRain< 12.0)
        {
            System.out.println("We are not growing");
        }
       // System.out.println("height: "+  height);
    }

    public void drawMe()
    {

        for(int i=1; i<=height; i++){
            for(int j=(height-i)/2; j>0; j--){
                System.out.print(" ");
            }
            for(int k=0; k<i; k++){
                System.out.print(myChar);
            }
            System.out.println();

        }


    }
}
