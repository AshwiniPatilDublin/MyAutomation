public class Primepractice {
    public static void main(String[] args) {
        int num = 25;
        boolean isPrime = true;
      if(num<=1)
      {
          isPrime = false;
      }
      for(int i =2; i<=num%2; i++)
      {
          if(num%i==0);
          break;
      }
        System.out.println(num + (isPrime? " isPrime" :" is not prime"));
    }
}





