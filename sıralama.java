import java.util.Arrays;
import java.util.Scanner;

public class sıralama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a,b,c;

        System.out.print("1.sayiyi giriniz : ");
        a=inp.nextInt();
        System.out.print("2.sayiyi giriniz : ");
        b=inp.nextInt();
        System.out.print("3.sayiyi giriniz : ");
        c=inp.nextInt();

        if(a>b && a>c &&b>c)
        {
            System.out.print(a+">"+b+">"+c);
        }
        if(a>b && a>c &&c>b)
        {
            System.out.print(a+">"+c+">"+b);
        }
        if(b>a && b>c &&a>c)
        {
            System.out.print(b+">"+a+">"+c);
        }
        if(b>a && b>c &&c>a)
        {
            System.out.print(b+">"+c+">"+a);
        }
        if(c>a && c>b &&a>b)
        {
            System.out.print(c+">"+a+">"+b);
        }
        if(c>a && c>b &&b>a)
        {
            System.out.print(c+">"+b+">"+a);
        }

    }
}
