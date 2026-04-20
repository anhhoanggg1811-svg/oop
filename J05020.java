
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class sv implements Comparable<sv>
{
    String msv;
    String name;
    String lop;
    String email;
    public sv(String msv,String name,String lop,String email)
    {
        this.msv=msv;
        this.name=name;
        this.lop=lop;
        this.email=email;
    }
    public String toString()
    {
        return this.msv+" "+this.name+" "+this.lop+" "+this.email;
    }
    public int compareTo(sv o)
    {
        if(this.lop.equals(o.lop))
        {
            return this.msv.compareTo(o.msv);
        }
        return this.lop.compareTo(o.lop);
    }
}
public class J05020 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<sv> l=new ArrayList<>();
       int t=sc.nextInt();
       sc.nextLine();
       while(t-->0)
       {
           String msv=sc.next();
           sc.nextLine();
           String name=sc.nextLine();
           String lop=sc.next();
           String email=sc.next();
           sv a=new sv(msv,name,lop,email);
           l.add(a);
       }
        Collections.sort(l);
       for(sv x:l)
       {
           System.out.println(x);
       }
    }
}
