package Lec_09;
import java.util.*;
import java.util.Scanner;

public class Selection_Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		for(int i=1;i<n;i++)
		{
			int max=0;
			int e=arr.length-i;
			for(int j=0;j<=e;j++)
			{
				if(arr[j]>arr[max])
					max=j;
			}
			int tmp=arr[max];
			arr[max]=arr[e];
			arr[e]=tmp;
		}
System.out.println(Arrays.toString(arr));
	}

}
