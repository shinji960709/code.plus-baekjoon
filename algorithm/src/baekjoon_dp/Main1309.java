package baekjoon_dp;

import java.util.*;

//������
public class Main1309 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int d[][] = new int[n+1][3];
		d[0][0] = 1;	// n=0
		d[0][1] = 1;
		d[0][2] = 1;
		
		for (int i = 1; i < n; i++) {
			d[i][0] = d[i-1][0] + d[i-1][1] + d[i-1][2];
			d[i][1] = d[i-1][0] + d[i-1][2];
			d[i][2] = d[i-1][0] + d[i-1][1];
		}
		
		System.out.println((d[n-1][0]+d[n-1][1]+d[n-1][2])%9901);

	}

}
