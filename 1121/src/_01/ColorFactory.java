package _01;

public class ColorFactory extends AbstractFactory {

	@Override
	public Shape getShape(String ShapeType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Color getColor(String ColorType) {
		// TODO Auto-generated method stub
		if (ColorType == null) {
			return null;
		} else if (ColorType.equalsIgnoreCase("RED")) {
			return new Red();
		}else if (ColorType.equalsIgnoreCase("GREEN")){
			return new Green();
		}else if(ColorType.equalsIgnoreCase("BLUE")){
			return new Blue();
		}
		return null;

	}
	
	

}
