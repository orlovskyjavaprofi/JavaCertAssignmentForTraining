package SCJPInterfaceExampleSelfTest;

//There are 5 options one of them is correct one

//public abstract class Frob implements Frobnicate {
//public abstract void twiddle(String s) { }
//} <<- this will not work because of body in method

//this works!
public abstract class Frob implements Frobnicate { }

//public class Frob extends Frobnicate {
//public void twiddle(Integer i) { }
//} this not work because you can extend an interface in class , you 
//can only implement it !

//public class Frob implements Frobnicate {
//public void twiddle(Integer i) { }
//} this not works because the implemented method must first be overriden!

//public class Frob implements Frobnicate {
//public void twiddle(String i) { }
//public void twiddle(Integer s) { }
//} -> this works defenetly!
