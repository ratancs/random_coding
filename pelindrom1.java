/*Find the largest palindrome made from the product of two 3-digit numbers*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


  public class pelindrom1 {

/**
 * @param args
 * @throws IOException 
 */
static int[] arry = new int[6];
static int[] arry2 = new int[6];

public static boolean chk()
{
    for(int a=0;a<arry.length;a++)
        if(arry[a]!=arry2[a])
            return false;

return true;

}

public static void main(String[] args) throws IOException {
    // TODO Auto-generated method stub

    InputStreamReader ir = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(ir);
    int temp,z,i;

for(int x=999;x>100;x--)
    for(int y=999;y>100;y--)
        {
        i=0;
            z=x*y;
            while(z>0)
                {
                    temp=z%10;
                    z=z/10;
                    arry[i]=temp;
                    i++;
                }

            for(int k = arry.length;k>0;k--)
                        arry2[arry.length- k]=arry[k-1];

    if(chk())
    {
        System.out.print("pelindrome = ");

for(int l=0;l<arry2.length;l++)
System.out.print(arry2[l]);
System.out.println(x);
System.out.println(y);
}

    }
}
}
