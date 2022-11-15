import java.io.*;
class Tableforloop
{
    public static void main(String args[])throws IOException
    {
        int tab,num,i;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.print("Enter the table no: ");
        num=Integer.parseInt(br.readLine());
        for(i=1;i<=10;i++)
        {
            tab=num*i;
            System.out.println(num+"*"+i+"="+tab);
        }
    }    
}

