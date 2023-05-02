/*첫째 줄에 행렬의 크기 N과 M이 주어진다. 둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다.
이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다. N과 M은 100보다 작거나 같고,
행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.
첫째 줄부터 N개의 줄에 행렬 A와 B를 더한 행렬을 출력한다. 행렬의 각 원소는 공백으로 구분한다.*/

import java.util.Scanner;

public class Main{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] arr = new int[n][m];
        
        for(int i=0;i<2;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<m;k++){
                    arr[j][k] += sc.nextInt();
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
}
}
}