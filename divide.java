import java.io.*;
public class HelloWorld {
    private static int divide(Integer numerator, Integer denominator)
    {
        if(numerator>=denominator)
        {
            return 1+divide(numerator-denominator,denominator);
        }
        else
        {
            return 0;
        }
    }
    public static void main(String[] args)throws IOException
    {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(input.readLine());
        int b=Integer.parseInt(input.readLine());
        int c=divide(a,b);
        System.out.println(c);
        
    }
}
