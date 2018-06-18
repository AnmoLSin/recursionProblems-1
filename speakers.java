/*
We have mobile phone numbered 1,2,3... even no. of mobiles have 2 
speakers and odd no. of mobiles have 1 speaker,send no. of mobiles
to func and return total no. of speakers all mobile phones have.
 */
package recursion;

public class speakers {
    public static void main(String[] args) {
        int s=spek(4);
        System.out.println("Speakers  : "+s);
    }
    public static int spek(int n)
    {
        if(n==0)
            return 0;
        else if(n%2==0)
            return 2+spek(n-1);
        else if(n%2==1)
            return 1+spek(n-1);
        else 
            return 0;
    }
}
