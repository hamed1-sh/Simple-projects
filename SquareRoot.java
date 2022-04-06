package square.root;
import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double a,low=0,high=0;
        double i=2;
        boolean s =true;
        System.out.print("please insert a number :");
        a = input.nextDouble();
        while(s)
        {
            i++;
            if(i * i > a)
            {
                high =i;
                low = i-1;
                s = false;
                System.out.println(binary(high,low,a));
            }
            else if(i*i==a)
            {
                System.out.println((int)i);
                s=false;
            }
        }

        
    }
    static double binary(double high,double low,double s)
    {
        double c = (high+low)/2.0;
        
        while(Math.abs(s-(c*c)) >0.0000001)
        {
            if((s - (c*c)) > 0)
            {
                 return binary(high,c,s);
            }
            else
            {
                return binary(c,low,s);
            }
        }
        return c;
    }
}
