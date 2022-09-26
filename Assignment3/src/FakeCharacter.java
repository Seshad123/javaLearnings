import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;
public class FakeCharacter{
    private char arr[][];
    private int size;
    ArrayList<Line> arrayLst = new ArrayList<Line>();

    public void makePaths(int numPath)
    {
        HorizontalLine hl = new HorizontalLine();
        VerticalLine vl = new VerticalLine();
        int chse;
        Random rnd = new Random();
        for(int i =0; i <numPath; i++)
        {
            chse = rnd.nextInt(2);
            hl.setStartX(rnd.nextInt(arr.length));
            hl.setLength(rnd.nextInt());
            hl.setStartY(rnd.nextInt(arr.length));

            vl.setStartX(rnd.nextInt(arr.length));
            vl.setLength(rnd.nextInt());
            vl.setStartY(rnd.nextInt(arr.length));
            switch (chse) {
            case 1 :
                VerticalLine v = new VerticalLine(vl.getStartX(), vl.getStartY(), vl.getLength() );
                arrayLst.add(v);
                break;
            case 0:
                HorizontalLine h = new HorizontalLine(hl.getStartX(), hl.getStartY(), hl.getLength());
                arrayLst.add(h);
                break;
            }

       }
    }

    public void addCircles(int numCircle)
    {
        Random r = new Random();
        int arrSize = arr.length;

        for(int i = 0; i < numCircle; i ++) {
            int X = r.nextInt(arrSize);
            int Y = r.nextInt(arrSize);
            char circle = (char) 111;//'o'
            arr[X][Y] = circle;
        }

    }
    public FakeCharacter(int sizeOfArr, int numPaths) {
        this.size = sizeOfArr;
        arr = new char[sizeOfArr][sizeOfArr];
        makePaths(numPaths);
        for(int i =0; i<arr.length;i++)
        {
            for (int j = 0; j <arr[i].length;j++)
            {
                for(Line x: arrayLst)
                {
                    if(x.onLine(i, j))
                    {
                        arr[i][j] = x.getTheCharacter();
                    }
                }
            }
        }
        addCircles(4);
    }
    public void printCharacter()
    {
        for (int i = 0; i<arr.length; i++)
        {
            System.out.println();
            for(int j = 0; j <arr[i].length; j++)
            {
                if((char)arr[i][j] == '\u0000')
                {
                    System.out.print(" ");
                }
                else {
                    System.out.print((char)arr[i][j]);
                }
            }
        }
    }
}
