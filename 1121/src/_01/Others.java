package _01;

public class Others extends AbstractFactory implements Color,Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Shape Draw Others ��������");
	}

	@Override
	public void fill() {
		// TODO Auto-generated method stub
		System.out.println("Color Fill Others ��������");
	}

	@Override
	public Shape getShape(String ShapeType) {
		// TODO Auto-generated method stub
		return new Others();
	}

	@Override
	public Color getColor(String ColorType) {
		// TODO Auto-generated method stub
		return new Others();
	}

}
