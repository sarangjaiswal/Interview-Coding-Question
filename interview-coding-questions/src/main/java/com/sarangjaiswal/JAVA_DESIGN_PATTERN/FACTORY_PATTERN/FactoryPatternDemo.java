package com.sarangjaiswal.JAVA_DESIGN_PATTERN.FACTORY_PATTERN;

// STEP 11: Create a demo class to test the Factory pattern
public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape c = shapeFactory.getShape("CIRCLE");
		c.draw();
		
		Shape r = shapeFactory.getShape("RECTANGLE");
		r.draw();
		
		Shape s = shapeFactory.getShape("SQUARE");
		s.draw();
	}
}