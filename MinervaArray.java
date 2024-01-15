import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Sprit> lists = new ArrayList<>();
		Truth t = new Truth();
		Peace p = new Peace();
		Creation c = new Creation();
		
		lists.add(t);
		lists.add(p);
		lists.add(c);

		// 여기에 코드를 작성한다.
		// 1) ArrayList 를 객체를 생성하여 저장
		printSprit(lists);   // sprit 내용을 출력
	}
	
	static void printSprit(List<Sprit> lists){
		for(int i=0; i<lists.size(); i++){
			lists.get(i).print();
		}
	}
	
	// 여기에 코드를 작성한다.
	// 2) printSprit() 메소드를 구현하여 ArrayList 의 객체를 출력

}


abstract class Sprit {
	abstract void print();
}

class Truth extends Sprit {
	public void print() {
		System.out.println("진리_Truth");
	}
}

class Peace extends Sprit {
	public void print() {
		System.out.println("평화_Peace");
	}
}

class Creation extends Sprit {
	public void print() {
		System.out.println("창조_Creation");
	}
}