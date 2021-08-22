public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] x = {1,2,3,4,5,6};
        int temp[]=new int[x.length];

        for(int i=0,j=x.length-1;i<x.length/2;i++,j--){
            temp[i] = x[i];
            x[i] = x[j];
            x[j] = temp[i];
        }

        for(int i=0;i< x.length;i++){
            System.out.println(x[i]);
        }
    }
}
