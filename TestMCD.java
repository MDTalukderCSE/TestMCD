package homework1;

import java.util.Arrays;
/**
 * 
 * @author Asif Talukder
 */
public class TestMCD {

    // returns the minimmum common denominator
    public static int mcd(int a, int b) {
	if(a==b)
	    return a;
	else if (a>b) 
	    return mcd(a-b,b);
	else
	    return mcd(b-a,a);
    }

    public static int largest(int arr[]){
	assert(arr.length>0);
	int curLargest=arr[0];
	for(int i=1; i<arr.length; ++i) {
	    if(arr[i]>curLargest) 
		curLargest=arr[i];
	}
	return curLargest;
    }

    public static void main(String args[]) {
        
	 System.out.println("Hello ! SE Class, This is Asif");
         int arr[]={1,3,4,5,6,7,15,13,2};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        //System.out.println(Arrays.toString(arr));
        System.out.println("****************************** ");
        System.out.println("The largest value in Arr is :"+largest(arr));
}
	
    }

