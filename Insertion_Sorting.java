package Lec_09;
import java.util.*;
public class Insertion_Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=1;i<n;i++)
		{
			int last=i-1;
			while(last>=0 && arr[last]>arr[last+1])
			{
				int tmp=arr[last];
				arr[last]=arr[last+1];
				arr[last+1]=tmp;
				last--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
