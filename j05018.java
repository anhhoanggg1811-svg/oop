import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class bd implements Comparable<bd>
{
    String key="HS";
    String msv;
    String name;
    public static int id=1;
    double tbm;
    String rank;
    public bd (String name,double tbm)
    {
        this.msv=String.format("%s%02d",key,id++);
        this.name=name;
        this.tbm=Math.round(tbm/12*10)/10.0;
        if(this.tbm>=9) this.rank="XUAT SAC";
        else if(8<=this.tbm) this.rank="GIOI";
        else if(this.tbm>=7) this.rank="KHA";
        else if(this.tbm>=5) this.rank="TB";
        else this.rank="YEU";
    }
    public String toString()
    {
        return this.msv+" "+this.name+" "+String.format("%.1f",this.tbm)+" "+this.rank;
    }

    public int compareTo(bd o) {
        if(this.tbm != o.tbm){
            return Double.compare(o.tbm,this.tbm);
        }
        else {
            return this.msv.compareTo(o.msv);
        }
    }
}
public class j05018 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        ArrayList<bd>l =new ArrayList<>();
        for(int j=1;j<=t;j++)
        {
            sc.nextLine();
            String name=sc.nextLine();
            double sum=0;
            for(int i=1;i<=10;i++)
            {
                if(i<=2)
                {
                    sum+=(sc.nextDouble()*2);
                }
                else {
                    sum+=sc.nextDouble();
                }
            }

            bd a= new bd(name,sum);
            l.add(a);
        }
        Collections.sort(l);
        for(bd x:l)
        {
            System.out.println(x);
        }
    }
}
