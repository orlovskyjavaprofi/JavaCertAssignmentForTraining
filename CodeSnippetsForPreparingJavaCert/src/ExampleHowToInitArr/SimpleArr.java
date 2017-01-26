package ExampleHowToInitArr;

public class SimpleArr {
//SimpleProgramm which init the aray with 10x10 field each cell+1!
    public static void main(String[] args) {
        int Feld[][] = new int[10][10];

        FeldInit(Feld);
    }

    public static void FeldInit(int[][] Feld) {
        int zwischenval = 0;
        for (int i = 0; i < Feld.length; i++) {
            for (int j = 0; j < Feld.length; j++) {
                if (j >= 1) {
                    Feld[i][j] = Feld[i][j - 1] + 1;
                }
                System.out.print(Feld[i][j] + " ");
                if ((j + 1) == Feld.length) {
                    zwischenval = Feld[i][j];
                    // System.out.println("Feld erreicht!" + zwischenval);
                }
            }
            System.out.println();
            if (i < Feld.length - 1) {
                Feld[i + 1][0] = zwischenval + 1;
                // System.out.println("i " + i + " " + Feld[i][0]);
            }
        }
    }

}
