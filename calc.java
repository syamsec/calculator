import java.util.Scanner;
import java.lang.Math;
class AdvancedCalc {
   public static double sqrt(double number) {
    double t;
      double squareRoot = number / 2;
 
    do {
        t = squareRoot;
        squareRoot = (t + (number / t)) / 2;
    } while ((t - squareRoot) != 0);
 
    return squareRoot;
     }
     static double cbrt(double n,double low,double high){ 
    if(n==0) return n;
    double cbr =(low+high)/2;
    if(cbr*cbr*cbr-n<0.0001&&cbr*cbr*cbr-n>-0.0001){
        int cbr1=(int)(cbr+0.0001);
        if(cbr1*cbr1*cbr1==n) return cbr1;
        return cbr; }
    if (cbr*cbr*cbr>n) return cbrt(n,low,cbr); 
    if (cbr*cbr*cbr<n) return cbrt(n, cbr, high); 
    return cbr;
}
    public static void main(String[] args) {
   Scanner s =new Scanner (System.in);  
   double Fnum,Snum;
   char math;
    System.out.println("Enter your first Number");
     Fnum = s.nextInt();
    System.out.println("L~Log:\nS~Square Root:\nC~Cube Root\n*~multiplication\n/~division\n+~sum\n-~Subtraction");    
    math = s.next().charAt(0);
  
    switch (math){
    case 'L' :System.out.println("Logarithm of "+Fnum+" : " + Math.log(Fnum)); break;
    case 'S' :System.out.println("Square root of "+Fnum+" : "+ sqrt(Fnum)); break;
    case 'C' :System.out.println("Cube root of "+Fnum+" : "+(Fnum<0?"-"+cbrt(-Fnum,0.0,-Fnum):cbrt(Fnum,0.0, Fnum))); break;
   }
 if (math=='+'||math=='-'||math=='*'||math=='/'){
   System.out.println("Enter your Second Number");
     Snum = s.nextDouble();    
    switch (math){
    case '+' :System.out.println("Total :" + (Fnum + Snum) ); break;
    case '-' :System.out.println("Total :" + (Fnum - Snum) ); break;
    case '*' :System.out.println("Total :" + (Fnum * Snum) ); break;
    case '/' :System.out.println("Total :" + (Fnum / Snum) ); break;
  }
  }
  s.close();
  }
    }