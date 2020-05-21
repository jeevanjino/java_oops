package exercise;

 class one {
	 int row;
	 int column;
	static int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};

	public one(int row ,int column) 
	{
		this.row=row;
		this.column=column;
	}
}	

public class Matrix{
	public static void main(String[] args) {
	one s=new one(3,3);
	int i,j;
	for( i=0;i<s.row;i++) {
		for( j=0;j<s.column;j++)
		{
			System.out.print(s.arr[i][j]+" ");	
		}
		System.out.println("\n");	
		
	
	}
	}

}