package pack1;

public class Programmer extends Employee {
	int bonus=900;
	public void salarycal() {
		System.out.println("totala salary"+(bonus+salary));
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer p=new Programmer();
		p.salarycal();
		System.out.println(p.bonus);
		System.out.println(p.salary);
	}

}
