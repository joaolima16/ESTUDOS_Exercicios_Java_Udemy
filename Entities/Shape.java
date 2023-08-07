package Entities;

import Entities.Enum.Color;

public abstract class Shape {
	private Color color;

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Shape(Color color) {
		super();
		this.color = color;
	}
	
	public abstract double area();
}
