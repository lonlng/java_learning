package _01;

public class FactoryProducer{
	public static AbstractFactory getAbstractFactory(String choice) {
		if (choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		} else if (choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		}else{
			return new Others();
		}
	}
}
