import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int counter = 0;
	    
	    for(int i =0;i<n;i++)
	    {
	        for(int j = 0;j<n;j++)
	        {
	            System.out.print((++counter)+" ");
	        }
	        System.out.println();
	    }

	}
}
