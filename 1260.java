
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//인접 행렬을 이용하면 1부터 순차적으로 접근하기 때문에 작은 노드부터 접근 

public class Main{
	
	static int[][] graph;
	static int N, M;
	static boolean[] visited;	//입력 케이스 +1
	static Queue<Integer> q = new LinkedList<>();
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());// 4 5 1입력 받음
		
		
		N = Integer.parseInt(st.nextToken()); //정점수 4
		M = Integer.parseInt(st.nextToken()); //간선수 5
		visited = new boolean[N+1];
		int V = Integer.parseInt(st.nextToken()); //탐색시작 정점 1
		
		graph = new int[N+1][N+1];//N개의 노드에 대한 인접행렬 
		
		for (int i = 0; i < M; i++) {
			 st = new StringTokenizer(br.readLine());
			int node1 = Integer.parseInt(st.nextToken());
			int node2 = Integer.parseInt(st.nextToken());
			
			//인접한 노드 정보 그래프에 채움 
			//ex) 2 4입력되면 배열의[2][4], [4][2]가 1로 채워져야함 
			graph[node1][node2] = 1;
			graph[node2][node1] = 1;
		}
		
		dfs(V);
		sb.append("\n");
		Arrays.fill(visited, false);	//방문배열 초기화
		
		bfs(V);
		System.out.println(sb);
		sb.setLength(0);				//StringBuilder 초기화
		Arrays.fill(visited, false);	//방문배열 초기화
		

	}
	
	private static void dfs(int v) {		
		//v노드부터 검사 시작 
		
		//들어오면  방문 설정
		visited[v] = true;
		sb.append(v).append(" ");
		
		//recursion 
		for (int i = 1; i <= N; i++) {
			if(graph[v][i] == 1 && !visited[i]) { 		
				//인접한 노드이고, 방문을 하지 않았다면
				dfs(i);
			}
		}
	}//dfs

	static void bfs(int v) {
		
		//본인 값 queue에 넣음 
		q.add(v);
		visited[v] = true;
		
		while(!q.isEmpty()) {
			
			v = q.poll();
			sb.append(v).append(" ");
			
			// 지금 검사하는 노드와 인접한 노드를 모두 queue에 넣는다 
			for (int i = 1; i <= N; i++) {
				if(graph[v][i] == 1 && !visited[i]) {
					q.add(i);			
					visited[i] = true;
				}
			}
		}//queue가 비었다면 탐색 끝! 
		q.clear();
	}
	
	

}
