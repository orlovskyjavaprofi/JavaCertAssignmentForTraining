package Chapter3SelfTestQuestionsSCJP;

class Fizz {
int x = 5;
public static void main(String[] args) {
final Fizz f1 = new Fizz();
Fizz f2 = new Fizz();
Fizz f3 = FizzSwitch(f1,f2);
System.out.println((f1 == f3) + " " + (f1.x == f3.x));
}
static Fizz FizzSwitch(Fizz x, Fizz y) {
final Fizz z = x;
z.x = 6;
return z;
} }

//What is the result?
//A. true true
//B. false true
//C. true false
//D. false false
//E. Compilation fails
//F. An exception is thrown at runtime

//Very nasty code well what the heck here is the solution , A is correct! z,f1,f3 are all references which refer to one and the same instace of Fizz.
//it should be quite obvious that object which marked as final can be changed!!!