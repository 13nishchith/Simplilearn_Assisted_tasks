package Insertionsort;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertionSort b=new InsertionSort();
		int arr[]= {1,5,8,12,3};
		b.printarray(arr);
		b.insertionsort(arr);
		b.printarray(arr);
		

	}void printarray(int arr[]){
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
			
		}System.out.println();
	}

		
	void insertionsort(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			int pickedElement=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>pickedElement) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=pickedElement;
		}
	}

}
