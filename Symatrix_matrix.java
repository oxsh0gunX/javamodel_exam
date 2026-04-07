import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of the matrix(nxn)");
int n=sc.nextInt();
int matrix[][]=new int[n][n];
System.out.println("Enter the elelmtn of the matrix");
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        matrix[i][j]=sc.nextInt();
    }
}

int flag=1;

for (int i=0;i<n;i++){
    for (int j=0;j<n;j++){
        if( matrix[i][j] != matrix[j][i] ){
            flag =0;
        }
    }
}

if (flag ==0){
    System.out.println("the matrix  is  not Symatrix");
}else {
System.out.println("the matrix  is   Symatrix");
}


    }
