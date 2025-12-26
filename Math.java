public class Math {

    public Math() {

    }

/*     public static float getPi() {
        return 3.141592;

    } */

    public static int getFactorial(int wholeNumber) {
/*          if (wholeNumber == 1) {
            return 1;
         } else {
            return wholeNumber * getFactorial(wholeNumber - 1);
         } */
    int fact = 1;    
        for (int i = 1; i <= wholeNumber; i = i + 1) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String [] args) {
      /*   Math one = new Math();
        System.out.println(one.getPi());
         */
/* 
        System.out.println(Math.getPi()); */

       System.out.println(Math.getFactorial(7));
    }
}