package Lec_09;
import java.util.*;

public class Linear_Search {

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
			System.out.println("Not available");
		else
			System.out.println("Found at "+found+" position");
	}
public static int Search(int[]arr, int val)
{
	int loc=-1;
	for(int i=0;i<arr.length-1;i++)
	{
		if(val==arr[i])
			loc=i+1;
	}
	return loc;
}
}
