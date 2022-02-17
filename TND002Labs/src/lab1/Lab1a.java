package lab1;

public class Lab1a {

   public static void main(String[] args) {
       double[] da1 = {1.0, 2.0, 3.0};
       double[] da2 = {0.0, -0.5, -2.0};
       printVector(addition(da1,da2));
       System.out.print("\n");
       printVector(subtraction(da1,da2));
   }

   public static double[] addition(double[] arg1, double[] arg2) {

       int length= Math.min(arg1.length, arg2.length);
       double[] sum_addition = new double[length];

       for (int i = 0; i < length; i++) {
           sum_addition[i] = arg1[i] + arg2[i];
       }

       return sum_addition;
   }

   public static double[] subtraction(double[] arg1, double[] arg2) {

       int length= Math.min(arg1.length, arg2.length);
       double[] sum_subtracted = new double[length];

       for (int i = 0; i < length; i++) {
           sum_subtracted[i] = arg1[i] - arg2[i];
       }

       return sum_subtracted;
   }

   public static void printVector(double[] arg) {
       String print = String.format("Vector = (%2.1f, %2.1f, %2.1f)",arg[0],arg[1],arg[2]);
       System.out.println(print);

   }

}

