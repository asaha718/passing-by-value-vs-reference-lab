public class SampleClasstwo {
    public static void main(String[] args) {
        StringContainer myString = new StringContainer();
        myString.text = "initial value";
        addText(myString, " - adding new text");
        System.out.println("modified text: " + myString.text);
    }

    public static void addText(StringContainer result, String newText) {
        result.text = result.text + newText;
    }
}

// public class SampleClass {
//     public static void main(String[] args) {
//         String myString = "initial value";
//         addText(myString, " - adding new text");
//         System.out.println("modified text: " + myString);
//     }

//     public static void addText(String result, String newText) {
//         result = result + newText;
//     }
// }