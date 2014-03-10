import java.util.*;
public class MagicSquarex{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
			System.out.println("Enter a odd number for the dimensions");
			int d=input.nextInt();
			int mat[][]=new int[d][d];
			int boxes=d*d;
			int row=0;
			int col=d/2;
			int i=1;
			while(i<boxes){
				mat[row][col]=i;
				row-=1;
				col+=1;
				i++;
				if(mat.get[row][col]!=0){
					row+=2;
					col-=1;
					if(mat.get[row][col]!=0){
						row-=2;
					}

				}else if(row<0&&col>mat[row].length-1){
					row+=2;
					col-=1;
					if(mat.get[row][col]!=0){
						row-=2;
					}
				}else if(row<0){
					row=mat.length-1;
					if(col>mat[row].length-1){
						col=0;
						if(mat.get[row][col]!=0){
							row+=2;
							col-=1;
							if(mat.get[row][col]!=0){
							row-=2;
							}
						}
					}
				}else if(col>mat[row].length-1){
			  		col=0;
			  		if(mat.get[row][col]!=0){
							row+=2;
							col-=1;
							if(mat.get[row][col]!=0){
							row-=2;
							}
						}
			  }


}
		System.out.print("[");
        for (int x = 0; i < d; i++) {
            for (int y = 0; y < d; y++) {
                System.out.print(mat[x][y]);
                if (x < d && y < d-1)System.out.print(",");
                if (x == d-1 && y == d-1)System.out.print("]");
            }
            System.out.println();
}
}
}