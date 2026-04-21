import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class dn implements Comparable<dn>
{
    String mdn;
    String name;
    int amount;
    public dn(String mdn,String name,int amount)
    {
        this.mdn=mdn;
        this.name=name;
        this.amount=amount;
    }
    public int compareTo(dn o)
    {
        if(this.amount==o.amount)
        {
            return this.mdn.compareTo(o.mdn);
        }
        return Integer.compare(o.amount,this.amount);
    }
    public String toString()
    {
        return this.mdn+" "+this.name+" "+this.amount;
    }
}
public class J05028 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        ArrayList<dn>l=new ArrayList<>();
        while(t-->0)
        {sc.nextLine();
            l.add(new dn(sc.nextLine(),sc.nextLine(),sc.nextInt()));
        }
        Collections.sort(l);
        l.forEach(e->{
            System.out.println(e);
        });
    }
}
