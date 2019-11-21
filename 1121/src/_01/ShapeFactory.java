package _01;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String ShapeType) {
		// TODO Auto-generated method stub
		if(ShapeType==null){
			return null;
		}else if (ShapeType.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		}else if(ShapeType.equalsIgnoreCase("SQUARE")){
			return new Square();
		}else if (ShapeType.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		}else {
			return new Others();
		}
	}

	@Override
	public Color getColor(String ColorType) {
		// TODO Auto-generated method stub
		return null;
	}

}
