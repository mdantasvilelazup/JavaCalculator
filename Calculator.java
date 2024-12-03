public class Calculator {
    public static void main(String args[]) {
        double a = 1;
        double b = 2;
        int operation = 5;

        operate(a, b, operation);
    }

    static void operate(double a, double b, int operation) {
        switch(operation) {
            case 1:
                print(a + " + " + b + " = " + (a + b));
                break;
            case 2:
                print(a + " - " + b + " = " + (a - b));
                break;
            case 3:
                print(a + " * " + b + " = " + (a * b));
                break;
            case 4:
                print(a + " / " + b + " = " + (a / b));
                break;
        
            default:
                print("Operação inválida tente novamente");

        }
    }

    static void print(String string) {
        System.out.println(string);
    }

    static void print(double num) {
        System.out.println(num);
    }
}
