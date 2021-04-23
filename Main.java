import java.util.*;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    String rtn = "";
    int[] sort = {};
    Lv1 lv1 = new Lv1();
    
    rtn = lv1.aaa();
    System.out.println(rtn);


    sort = lv1.solution();
    System.out.println(Arrays.toString(sort));

  }
}