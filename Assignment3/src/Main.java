public class Main
{
    public static void main(String []args)
    {
        for(int i=0; i<5; i++) {
            FakeCharacter myChar=new FakeCharacter(5,10);
            myChar.printCharacter();
            System.out.println();
            System.out.println("~~~~~~~~~~");
        }
    }
}

