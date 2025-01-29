public class Circle {
    public static void main(String[] args) {
        int radius = 10; // Radius of the circle
        int centerX = 20; // X coordinate of the circle center
        int centerY = 10; // Y coordinate of the circle center
        int width = 40; // Width of the grid
        int height = 20; // Height of the grid

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                // Equation of a circle: (x - centerX)^2 + (y - centerY)^2 = radius^2
                if (Math.pow(x - centerX, 2) + Math.pow(y - centerY, 2) <= Math.pow(radius, 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
