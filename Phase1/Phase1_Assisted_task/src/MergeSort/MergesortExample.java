package MergeSort;

public class MergesortExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergesortExample obj = new MergesortExample();
		int arr[] = {6,1,4,2,59,8};
		obj.printarray(arr);
		obj.sort(arr, 0, arr.length-1);
		obj.printarray(arr);

	}void printarray(int arr[]){
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
			
		}System.out.println();
	}
static void merge(int[] arr,int left,int middle,int right) {
	int n1=middle-left+1;
	int n2=right-middle;
	int L[]=new int[n1];
	int R[]=new int[n2];	
	for(int i=0;i<n1;i++) {
		L[i]=arr[left+i];
	}
	for(int j=0;j<n2;j++) {
		R[j]=arr[middle+j+1];
	}
	int i=0;
	int j=0;
	int k=left;
	while(i<n1 && j<n2) {
		if(L[i]<R[j]) {
			arr[k]=L[i];
			i++;
		}else {
			arr[k]=R[j];
			j++;
		}
		k++;
	}
	while(i<n1) {
		arr[k++]=L[i++];
	}while(j<n2) {
		arr[k++]=R[j++];
	}
	}
	
	static void sort(int[] arr,int left,int right) {
		if (left<right) {
		int mid=(left+(right-1))/2;
		
		sort(arr,left,mid);
		sort(arr, mid+1, right);
		
		merge(arr,left,mid,right);
	}
	}
	
}
