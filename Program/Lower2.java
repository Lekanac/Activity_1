import java.util.*;
import java.io.*;
 class Lower2
 {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        String c1=sc.nextLine();
        String c2=sc.nextLine();
        sc.close();
       String[] nameArray1 = c1.split(" ");
       String[] nameArray2 = c2.split(" ");
       String name_1=nameArray1[1];
       String name_2=nameArray2[1];
       if(name_1.equals(name_2))
{
System.out.println("Yes");
}
else
{
System.out.println("No");
}
}
}

