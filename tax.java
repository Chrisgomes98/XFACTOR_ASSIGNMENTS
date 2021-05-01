import java.io.*;
import java.lang.*;
public class Main {

    public static void main(String[] args)throws IOException
    {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter hour and minuite");
        int a=Integer.parseInt(input.readLine());
        int b=Integer.parseInt(input.readLine());
        System.out.println(Math.abs(30*a-5.5*b));
        
    }
}
