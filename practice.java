import java.util.Arrays;

public class practice{
    public static void main(String args[]){
        int[] list = {1, 2, 7, 3, 4, 5, 6};
        int target = 4;
        int z = 0;
        int a = 0;
        for (int i = 0; i<list.length; i++){
            if(list[i] == target){
                
            }
            else{
                a++;
            }
        }
        int[] n = new int[a];
        for(int i = 0; i<list.length; i++){
                if(list[i] == target){
                    z++;
                }else{
                    n[i-z] = list[i];
                }
            }
        for(int i = 0; i<a; i++){
            System.out.println(n[i]);
        }
    }
}