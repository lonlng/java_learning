package _01;

public class PatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		AbstractFactory colorFactory = FactoryProducer.getAbstractFactory("COLOR");
		Color color1 = colorFactory.getColor("RED");
		color1.fill();
	}

}
