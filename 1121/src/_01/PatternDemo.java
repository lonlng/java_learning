package _01;

public class PatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		AbstractFactory colorFactory = FactoryProducer.getAbstractFactory("COLOR");
		Color color1 = colorFactory.getColor("REWD");
		color1.fill();
		AbstractFactory shapeFactory = FactoryProducer.getAbstractFactory("SHqAPE");
		Shape shape1 = shapeFactory.getShape("SQUARE");
		shape1.draw();
	}

}
