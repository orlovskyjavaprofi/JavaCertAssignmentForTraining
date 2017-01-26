package SCJPFailingTest;


public class SubSubAlpha extends Alpha {
    private SubSubAlpha(){
        s += "subsub ";
    }
    public static void main(String[] args) {
        new SubSubAlpha();
        System.out.println(s);
    }
  //This code has very bad smell but this is how exercises in book go, 
   // well in order to understand how this code works , you need to keep track on the constructor of the superclass
}
