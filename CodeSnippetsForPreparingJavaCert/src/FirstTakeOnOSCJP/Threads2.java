package FirstTakeOnOSCJP;
//Here is only one example taken from VCE pool

public class Threads2  implements Runnable{
    public void run(){
        System.out.println("run.");
        throw new RuntimeException("Problem");
    }
    
    public static void main(String[] args){
        Thread t = new Thread(new Threads2());
        t.start();
        System.out.println("End of method.");
    }

}

// Question which two can be results?
// give possible solutions
// A. java.lang.RuntimeException: Problem
// B. run.
//    java.lang.RuntimeException: Problem
// C. End of method.
//    java.lang.RuntimeException: Problem
// D. End of method.
//      run
//      java.lang.RuntimeException: Problem
// E. run.
//    java.lang.RuntimeException: Problem
//    End of method

//So what a right solution for this task, let thinks this trough
// Give you a minute
/*







Ok got it?
Right answers are D E
Lets go trough it: first D
first of main its own running in own thread, the thread run order is by java random , so
at first you get End of Method and then run as Output to Console and then after main an Exception thrown by the run method in the thread
explanation for E so as said earlier threads in java run in random order, you can't predict when one thread runs after another , the only 
thing which you garantee as i understand is thread safety of reference variables, methods and so on 
  
*/

