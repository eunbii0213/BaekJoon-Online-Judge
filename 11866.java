import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

   public static void main(String[] args) throws IOException {
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      sb.append("<");
      
      int N = Integer.parseInt(st.nextToken());
      int K = Integer.parseInt(st.nextToken());
      
      br.close();
      
      int[] arr = new int[N];
      
      for(int i=0;i<N;i++) {
         arr[i]=i+1;
      }//1부터 N까지의 숫자로 배열 채움
      
      
      int count=0; // 0,1,2...k까지 세는 변수
      int indexNum=0;
      int changed=0;//숫자 몇 개 바꿨는지 세는 변수
      

      
      
      while(true) {
         
         indexNum++;
         
         if(indexNum>N) {
            //배열 끝까지 검사 다 했다면 다시 첫 번째 인덱스로 돌아감
            indexNum=1;
         }
         
         
         
         if(arr[indexNum-1]!=0) {
            //제거되지 않은 숫자라면 
            
            if(count==(K-1)) {
               //count는 0부터 시작하므로 K-1과 같을 때 숫자 제거함
               
               
               changed++; //제거된 개수 추가
               
               sb.append(arr[indexNum-1]);
               
               
               if(changed<=(N-1)) {
                  //바꿔주는 숫자가 마지막이 아니라면 
            	   sb.append(", ");
               }
               
               else {
                 //마지막 수를 제거했다면 ">" 추가해서 출력하고 while문 
            	  sb.append(">");
            	  System.out.println(sb);
                  break;
               }
            
               
               count=0; 
               
               
               arr[indexNum-1]=0; //제거함
                     
               continue;
            
            }
            
            
            count++;
            

         }//
      }//while문 끝


   }

}
