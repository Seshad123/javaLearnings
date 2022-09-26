import java.util.*;
public class main
{
    static double rain;
    public static void main(String[]args)
    {
       Tree tree = new Tree();
       ArrayList<Double> L1=new ArrayList<>();
       tree.setHgt(0);
       for (int i =1; i <= 20; i++)
       {
           System.out.println("Year " + i);
         double Va1=  inchesRain(L1);
           tree.grow(inchesToMM(Va1));
           tree.drawMe();
           System.out.println();
           fire(tree,L1);
       }
    }
   public static double inchesToMM(double inches)
    {

        double mm = inches * 25.4;
        System.out.println("Rain this year in inches: " + inches + "\nRain this year in mm: " + mm);
        return mm;
    }
    public static double last3YearInInches(ArrayList<Double> arr)
    {
        double avg = 0;
        double sum = 0;
      //  ArrayList<Double> arr = new ArrayList<Double>();
        if(arr.size()<3)
        {
            return 100;
        }
        else{
            int oneLastIndx = arr.size()-3;
            int twoLastIndx = arr.size()-2;
            int lastIndx = arr.size()-1;
            Double lastElmnt = arr.get(lastIndx);
            Double secondLastElmnt = arr.get(twoLastIndx);
            Double thirdLastElmnt = arr.get(oneLastIndx);

            sum = lastElmnt + secondLastElmnt + thirdLastElmnt;
            avg = sum/3;
          //  System.out.println(avg);
        }
        return avg;
    }

    public static void fire(Tree t1, ArrayList<Double> D1)
    {
      //  ArrayList<Double>arr = new ArrayList<Double>();
       double Value = last3YearInInches(D1);
        if(Value <0.5)
        {
            System.out.println("Oh no we had a fire!");
            t1.setMyChar('|');
        }
        else{
            t1.setMyChar('V');
        }
    }
    public static double inchesRain(ArrayList<Double> List1)
    {
        Random rand = new Random();
       // ArrayList<Double> arr = new ArrayList<Double>();
        rain = rand.nextFloat(2);
        List1.add(rain);
        //System.out.println(arr.size());

       // System.out.println(arr);//to make sure the random number is actually added to the array.
        return rain;
    }
}
