abstract public class Line {
    private int startX;
    private int startY;
    private int length;
    private char theCharacter;

    public Line(int startX, int startY, int length)
    {
        this.startX = startX;
        this.startY = startY;
        this.length = length;
    }

    public Line() {
    }

    public char getTheCharacter()
    {
        return theCharacter;
    }
    public void setTheCharacter(char theCharacter)
    {
        this.theCharacter = theCharacter;
    }
    public int getLength()
    {
        return length;
    }
    public void setLength(int length)
    {
        this.length = length;
    }
    public int getStartX()
    {
        return startX;
    }
    public void setStartX(int startX)
    {
        this.startX = startX;
    }
    public int getStartY()
    {
        return startY;
    }
    public void setStartY(int startY)
    {
        this.startY = startY;
    }
    abstract boolean onLine(int x, int y);
}
