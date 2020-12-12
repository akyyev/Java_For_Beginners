package Medium.project_Shapes;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Shape implements Comparable<Shape> {

	protected double height;
	protected String name;
	protected final double PI = Math.PI;
	protected double baseArea;
	protected double basePerimeter;

	abstract public double getArea();

	abstract public double getVolume();

	abstract public double getPerimeter();

	DecimalFormat df = new DecimalFormat("0.0");

	public String toString() {
		return "Name: " + this.name + "\t Area: " + df.format(this.getArea()) +
				"\t Perimeter: " + df.format(this.getPerimeter()) + "\t Volume: " + df.format(this.getVolume());
	}

	public String toString(int a) {
		return this.name + " Area: " + df.format(this.getArea());
	}
}

class RectangularPrism extends Shape{
	
	
	private double length;
	private double width;
	
	public RectangularPrism(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
		this.name = "Prism";
		baseArea = this.length*this.width;
		basePerimeter = 2*(this.length+this.width);
	}
	
	@Override
	public double getArea() {
		return 2*baseArea+height*basePerimeter;
	}
	@Override
	public double getVolume() {
		return baseArea*height;
	}
	
	@Override
	public double getPerimeter() {
		return 2*basePerimeter+4*height;
	}

	@Override
	public int compareTo(Shape o) {
		return this.getArea()>o.getArea()? 0:-1;
	}



	
	
	
	
}




class Rectangle extends RectangularPrism{
	
	
	private double length;
	private double width;
	
	
	
	public Rectangle(double length, double width) {
		super(length, width, 0);
		this.name = "Rectangle";
	}
	
	@Override
	public double getArea() {
		return this.baseArea;
	}
	@Override
	public double getVolume() {
		return super.getVolume();
	}
	
	@Override
	public double getPerimeter() {
		return this.basePerimeter;
	}
	
	
}

class Square extends Rectangle{
	
	public Square(double sidelength) {
		super(sidelength, sidelength);
		this.name = "Square";
	}
	
}

class Cylinder extends Shape{
	
	@Override
	public int compareTo(Shape o) {
		return this.getArea()>o.getArea()? 0:-1;
	}
	
	protected double radius;
	
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.name = "Cylinder";
		this.height = height;
		baseArea = PI*Math.pow(radius,2);
		basePerimeter = 2*PI*radius;
	}
	@Override
	public double getArea() {
		return this.baseArea+this.basePerimeter*height;
	}
	@Override
	public double getVolume() {
		return baseArea*height;
	}
	@Override
	public double getPerimeter() {
		return 2*basePerimeter+2*height;
	}
	
}

class Circle extends Cylinder{
	
	
	public Circle(double radius) {
		super(radius,0);
		this.name = "Circle";
	}
	
	@Override
	public double getArea() {
		return this.baseArea;
	}
	
	@Override
	public double getPerimeter() {
		return this.basePerimeter;
	}
	
}





