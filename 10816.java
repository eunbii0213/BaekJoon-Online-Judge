import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	  public static void main(String[] args) throws IOException {
	   
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	    int N = Integer.parseInt(br.readLine()); //상근이가 가진 카드의 개수
	    String[] split = br.readLine().split(" "); //상근이가 가진 카드 
	   
	    HashMap<Integer, Integer> map = new HashMap<>(); //hashmap선언
	    //key=숫자카드의 숫자, value= 개수
	    
	    for (int i = 0; i < N; i++) { 
	      
	      int number = Integer.parseInt(split[i]); //상근이가 가진 카드 하나 
	      
          if(map.containsKey(number)){
              map.replace(number, map.get(number) + 1);
            } //중복으로 입력되는 숫자가 있다면 value값 늘려줌
          else {
        	  map.put(number, 1); 
          }//하나밖에 없다면 상근이가 가진 카드 넣고 ,1개로 설정.
	    } 
	    
	    StringBuilder stb = new StringBuilder(); 
	    
	    int M = Integer.parseInt(br.readLine()); //m입력받음
	    split = br.readLine().split(" "); //split배열 바꿔줌 
	    
	    for (int i = 0; i < M; i++) {
	      
	      int number = Integer.parseInt(split[i]); //찾을 숫자 하나
	       if (map.containsKey(number)) { 
	    	   
	    	   stb.append(map.get(number)+" "); 
	    	   
	    	   }//map에 찾고자하는 숫자가 있다면 몇개 가지고있는지 빼내온다
	       
	      else{
	    	  	stb.append(0+" "); 
	    	  } //없으면 그냥 0
	       
	      
	    }
	    
	    System.out.println(stb); 
	  
	  
   } 
}
