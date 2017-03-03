//Here is only one example taken from VCE pool
package FirstTakeOnOSCJP;

public class PingPong2 {
    synchronized void hit(long n){
        for (int i = 1; i < 3; i++)
            System.out.print(n + "-" + i + " ");
    }

}
