package Chapter3SelfTestQuestionsSCJP;

class Dims {

    public static void main(String[] args) {
        int[][] a = {{1, 2,}, {3, 4}}; // Line 3
        int[] b = (int[]) a[1];  // Line 5 
        Object o1 = a;  // Line 5 
        int[][] a2 = (int[][]) o1; // Line 6 
        int[] b2 = (int[]) o1;  //Line 7
        System.out.println(b[1]);  //Line 8
    }
}
//A. 2
//B. 4
//C. An exception is thrown at runtime
//D. Compilation fails due to an error on line 4
//E. Compilation fails due to an error on line 5
//F. Compilation fails due to an error on line 6
//G. Compilation fails due to an error on line 7

//Solution: C, nasty cody o1 refers to an int[][] not an int[]!