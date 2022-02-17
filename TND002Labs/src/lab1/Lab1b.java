package lab1;

public class Lab1b {
   public static void main(String[] args) {
       // Creating an automated 'vector' by features from Vector.java
       Vector v1 = new Vector();
       // Printing said Vector
       System.out.print("v1 = ");
       System.out.println(v1);

       // Altering the default vector
       Vector newVdef = new Vector(1.0, 2.0, 3.0);
       // Altering the default vector to values of Vector "newVdef"
       v1.setDefault(newVdef);
       // Changing the values of v1 to those of new default vector
       v1.setToDefault();
       System.out.print("v1 = ");
       System.out.println(v1);

       // Creating a new Vector v1 with specific values
       Vector v2 = new Vector(1.0, 1.0, 2.0);
       System.out.print("v2 = ");
       System.out.println(v2);

       System.out.println("Length: " + v1.length());

       // Creating a new matrix to multiply into v1
       double[][] m1 = {{1.0, 0.0, 0.0}, {0.0, 1.0, 0.0}, {0.0, 0.0, 1.0}};
       // Printing the result of v1 after multiplying m1 into v1
       System.out.print("v1 = ");
       System.out.println(v1.matrixMult(m1));

       // Creating a new matrix to multiply into v1
       double[][] m2 = {{1.0, 0.0}, {0.0, 1.0}};
       // Printing the result of v1 after multiplying m2 into v1
       System.out.print("v1 = ");
       System.out.println(v1.matrixMult(m2));

       // Creating a new matrix to multiply into v1
       double[][] m3 = {{0.0, 1.0, 0.0}, {1.0, 0.0, 0.0}, {0.0, 0.0, 1.0}};
       // Printing the result of v1 after multiplying m3 into v1
       System.out.print("v1 = ");
       System.out.println(v1.matrixMult(m3));

       // Creating a new vector to contain v1 + v2
       Vector v1plusv2 = new Vector();
       v1plusv2 = v1plusv2.plus(v1, v2);
       // Printing the result of adding v1 and v2 to the console
       System.out.print("v1+v2 = ");
       System.out.println(v1plusv2);

       // Printing the result of subtracting v2 from v1 to the console
       System.out.print("v1-v2 = ");
       System.out.println(v1.minus(v2));
       // v1 now has the value of (v1-v2)

       //Printing the result of 2*v1 to the console
       System.out.print("2*v1 = ");
       System.out.println(v1.mult(2));

       // Printing the result of the scalar product between v1 and v2 to the console
       System.out.print("Scalar product between v1 and v2 = ");
       System.out.println(v1.mult(v2));

       // Printing the result of the length comparison of v1 and v2 to the console
       System.out.print("Length Comparison v2 to v1: ");
       System.out.println(v1.compareTo(v2));

       // Normalise v1 and v2
       v1.norm();
       v2.norm();
       // Printing the scalar products of v1 and v2 and v2 with itself to the console
       System.out.print("Scalar product between v1 and v2 = ");
       System.out.println(v1.mult(v2));
       System.out.print("Scalar product between v2 and v2 = ");
       System.out.println(v2.mult(v2));
   }
}

