package SCJPInitImportantRules;

public class Init {
    //At first glance this example did confused me, because of the way as it formated
    //Rules to observer
    //Think about this code twice
    //First the static initializer init once and in the order of written code
    //Second after the static initializer are done the instance initializer are called
    //only after the instance initializer are called after that fact the  constructor called
    
    Init(int x) { System.out.println("1-arg const"); }
    Init() { System.out.println("no-arg const"); }
    static { System.out.println("1st static init"); }
    { System.out.println("1st instance init"); }
    { System.out.println("2nd instance init"); }
    static { System.out.println("2nd static init"); }
    
    public static void main(String [] args) {
        new Init();
        new Init(7);
    }
}