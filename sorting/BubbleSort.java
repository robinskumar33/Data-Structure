
public class BubbleSort {

	public static void main(String[] args)
	{
		int arr[]={56,5,33,24};
		for (int i = 0; i < arr.length; i++) 
		{
			//int least=arr[i];
			for (int j =i+1; j < arr.length; j++) 
			{
				if(arr[j]<arr[i])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
					
			}
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
