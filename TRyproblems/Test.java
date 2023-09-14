package TRyproblems;

public class Test {
	public static void main(String[] args) {
        String str = "tiger its a anitmal";
        char c = 't';
        int ct=0;
        for(int i:str.toCharArray()){
            if(i==c){
                ct++;
            }
        }
        if(ct>=1){
            System.out.println(ct);
        }
        else{
            System.out.println(0);
        }
    }
}
