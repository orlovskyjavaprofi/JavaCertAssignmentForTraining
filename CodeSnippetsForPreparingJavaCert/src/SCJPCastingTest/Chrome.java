package SCJPCastingTest;


public class Chrome {
    public static void main(String[] args) {
        X x1 = new X();
        X x2 = new Y();
        Y y1 = new Y();
        //here are possible candidates
        //x2.do2(); does not worke because of reference type x!
        //(Y)x2.do2(); does not worke because of reference type x even if it casted still not working! 
        ((Y)x2).do2(); // this works , probably here is example how to acces instace of reference type! 
        
        
    }
}
