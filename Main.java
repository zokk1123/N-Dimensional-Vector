public class Main {
    public static void main(String[] args) {
        Vector v2d = new Vector(3.0, 4.0); // 2D vector
        Vector v3d = new Vector(5.0, -2.0, 3.0); // 3D vector
        Vector v4d = new Vector(1.0, 2.0, 3.0, 4.0); // 4D vector

        System.out.println("2D: " + v2d);
        System.out.println("3D: " + v3d);
        System.out.println("4D: " + v4d);

        // Demonstrate get and set methods
        System.out.println("\nBefore modification - v2d[1]: " + v2d.get(1));
        v2d.set(1, 7.0);
        System.out.println("After modification - v2d[1]: " + v2d.get(1));


        // Demonstrate vector addition
        Vector v1 = new Vector(1.0, 2.0, 3.0);
        Vector v2 = new Vector(4.0, 5.0, 6.0);
        Vector sum = v1.add(v2);
        System.out.println("\n"+v1 + " + " + v2 + " = " + sum);

        // Demonstrate cloning
        Vector original = new Vector(1.0, 2.0, 3.0);
        Vector cloned = original.clone();
        System.out.println("\nOriginal: " + original);
        System.out.println("Clone: " + cloned);

        // Modify the original to show they're independent
        original.set(0, 99.0);
        System.out.println("\nOriginal: " + original);
        System.out.println("Clone: " + cloned);

        // Demonstrate equals method
        Vector a = new Vector(1.0, 2.0, 3.0);
        Vector b = new Vector(1.0, 2.0, 3.0);
        Vector c = new Vector(4.0, 5.0, 6.0);
        System.out.println("\n"+a + " equals " + b + ": " + a.equals(b));
        System.out.println(a + " equals " + c + ": " + a.equals(c));

        // Demonstrate iteration with for-each loop
        System.out.print("\nCoordinates of " + v3d + ": ");
        for (double coord : v3d) {
            System.out.print(coord + " ");
        }
        System.out.println();

    }
}