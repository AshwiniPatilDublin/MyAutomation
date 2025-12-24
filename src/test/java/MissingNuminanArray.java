public class MissingNuminanArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6};
        int n = arr.length+1;
        int totalSum = n*(n+1)/2;
        int arraySum = 0;

        for(int num :arr)
        {
            arraySum = arraySum+num;
            System.out.println("Missing number: " + (totalSum - arraySum));

        }
    }
}
