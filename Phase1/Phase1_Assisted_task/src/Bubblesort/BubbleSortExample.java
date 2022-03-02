package Bubblesort;

public class BubbleSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSortExample b=new BubbleSortExample();
		int arr[]= {1,8,4,10,12,7,3};
		b.printarray(arr);
		b.bubblesort(arr);
		b.printarray(arr);
		

	}void printarray(int arr[]){
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
			
		}System.out.println( );
	}
	
	void bubblesort(int arr[]){
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j-1]>arr[j]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

}
