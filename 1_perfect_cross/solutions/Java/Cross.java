import java.util.*;
import java.io.*;


// Receives input n - width of perfect cross
// Returns a string with n*n characters where every n sequence is a
// delimited by \n character thus representing n lines of with n.
class PerfectCross {
  private int n;

  public PerfectCross(int n) {
    this.n = n;
  }  

  public String toStr(){

    StringBuffer perfectCross = new StringBuffer();
    StringBuffer line;

    for(int i=0; i< n; i++) {
      line = emptyLineBuilder(n);
      line.setCharAt(i, '*');
      line.setCharAt(n - i -1, '*');
      perfectCross.append("\n" + line);
    }  

    return perfectCross.toString();
  }

  private StringBuffer emptyLineBuilder(int length) {
    StringBuffer outputBuffer = new StringBuffer(length);

    for (int i = 0; i < length; i++){
      outputBuffer.append(" ");
    }
    return outputBuffer;
  }
}

class Cross {
  public static void main(String[] args){
    PerfectCross perfectCross = new PerfectCross(3);

    System.out.println(perfectCross.toStr());
  }
}
