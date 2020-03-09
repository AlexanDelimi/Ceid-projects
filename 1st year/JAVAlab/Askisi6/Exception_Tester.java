public class Exception_Tester {
    public static void main(String args[]) {
        Exception_Tester et = new Exception_Tester();
        int x1;
        int x2;
        x1 = 5;
        x2 = 2;
        try {
            et.printResults(x1, x2);
        }
        catch (ArithmeticException ae) {
            System.out.println(ae.toString());
        } 
        finally {
            System.out.println("The numbers are: "+x1+" "+x2);
        }
    } 
    void printResults(int a, int b) {
        System.out.println("Add: "+(a+b));
        System.out.println("Sub: "+(a-b));
        System.out.println("Mul: "+(a*b));
        System.out.println("Div: "+(a/b));
        throw new ArithmeticException();
    } 
} 