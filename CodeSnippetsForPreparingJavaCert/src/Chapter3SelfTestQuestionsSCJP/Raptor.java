package Chapter3SelfTestQuestionsSCJP;

public class Raptor {
static { System.out.print("r1 "); }
public Raptor() { System.out.print("r2 "); }
{ System.out.print("r3 "); }
static { System.out.print("r4 "); }
}
class Bird {
{ System.out.print("b1 "); }
public Bird() { System.out.print("b2 "); }
}
class Hawk extends Raptor {
public static void main(String[] args) {
System.out.print("pre ");
new Hawk();
System.out.println("hawk ");
}
}

//A. pre b1 b2 r3 r2 hawk
//B. pre b2 b1 r2 r3 hawk
//C. pre b2 b1 r2 r3 hawk r1 r4
//D. r1 r4 pre b1 b2 r3 r2 hawk
//E. r1 r4 pre b2 b1 r2 r3 hawk
//F. pre r1 r4 b1 b2 r3 r2 hawk
//G. pre r1 r4 b2 b1 r2 r3 hawk
//H. The order of output cannot be predicted
//I. Compilation fails

// And the solution is: D first output r1 r4 due to static init in class raptor, 
// after that pre was called, than per default call to super which is bird b1 and the constructor b2, back to subclass raptor r3 r2, and then back to
//class hawk with hawk
