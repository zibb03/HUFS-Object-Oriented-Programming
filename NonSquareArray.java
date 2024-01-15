// public class NonSquareArray {
//     public static void main(String[] args) {
//         int[][] A = {{10, 11, 12}, {20, 21}, {30, 31, 32}, {40, 41}};

//         for (int i = 0; i < A.length; i++) {
//             for (int j : A[i].length) 
//                 System.out.print(A[i]);
//         }
//     }
// }

public class NonSquareArray {
    public static void main(String[] args) {
        int[][] A = {{10, 11, 12}, {20, 21}, {30, 31, 32}, {40, 41}};

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println(); // 각 행을 출력한 후 줄 바꿈
        }
    }
}
