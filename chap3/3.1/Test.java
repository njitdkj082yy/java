public class Test{
//final usage:
// mTempMatrix can't changed,not the context of mTempMatrix[..]
private static final float[] mTempMatrix = new float[16];
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
		final float[] temp = mTempMatrix;
		temp[1] = 3.0f;
		temp[1] = 5.0f;
		System.out.println("mTempMatrix[1]: "+mTempMatrix[1]);
	}
}
//st1.age 26
//st2.age 27
//st2.amount 200
//amount 200
