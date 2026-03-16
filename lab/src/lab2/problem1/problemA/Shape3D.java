package lab2.problem1.problemA;

abstract class Shape3D {
	abstract double volume();
	abstract double surfaceArea();

}

class Cylinder extends Shape3D {
	private double radius, height;
	
	
	
	Cylinder(double r, double h){
		this.radius = r;
		this.height = h;
	}
	
	@Override double volume() {
		return Math.PI * radius * radius * height;
	}
	
	@Override double surfaceArea() {
		return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
	}
}

class Sphere extends Shape3D{ 
	private double radius;
	
	Sphere(double r){
		this.radius = r;
	}
	
	@Override double volume() {
		return 4/3 * Math.PI * Math.pow(radius, 3);
	}
	
	double surfaceArea() {
		return 4 * Math.PI * radius * radius;
	}
}

class Cube extends Shape3D{
	private double a;
	
	Cube(double a){
		this.a = a;
	}
	
	double volume() {
		return Math.pow(a, 3);
	}
	
	double surfaceArea() {
		return 6 * a * a;
	}
}


