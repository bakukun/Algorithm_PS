import java.io.*;
import java.util.*;

public class Q2606 {
    public static int cnt;
    public static int n;

    // DFS 함수 정의
    public static void dfs(int[][]a,boolean[] visited, int x) {
        if(visited[x] == true) return;
        // 현재 노드를 방문 처리
        visited[x] = true;
        cnt++;

        for(int i=0;i<a[x].length;i++) {
            if(a[x][i]==1 && !visited[i])
                dfs(a,visited,i);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(bf.readLine());
        int m = Integer.parseInt(bf.readLine());
        boolean[] visited = new boolean[n+1];
        int[][] arr = new int[n+1][n+1];

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        dfs(arr,visited,1);
        bw.write(Integer.toString(cnt-1));
        bw.flush();
        bw.close();
    }
}

