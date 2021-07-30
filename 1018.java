import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static boolean[][] whiteBoard;
	static boolean[][] blackBoard;
	static boolean[][] board;
	static int N;
	static int M;
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		whiteBoard = new boolean[N][M];
		blackBoard = new boolean[N][M];
		board = new boolean[N][M];
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(),"WB",true);
			for(int j=0;j<M;j++) {
				
				if(st.nextToken().equals("W")) {
					board[i][j]=true;
				}
				else {
					board[i][j]=false;
				}
				
			}
		}//board 입력 받음(흰색은 true, 검은색은 false)
		
		boolean white=true;
		
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				whiteBoard[i][j]=white;
				white=!white;
			}
			white=!white;
		}//모두 흰칸으로 채워줌
		
		
		boolean black = false;
		
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				blackBoard[i][j]=black;
				black=!black;
			}
			black=!black;
		}//모두 검은칸으로 채워줌
		
		int result=64; //최악의 경우
		int startpointY = N-8;
		int startpointX = M-8;
		
		for(int i=0;i<=startpointY;i++) {
			for(int j=0;j<=startpointX;j++) {
				result=Math.min(result, getCount(i,j,board));
			}
		}//최솟값을 찾음 
		
		System.out.println(result);
		
	}
	
	
	public static int getCount(int y, int x, boolean[][] board) {
		
		
			int whiteCount =0;
			int blackCount =0;
			
			for(int i=0;i<8;i++) {
				for(int j=0;j<8;j++) {
				
					if(board[y+i][x+j]!=whiteBoard[i][j]) {
						whiteCount++;
						
					}//체스판이 하얀색으로 시작하는 경우의 수 
					
					if(board[y+i][x+j]!=blackBoard[i][j]) {
						blackCount++;
						
					}//체스판이 검은색으로 시작하는 경우의 수 
			}
		}
			
		return (Math.min(whiteCount, blackCount));

		
	}
	
	

}
