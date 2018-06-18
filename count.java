/*
Occurence of a digit a number
 */
package recursion;

public class count {
    public static void main(String[] args) {
        int n=con(52353515);
        System.out.println("Occurence of 5 : "+n);
    }
    public static int con(int n)
    {
        if(n==0)
            return 0;
        else if(n%10==5)
        {
            return 1+con(n/10);
        }
        else
            return 0+con(n/10);
    }
}
