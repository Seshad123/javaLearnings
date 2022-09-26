
public class HorizontalLine extends Line
{
    public HorizontalLine(int X, int Y, int L)
    {
        super(X, Y, L);
        setTheCharacter((char)45);
    }

    public HorizontalLine() {
        super();
    }

    @Override
     boolean onLine(int x, int y)
    {
        int endOfLine = getStartY() + getLength()-1;
        if(x == getStartX() && y >= getStartY() && y <= endOfLine)
        {
            return true;
        }
        else{
            return false;
        }
    }
}
