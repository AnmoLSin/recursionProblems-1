/*
We have cats and each cat have 2 eyes,send no. of cats to
 a function and return total number of eyes all cats have
*/
package recursion;

public class cat_eyes {
    public static void main(String[] args) {
        int n=cat(5);
        System.out.println("Cat eyes : "+n);
    }
    public static int cat(int cats)
    {
        if(cats==0)
            return 0;
        else
        {
            return 2+cat(cats-1);
        }
    }
}