package lab2.problem1.problemA;

public class MainA {

	public static void main(String[] args) {
		Shape3D cylinder = new Cylinder(3, 7);
		
		System.out.println("Cylinder volume: " + cylinder.volume());
		System.out.println("Suface area: " + cylinder.surfaceArea());
		
		Shape3D sphere = new Sphere(5);
		
		System.out.println("\nSpere volume: " + sphere.volume());
		System.out.println("Surface area: " + sphere.surfaceArea());
		
		Shape3D cube = new Cube(3);
		
		System.out.println("\nCube volume: " + cube.volume());
		System.out.println("Surface area: " + cube.surfaceArea());
	}

}
