
public class GammaEncryption {
    public static void main(String[] args) {
        String word = "приказ";
        String gamma = "гамма";
        word = word.replace(" ", "");

        char[] wordChars = word.toCharArray();
        char[] gammaChars = gamma.toCharArray();

        char[] alphabet = new char[32];
        for (char c = 'а'; c <= 'я'; c++) {
            alphabet[c - 'а'] = c;
        }

        char[] gammaNew = new char[wordChars.length];
        for (int i = 0; i < wordChars.length; i++) {
            gammaNew[i] = gammaChars[i % gammaChars.length];
        }

        char[] cipher = new char[wordChars.length];
        for (int i = 0; i < wordChars.length; i++) {
            int numberWord = findCharIndex(alphabet, wordChars[i]) + 1;
            int numberGammaNew = findCharIndex(alphabet, gammaNew[i]) + 1;
            int k = (numberWord + numberGammaNew) % 32;
            cipher[i] = alphabet[k - 1];
        }

        String cipherText = new String(cipher);
        System.out.println(cipherText);
    }

    public static int findCharIndex(char[] arr, char c) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c) {
                return i;
            }
        }
        return -1;
    }
}