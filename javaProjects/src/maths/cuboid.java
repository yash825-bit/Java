package maths;

import java.util.*;

public class cuboid {
    public static void main(String[] args) {
        int length, breadth, height, totalAreaOfCuboid, volumeOfCuboid, perimeterOfCuboid;

        System.out.println("Enter the values of length, breadth and height: ");
        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();

        int areaFrontBack = 2 * (length * height);
        int areaLeftRight = 2 * (breadth * height);
        int areaTopBottom = 2 * (length * breadth);

        totalAreaOfCuboid = areaFrontBack + areaLeftRight + areaTopBottom;
        volumeOfCuboid = length * breadth * height;
        perimeterOfCuboid = 2 * length + 2 *breadth;

        System.out.println("Total area of maths.cuboid: " + totalAreaOfCuboid);
        System.out.println("Volume of maths.cuboid: " + volumeOfCuboid);
        System.out.println("Perimeter of maths.cuboid: " + perimeterOfCuboid);
    }
}
