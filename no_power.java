/*
Find Power of a number by sending the base and power
 */
package recursion;

public class no_power {
    public static void main(String[] args) {
        int p=power(2,3);
        System.out.println("Result: "+p);
    }
    public static int power(int n1,int n2)
    {
        if(n2==0)
            return 1;
        else
        {
            return n1*power(n1,n2-1);
        }
    }
}
