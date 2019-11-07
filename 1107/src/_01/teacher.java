package _01;

public class teacher implements BaseInterface  {

	@Override
	public void update() {
		System.out.println("update");

	}

	@Override
	public void delete() {
		System.out.println("delect");
	}

	@Override
	public void insert() {
		System.out.println("insert");
	}

	@Override
	public void select() {
		System.out.println("select");
	}

	

}
