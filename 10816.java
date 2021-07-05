import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.HashMap; 
import java.util.Map;


public class Main {
  public static void main(String[] args) throws IOException {
   
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    int n = Integer.parseInt(br.readLine()); 
    String[] split = br.readLine().split(" "); //
   
    Map<Integer, Integer> map = new HashMap<>(); //hashmap선언
    
    
    for (int i = 0; i < n; i++) { 
      
      int number = Integer.parseInt(split[i]); 
              if(map.containsKey(number)){
                map.replace(number, map.get(number) + 1);
              } 
               else{ map.put(number, 1); } 
    } 
    
    StringBuilder stb = new StringBuilder(); 
    
    int m = Integer.parseInt(br.readLine()); 
    split = br.readLine().split(" "); 
    
    for (int i = 0; i < m; i++) {
      
      int number = Integer.parseInt(split[i]); 
       if (map.containsKey(number)) { stb.append(map.get(number)); }
      else{ stb.append(0); } 
      if (i < m - 1) { stb.append(" "); } 
    } 
    
    
    System.out.println(stb); 
  
  
  } 
}

