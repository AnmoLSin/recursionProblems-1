/*
Factorial of a number
 */
package recursion;

public class fact {
    public static void main(String[] args) {
        int f=fact(5);
        System.out.println("Factorial : "+f);
    }
    public static int fact(int n)
    {
        if(n==0)
            return 1;
        else
            return n*fact(n-1);
    }
}
