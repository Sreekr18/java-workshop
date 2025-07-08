

public class ArithCalculator {
    int a=3,b=0;{

    
     try{
            if (b==0) 
            {
                throw new ArithmeticException("0 cant be a divisor");
            }
        }
        catch(ArithmeticException e)
        {
                System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println(ArithCalculator.add(a+b));
        System.out.println(a*b);
        System.out.println(a/b);
        
       
        ArithCalculator calculator=new ArithCalculator();

    }
}
