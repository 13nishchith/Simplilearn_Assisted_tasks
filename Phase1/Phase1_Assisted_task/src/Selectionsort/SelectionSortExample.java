package Selectionsort;

public class SelectionSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectionSortExample b=new SelectionSortExample();
		int arr[]= {1,5,8,12,3};
		b.printarray(arr);
		b.selectionsort(arr);
		b.printarray(arr);
		

	}void printarray(int arr[]){
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
			
		}System.out.println();
	}

	
	void selectionsort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int min_idx=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min_idx]) {
					min_idx=j;
				}
				
	}
			int temp=arr[min_idx];
			arr[min_idx]=arr[i];
			arr[i]=temp;
			
}
		}
}
