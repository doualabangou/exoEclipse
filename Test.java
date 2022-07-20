 

import java.util.*;
//import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
 int[][] t={{1, 2,3}, {4,5,6}, {0,0,0}, {11,12,13}};
 int[][] tt={{0,0,0}, {1, 2,3}, {4,5,6}, {0,0,0}, {7,8,9}, {11,12,13}};
 int n=0;
 int d=(tt.length - t.length)+2;
 int[][] dt=new int[d][3];
 d=0;
 for (int i=0; i<tt.length; i++) {
for (int j=0; j<t.length; j++) {	 
 if (Arrays.equals(tt[i], t[j]))  { n++;}
}
if (n==1) {
	 System.out.print ("bon :"+"i= "+i+" n= "+n);
	 System.out.println (""); 		 
 } else {
  System.out.print ("mauvais :"+"i= "+i+" n= "+n+" d:"+d);
  System.out.println ("");
dt[d]=tt[i];
d++;  
}
 n=0;
 
}
System.out.println(dt.length);

 for (int i=0; i<dt.length; i++) {
	 //if (!((dt[i][1]==0) && (dt[i][2]==0))) {
	 for (int j=0; j<3; j++) {
 System.out.print(dt[i][j]+" :");
	 }
	 System.out.println("");
 }
	  
	 
}
}