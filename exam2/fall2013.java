public class fall2013{
    public static void main(String[] args){
        int i = 0;
int j = 1;
for(i = 1; i<4; i++){
for(j = 1; j<3; j++){
	for (int k = 0; k<j; k++) {
		System.out.println( (int)(k + j) );
	}
}
i++;
	System.out.println( "test" );
}
    }
}