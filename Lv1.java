import java.util.*;

class Lv1 {

  public String aaa(){
  String a ="";

  a = "aaa";
  /*  public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        array[4] = 0;
        i=2;
        j=5;
        k=3;
        
        for(l=0;l<array.length;l=j){
            
            if(l=i){
            commands = array[l];
            i++;
            }
        }
        
        system.out.print(commands);
        
        return answer;
    }
    */
  return a;
  }


  public int[] solution() {
        int[] answer = {1,2,3,4};
        
       /*   i=2;
        j=5;
        k=3;
        
        for(l=0;l<array.length;l=j){
            
            if(l=i){
            commands = array[l];
            i++;
            }
        }
        
        */
        
        return answer;
    }
  

  public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i=0; i<commands.length; i++) {
            int[] result = new int[commands[i][1] - (commands[i][0]-1)];
            
            for (int j=0; j<result.length; j++) {
                result[j] = array[j + commands[i][0]-1];
            }
            Arrays.sort(result);
            answer[i] = result[commands[i][2]-1];
        }
        
        return answer;
    }


  
}