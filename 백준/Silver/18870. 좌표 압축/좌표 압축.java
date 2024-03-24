import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int input_num[] = new int[n];//입력받는 숫자 객체 배열 만듦
    int sorting_num[] = new int[n];//정렬된 숫자 객체 배열
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    
    for(int i=0;i<n;i++){
      sorting_num[i] = input_num[i] = scanner.nextInt();
    }
    Arrays.sort(sorting_num);//java.util.Arrays의 sort()함수를 이용하여 키 값 기준정렬  
    int rank = 0;
    for(int sorted:sorting_num){
      if(!map.containsKey(sorted)){//해당 키가 존재하지 않을 경우에만 순위를 할당해줌
        map.put(sorted, rank);
        rank++;
      }
    }
    StringBuilder sb = new StringBuilder();//기존의 데이터에 더함(mutable)
    for(int input:input_num){
      int ranking = map.get(input);//입력받은 숫자(키)의 랭킹(값)을 읽음
      sb.append(ranking).append(' ');
    }
    System.out.println(sb);
    scanner.close();
  }
}