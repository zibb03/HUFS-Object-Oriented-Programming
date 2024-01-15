public class Main {

	public static void main(String[] args) {
		
		Examination[] t = { new MidTerm(false), new FinTerm(true) };

		for (Examination exam : t)
			exam.test();
	}
}


// 추상 클래스 Examination 를 작성하시오
public abstract class Examination(){
	boolean current;
	void test(){
		
	}
	String getCurrent();
}


// 구현 클래스 MidTerm 을 작성하시오
class MidTerm implements Examination{
	MidTerm(boolean current){ current = this.current; }
	
	@Override
	String getCurrent() { return "Mid-Term" }
}


// 구현 클래스 FinTerm 을 작성하시오
class FinTerm implements Examination{
	FinTerm(boolean current){ current = this.current; }
	
	@Override
	String getCurrent() { return "Fin-Term"}
}