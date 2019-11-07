package _02;

public class Phone extends AbstractPhone{
	public Phone(){
		this.b=new B1();
		this.c=new C1();
		this.d=new D1();
	}

	public static void main(String[] args) {
	
		Phone phone =new Phone();
		phone.b.battery();
		phone.c.CPU();
		phone.d.display();
			
	}

}
