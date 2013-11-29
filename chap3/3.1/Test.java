public class Test{
	public static void main(String[] args){
		Student st1 = new Student();
		Student st2 = new Student();
		//age=24  amount=100
		st1.age+=2;
		st2.age+=3;
		st2.amount+=100;
		System.out.println("st1.age "+st1.age);
		System.out.println("st2.age "+st2.age);
		System.out.println("st2.amount "+st2.amount);
		System.out.println("amount "+Student.amount);
	}
}
//st1.age 26
//st2.age 27
//st2.amount 200
//amount 200
