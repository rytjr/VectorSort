package VectorSort;

import java.util.*;

// 2차원 평면 위의 점 N개가 주어진다. 좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
//2차원 배열을 정렬하는 문제

import java.io.*;

public class VectorSort {
	public static void main(String[] args)throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int Num = Integer.parseInt(bf.readLine());
		
		int[][] arr = new int[Num][2];
		
		for(int i = 0; i < Num; i++) {
			st = new StringTokenizer(bf.readLine());
			for(int j = 0; j< 2; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		//병합정렬로 해보려 했으나 방법을 찾지 못하고 정렬 함수를 사용(다른방법을 찾지 못했음)
		 Arrays.sort(arr, (e1,e2) ->

	        {
            //e1[0]을 비교하면 x를 먼저 정렬하고 x가 같을 경우 y좌표를 비교하는 코드임 0과 1을 바꾸면 y좌표를 먼저 정렬하고 같을 경우 x좌표를 기준으로 정렬함
	        if (e1[0] == e2[0]) {

	        return e1[1] - e2[1];

	        }

	        else return e1[0] - e2[0];

	        });
		 
		 for(int i = 0; i < Num; i++) {
				System.out.println(arr[i][0] + " " + arr[i][1]);
			}
	}


}
