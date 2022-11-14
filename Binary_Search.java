package Lec_09;
import java.util.*;
public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int val=sc.nextInt();
		int found=Search(arr,val);
		if(found==-1)
			System.out.println("Not Found");
		else
			System.out.println("Found at pos "+ (found+1));
	}
public static int Search(int[]arr, int val)
{
	int s=0;
	int e=arr.length-1;
	int mid=0;
	while(s<=e)
	{
		mid=(s+e)/2;
		if(arr[mid]==val)
			return mid;
		else if(val>arr[mid])
			s=mid+1;
		else
			e=mid-1;
	}
	return -1;
}
}
