package _01;

public class Client extends teacher implements TeacherInterface{
	

	@Override
	public void teacher() {
		// TODO Auto-generated method stub
		System.out.println("teacher");
		
	}

	public static void main(String[] args) {
		teacher teach = new teacher();
		teach.insert();
		teach.delete();
		teach.update();
		teach.select();
		Client Cli = new Client();
		Cli.teacher();

	}

}
