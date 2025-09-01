package calculator3;

public class Operation {
    public static double getResult(double numberA, 
        double numberB, String operate) {
        double result = 0d;
        switch (operate) {
            case "+":
                result = numberA + numberB;
                break;
            case "-":
                result = numberA - numberB;
                break;
            case "*":
                result = numberA * numberB;
                break;
            case "/":
                result = numberA / numberB;
                break;
            case "pow":
                result= Math.pow(numberA,numberB);
                break;
            default:
                throw new RuntimeException("不支持的运算");
        }
        return result;
    }
}
