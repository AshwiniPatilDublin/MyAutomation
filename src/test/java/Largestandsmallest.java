public class Largestandsmallest {
    public static void main(String[] args) {
        int[] arr = {4,2,9,10,34,78};

        int max = arr[0];
        int min =arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max =arr[i];
            }
            if(arr[i]<min)
            {
                min =arr[i];
            }
        }
        System.out.println("Maximum number in an array is :" +max);
        System.out.println("Minimum number in an array is :" +min);
    }
}
