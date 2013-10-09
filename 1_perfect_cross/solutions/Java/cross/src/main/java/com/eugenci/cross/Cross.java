package com.eugenci.cross;
import java.util.*;
import java.io.*;


// Receives input n - width of perfect cross
// Returns a string with n*n characters where every n sequence is a
// delimited by \n character thus representing n lines of with n.
//
public class Cross {
  private int n;

  public Cross(int n) {
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

