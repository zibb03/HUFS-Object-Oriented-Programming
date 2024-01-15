public class Main {

	public static void main(String[] args) {
		
		final int SIZE = 10;
		final int RANDOM = 100;
		int inArray[] = new int[SIZE]; // 배열 생성된 값 저장
		int resultA[] = new int[SIZE]; // 배열 정렬된 값 저장
		
		for(int i=0; i<SIZE; i++){
			int temp = (int) (Math.random() * 100) + 1;
			inArray[i] = temp;
			resultA[i] = temp;
		}
		for(int i=0; i<SIZE; i++){
			for(int j=0; j<SIZE-i-1; j++){
				if(resultA[j] < resultA[j+1]){
					int temp = resultA[j];
					resultA[j] = resultA[j+1];
					resultA[j+1] = temp;
				}
			}
		}
		// temp = 77;
		// result[i] = 51;
		// result[i+1] = temp;
		// 여기에 코드를 작성하시오
		System.out.print("생성된 값(inArray) : ");
		for(int print:inArray){
			System.out.print(print+" ");
		}
		System.out.println();
		System.out.print("정렬된 값(resultA) : ");
		for(int print:resultA){
			System.out.print(print+" ");
		}
		
		
	}
}