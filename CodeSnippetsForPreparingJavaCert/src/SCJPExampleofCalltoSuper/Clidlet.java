package SCJPExampleofCalltoSuper;

public class Clidlet extends Clidder {

    public final void flipper() {
        System.out.println("Clidlet");
    }

    public static void main(String[] args) {
        new Clidlet().flipper();
    }
    
    //In this example the question is about the result
    //Hint: think about what happens when the super constructor called
    
    //possible Result
    // Clidlet
    // Clidder
    // Clidder Clidlet
    // Clidlet Clidder
    //compieler failure
}
