public class spring2013{
    public static void main(String args[]){
        int[] A = {3,4,2,1,5,6};
        boolean check = true;
        /*int temp;
        int temp1;
        while(check){
            check = false;
            for(int i = 0; i<A.length-1; i++){
                if(A[i]>A[i+1]){
                    temp = A[i];
                    temp1 = A[i+1];
                    A[i+1] = temp;
                    A[i] = temp1;
                    check = true;
                }
            }
        }
        for(int j = 0; j<A.length; j++){
           System.out.println(A[j]);
    }*/
    int key = 4;
    int low = 0;
    int high = 5;
    while(low<=high){
        int mid = (int)(low + high) / 2;
        if(key == A[mid]){
            System.out.println("key found");
            break;
        }else if(key<A[mid]){
            high = mid - 1;    
        }else{
            low = mid + 1;
        }
        
    }
    }
}