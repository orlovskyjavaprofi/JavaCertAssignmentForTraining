package SCJPGenericsExamples;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

    public static void main(String[] args) {
// INSERT DECLARATION HERE
//Which statements could be inserted at // INSERT DECLARATION HERE to allow this code to
//compile and run? (Choose all that apply.)
//A. List<List<Integer>> table = new List<List<Integer>>();
 List<List<Integer>> table = new ArrayList<List<Integer>>(); // this works but its ugly !
//B. List<List<Integer>> table = new ArrayList<List<Integer>>();
//C. List<List<Integer>> table = new ArrayList<ArrayList<Integer>>();
//D. List<List, Integer> table = new List<List, Integer>();
//E. List<List, Integer> table = new ArrayList<List, Integer>();
//F. List<List, Integer> table = new ArrayList<ArrayList, Integer>();
//G. None of the above

        for (int i = 0; i <= 10; i++) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j <= 10; j++) {
                row.add(i * j);
            }
            table.add(row);
        }
        for (List<Integer> row : table) {
            System.out.println(row);
        }
    }
}

//This code from source SCJ´P 6 book