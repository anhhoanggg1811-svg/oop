

import java.util.ArrayList;
import java.util.Scanner;
class sv
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

}
public class J05024 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<sv> l=new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {

            l.add(new sv(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        int q=sc.nextInt();sc.nextLine();
        while(q-->0)
        {

            String key =sc.nextLine();
            String tmp=key.toUpperCase();
            System.out.printf("DANH SACH SINH VIEN NGANH %s:\n",tmp);
            l.forEach( e-> {
                if (key.equals("Ke toan")) {
                    if (e.msv.substring(3,7).compareTo("DCKT")==0)
                    {
                        System.out.println(e);
                    }
                }
                else if(key.equals("Cong nghe thong tin"))
                {
                    if(e.msv.substring(3,7).compareTo("DCCN")==0 && !e.lop.startsWith("E"))
                    {
                        System.out.println(e);
                    }
                }
                else if(key.equals("An toan thong tin"))
                {
                    if(e.msv.substring(3,7).compareTo("DCAT")==0 && !e.lop.startsWith("E"))
                    {
                        System.out.println(e);
                    }
                }
                else if(key.equals("Vien thong"))
                {
                    if(e.msv.substring(3,7).compareTo("DCVT")==0 )
                    {
                        System.out.println(e);
                    }
                }
                else if(key.equals("Dien tu"))
                {
                    if(e.msv.substring(3,7).compareTo("DCDT")==0 )
                    {
                        System.out.println(e);
                    }
                }
            });
        }
    }
}
