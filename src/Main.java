//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String original = "Apenas um texto aleatório";
        String invertida = reverseString(original);
        System.out.println("Texto original: " + original);
        System.out.println("Texto invertido: " + invertida);
    }

    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();


        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {

            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start++;
            end--;
        }
        return new String(charArray);


    }
}