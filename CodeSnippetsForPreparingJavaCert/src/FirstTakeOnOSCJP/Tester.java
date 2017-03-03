package FirstTakeOnOSCJP;

public class Tester implements Runnable{
  static PingPong2 pp2 = new PingPong2();
  
  public static void main(String[] args){
      new Thread(new Tester()).start();
      new Thread(new Tester()).start();
  }
  
  public void run(){ pp2.hit(Thread.currentThread().getId());}
}

//Which statement is true

/*
    A. The output could be 5-1 6-1 6-2 5-2
    B. The output could be 6-1 6-2 5-1 5-2
    C. The output could be 6-1 5-2 6-2 5-1
    D. The output could be 6-1 6-2 5-1 7-1

*/

// I was very puzzled to see such question, because thread in Java run in random order , and 
// Most time its very difficult to predict what exactly the output will be 
// If you run this example you will understand what i mean


//Right answer is B (give by the VCE)
