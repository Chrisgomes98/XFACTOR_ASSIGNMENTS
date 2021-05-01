import java.io.*;
public class Main {

    public static void main(String[] args)throws IOException
    {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter anual income and asset worth");
        int a=Integer.parseInt(input.readLine());
        int b=Integer.parseInt(input.readLine());
        System.out.println(0.01*a+0.0025*b);
        
    }
}
