public class SampleClass {
    public static void main(String[] args) {
        NumberContainer myNumber = new NumberContainer();
        multiplyNumbers(myNumber, 12, 3);
        System.out.println("Result = " + myNumber.number);
    }

    public static void multiplyNumbers(NumberContainer result, int firstNumber, int secondNumber) {
        // result = new NumberContainer(); // creates new instance of result variable
        result.number = firstNumber * secondNumber;
    }
}
