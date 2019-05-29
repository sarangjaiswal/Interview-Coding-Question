package com.sarangjaiswal.JAVA_DESIGN_PATTERN.FACTORY_PATTERN;

// STEP 9: Create a Factory to generate object of concrete class based on the given information
public class ShapeFactory {
	
	// STEP 10: Create a getShape method to get object of type shape
	public Shape getShape(String shapeType) {
		if(shapeType == null) {
			return null;
		}
		if(shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if(shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}
}
