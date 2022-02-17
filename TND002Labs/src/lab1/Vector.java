package lab1;

public class Vector {

   private double x, y, z;

   public static Vector vdef = new Vector(0, 0, 0);


   /**
    * Vector() method is called when creating a variable without specific values,
    * it automatically sets to the default values
    */
   public Vector() {
       setToDefault();
   }

   /**
    * This method is called when you want to create a vector with specific values,
    * can be done in declaration or later on
    * @param d1 given value of x
    * @param d2 given value of y
    * @param d3 given value of z
    */
   public Vector(double d1, double d2, double d3) {
       x = d1;
       y = d2;
       z = d3;
   }

   /**
    * This method gives the default vector the values of given vector
    * @param v, given vector with values for x, y and z
    */
   public static void setDefault(Vector v) {
       vdef.x = v.x;
       vdef.y = v.y;
       vdef.z = v.z;
   }

   /**
    * Changes values of x, y and z in calling vector to the values of its default vector
    */
   public void setToDefault() {
       x = vdef.x;
       y = vdef.y;
       z = vdef.z;
   }

   /**
    * The method takes in two vectors and adds their values together in a vector and
    * returns said vector
    * @param arg1 1st vector
    * @param arg2 2nd vector
    * @return The value of both vectors values added together
    */
   public static Vector plus(Vector arg1, Vector arg2) {
       Vector sum_addition = new Vector();

       sum_addition.x = arg1.x + arg2.x;
       sum_addition.y = arg1.y + arg2.y;
       sum_addition.z = arg1.z + arg2.z;

       return sum_addition;
   }

   /**
    * The method takes in a given vector and removes its values from the
    * calling vector's values
    * @param arg Vector which values are removed from the calling vector
    * @return returns the new values of the calling vector
    */
   public Vector minus(Vector arg) {

       x -= arg.x;
       y -= arg.y;
       z -= arg.z;

       return this;

   }

   /**
    * The method takes in a given value and removes the given value from
    * all of the calling vector's coordinates
    * @param arg given value
    * @return the calling vector after given value is removed
    */
   public Vector mult(double arg) {
       x *= arg;
       y *= arg;
       z *= arg;

       return this;
   }

   /**
    *
    * @param arg
    * @return
    */
   public double mult(Vector arg) {

       double sum = 0;
       double[] callingVector = {x, y, z};
       double[] argVector = {arg.x, arg.y, arg.z};
       int length = argVector.length;

       for (int i = 0; i < length; i++) {
           sum += argVector[i] * callingVector[i];
       }
       return sum;
   }

   public double length() {
       return Math.sqrt(x * x + y * y + z * z);
   }

   public Vector matrixMult(double[][] arg) {
       int row = arg.length;
       int column = arg[0].length;

       if (row == 3 && column == 3) {
           double[] former_xyz = {x, y, z};
           double[] new_xyz = {0, 0, 0};
           for (int i = 0; i < row; i++) {
               for (int a = 0; a < row; a++) {
                   new_xyz[i] += former_xyz[a] * arg[a][i];
               }
           }
           x = new_xyz[0];
           y = new_xyz[1];
           z = new_xyz[2];
       }

       return this;
   }

   public void norm() {
       double length = this.length();
       x /= length;
       y /= length;
       z /= length;
   }

   public int compareTo(Vector arg) {
       if (this.length() == arg.length()) {
           return 0;
       }
       if (this.length() > arg.length()) {
           return 1;
       } else {
           return -1;
       }
   }

   public String toString() {
       return String.format("Vector = (%2.1f, %2.1f, %2.1f)",x,y,z);
   }

}

