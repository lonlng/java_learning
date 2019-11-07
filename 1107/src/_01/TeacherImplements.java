package _01;

public class TeacherImplements extends BaseImplements implements TeacherInterface{
	

	@Override
	public void teacher() {
		// TODO Auto-generated method stub
		System.out.println("teacher");
		
	}

	public static void main(String[] args) {
		BaseImplements teach = new BaseImplements();
		teach.insert();
		teach.delete();
		teach.update();
		teach.select();
		TeacherImplements Cli = new TeacherImplements();
		Cli.teacher();

	}

}
