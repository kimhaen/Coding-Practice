import java.util.*;

class Main {
  public static void main(String[] args) {
    
    //출력테스트

    System.out.println("+++++++++ 출력테스트 ++++++++++");
    String rtn = "";
    int[] sort = {};
    Lv1 lv1 = new Lv1();
    
    rtn = lv1.aaa();
    System.out.println(rtn);


    sort = lv1.solution();
    System.out.println(Arrays.toString(sort));


    //K번째 수 Solution

    System.out.println("+++++++++ K번째 수 Solution ++++++++++");
    int[] array = {1, 5, 2, 6, 3, 7, 4};
    int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

    int[] ans = {};

    ans = lv1.solution(array,commands);
    System.out.println(Arrays.toString(ans));

  }
}