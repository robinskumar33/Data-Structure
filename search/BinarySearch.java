public class BinarySearch {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,10};		
		System.out.println(search(arr,1));		
	}
	public static boolean search(int []a, int n) {
		int low=0;int high=a.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(a[mid]==n)//||a[low]==n||a[high]==n)
				return true;
			if(a[mid]<n) {
				low=mid+1;
				continue;
			}
			if(a[mid]>n) {
				high=mid-1;
				continue;
			}
		}
		return false;
	}
}
