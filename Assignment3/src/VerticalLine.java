public class VerticalLine extends Line{

    public VerticalLine(int X, int Y, int L)
    {
        super(X, Y, L);
        this.setTheCharacter((char)124);//'|' equivalent
    }

    public VerticalLine() {
    }

    @Override
  boolean onLine(int x, int y)
    {
        int endOfLine = getStartX() + getLength()-1;
        if(y == getStartY() && x >= getStartX() && x <= endOfLine)
        {
            return true;
        }
        else{
            return false;
        }
    }

}
