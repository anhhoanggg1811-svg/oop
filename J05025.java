import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class gv implements Comparable<gv>
{
    String name,last;
    String mgv;
    public static String key="GV";
    public static int id=0;
    String bomon;
    String mabomon;
    public gv(String name,String bomon)
    {
        this.mgv=String.format("%s%02d",key,++id);
        this.name=name;
        String[] d=name.split("\\s+");
        last = d[d.length-1];
        this.bomon=bomon;
        String[] b=bomon.split("\\s+");
        String c="";
        for(String x:b)
        {
            c+=Character.toString(x.charAt(0)).toUpperCase();
        }
        this.mabomon=c;
    }
    public int compareTo(gv o)
    {
        if(this.last.compareTo(o.last)==0)
        {
            return this.mgv.compareTo(o.mgv);
        }
        else
        {
            return this.last.compareTo(o.last);
        }
    }
    public String toString()
    {
        return this.mgv+" "+this.name+" "+this.mabomon;
    }
}
public class J05025 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        ArrayList<gv> l=new ArrayList<>();
        while(t-->0)
        {
            l.add(new gv(sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(l);
        for(gv x:l)
        {
            System.out.println(x);
        }
    }
}
