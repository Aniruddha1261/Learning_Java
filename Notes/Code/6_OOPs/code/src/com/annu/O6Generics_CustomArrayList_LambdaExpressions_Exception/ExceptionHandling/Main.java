package com.annu.O6Generics_CustomArrayList_LambdaExpressions_Exception.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
//        int c = a/b;  // Arithmetic Exception
        try {
//            int c = a / b;
//            divide(a, b);
//            throw new Exception("just for fun");
//            // mimicing
            String name = "Annu";
            if (name.equals("Annu")){
                throw new MyException("name is Annu");
            }
        } catch (MyException e){
            System.out.println(e.getMessage());
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println("normal Exception");
        } finally {
            System.out.println("this will always execute.");
        }
    }


    static int divide (int a ,int b) throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException("please do not divide by zero");
        }
        return a / b;
    }
}
