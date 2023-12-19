package Mypackage;


import java.util.Scanner;



class ReturmMothodValue{

    int squareRoot(int value){
    return  value*value;
    }
}
        

public class Object_with_Return_Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for square root = ");
        int v = sc.nextInt();
        
        ReturmMothodValue ret = new ReturmMothodValue();
        System.out.println("Mothod Value = "+ret.squareRoot(v));
           
        System.out.println("Enter a number for square root = ");
        int vv = sc.nextInt();
        
        ReturmMothodValue rett = new ReturmMothodValue();
        System.out.println("Mothod Value = "+rett.squareRoot(vv));
        
    }
 
}
