import java.util.*;
import java.io.*;
 class Lower
 {
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        String c1=sc.nextLine();
        sc.close();
       String[] nameArray = c1.split(" ");
       String name=nameArray[0];
       String lastName = c1.substring(c1.indexOf(" ") + 1).toUpperCase();
        String s=name.substring(0, 1).toUpperCase();
        String c3=s+name.substring(1);
      String c4=c3+" "+lastName;
        System.out.println(c4);
    }
}