package Chapter3SelfTestQuestionsSCJP;
//Thats is crazy but it is in the book so i should go trought!
//3. public class Bridge {
//4. public enum Suits {
//5. CLUBS(20), DIAMONDS(20), HEARTS(30), SPADES(30),
//6. NOTRUMP(40) { public int getValue(int bid) {
//return ((bid-1)*30)+40; } };
//7. Suits(int points) { this.points = points; }
//8. private int points;
//9. public int getValue(int bid) { return points * bid; }
//10. }
//11. public static void main(String[] args) {
//12. System.out.println(Suits.NOTRUMP.getBidValue(3));
//13. System.out.println(Suits.SPADES + " " + Suits.SPADES.points);
//14. System.out.println(Suits.values());
//15. }
//16. }

//Which are true? (Choose all that apply.)
//A. The output could contain 30
//B. The output could contain @bf73fa
//C. The output could contain DIAMONDS
//D. Compilation fails due to an error on line 6
//E. Compilation fails due to an error on line 7
//F. Compilation fails due to an error on line 8
//G. Compilation fails due to an error on line 9
//H. Compilation fails due to an error within lines 12 to 14

// Solution is A und B values() method has a reference to an array, not the content , man i hate such explicit code!