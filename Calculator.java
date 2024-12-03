public class Calculator {
    public static void main(String args[]) {
        double a = 1;
        double b = 1;
        int operation = 1;

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
                if(b == 0) {
                    print("Divisão por 0 inválida, tente outra operação");
                    return;
                }
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
