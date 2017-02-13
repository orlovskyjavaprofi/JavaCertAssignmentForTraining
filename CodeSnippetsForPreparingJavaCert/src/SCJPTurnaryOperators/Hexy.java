package SCJPTurnaryOperators;

class Hexy {
public static void main(String[] args) {
Integer i = 42;
String s = (i<40)?"life":(i>50)?"universe":"everything";
System.out.println(s);
}
}

//A. null
//B. life
//C. universe
//D. everything
//E. Compilation fails
//F. An exception is thrown at runtime

//Compilation fails such instruction like in line 6 is not supported by the compiler