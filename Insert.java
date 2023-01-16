public class ArrayList {
	int[] array = new int[5];
	int j=0;
	int[] insert(int num) {
		int[] temp=array.clone();
		if(j>array.length-1) {
		array=new int[array.length+5];
		for(int i=0;i<temp.length;i++) {
			array[i]=temp[i];
			}
			}
		array[j]=num;
		j++;
		temp=array.clone();
	    return array;
	}
	int[] delete(int num) {
		int l=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]==num) {
				array[i]=0;
				l=i;
				j--;
			}
			else {
				System.out.println("Elements not found");
				return array;
			}
		}
			for(int i=l;i<j;i++) {
				int temp= array[i];
				array[i]=array[i+1];
				array[i+1]=temp;
				
			}
			
		
		return array;
	}
	void print() {
		System.out.print("[");
		for(int i=0;i<j-1;i++) {
			System.out.print(array[i]+", ");
		}
		System.out.println(array[j-1]+"]");
	}
    public static void main(String[] args) {
    	ArrayList arr = new ArrayList();
    	arr.insert(6);
    	arr.insert(1);
    	arr.insert(2);
    	arr.insert(3);
    	arr.insert(4);
    	arr.insert(5);
    	arr.print();
    	arr.delete(9);
    	arr.print();
    	
}

}
