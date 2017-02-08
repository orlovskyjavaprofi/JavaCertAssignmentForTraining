package Chapter3SelfTestQuestionsSCJP;



class Alien {
String invade(short ships) { return "a few"; }
String invade(short... ships) { return "many"; }
}
class Defender {
public static void main(String [] args) {
System.out.println(new Alien().invade(7));
} }

//What is the result?
//A. many
//B. a few
//C. Compilation fails
//D. The output is not predictable
//E. An exception is thrown at runtime

// 
//Solution it fails due to widening problem invade(7) must use cast for assign value 
//