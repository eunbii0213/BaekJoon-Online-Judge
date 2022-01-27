import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st;
       TreeMap<Integer,Integer> map= new TreeMap<>();

       int t = Integer.parseInt(br.readLine());

       while(t>0){

           int n = Integer.parseInt(br.readLine());

           for(int i=0;i<n;i++){

               st = new StringTokenizer(br.readLine());

               String str = st.nextToken();
               int number = Integer.parseInt(st.nextToken());

               if(str.equals("I")){
                   //넣을 때 마다 count증가
                   map.put(number,map.getOrDefault(number,0)+1);
               }else{
                   if(!map.isEmpty()) {
                       if (number == 1) {
                           //최댓값 삭제
                           int target = map.lastKey();
                           int re = map.get(map.lastKey()); //value에 저장된 건 반복횟수(동일 숫자 개수)

                           map.remove(target);
                           re--;
                           for(int j=0;j<re;j++){

                               map.put(target,re);
                           }
                       } else {
                           //최솟값 삭제
                           int target = map.firstKey();
                           int re = map.get(map.firstKey()); //value에 저장된 건 반복횟수(동일 숫자 개수)

                           map.remove(target);
                           re--;
                           for(int j=0;j<re;j++){
                               map.put(target,re);
                           }
                       }
                   }

               }

           }

           if(map.isEmpty()){
               System.out.println("EMPTY");
           }else{
               System.out.println(map.lastKey()+" "+map.firstKey());
           }

           map.clear();

           t--;
       }

    }

}
