public class VigenereCipher {
    public static void main(String[] args) {
        String phrase = "криптография серьезная наука";
        System.out.println(phrase);
        String key = "математика";
        System.out.println(key);
        phrase = phrase.replaceAll(" ", "");
        char[] phraseArray = phrase.toCharArray();
        char[] keyArray = key.toCharArray();

        char[] alphabet = new char[32];
        for (int i = 0; i < 32; i++) {
            alphabet[i] = (char) (1072 + i);
        }

        char[][] table = new char[32][32];
        for (int i = 0; i < 32; i++) {
            for (int j = 0; j < 32; j++) {
                table[i][j] = alphabet[(j + i) % 32];
            }
        }

        int k = phraseArray.length / keyArray.length;
        StringBuilder keyList = new StringBuilder();
        for (int j = 0; j < k; j++) {
            keyList.append(key);
        }
        String partKey = key.substring(0, phraseArray.length % keyArray.length);
        keyList.append(partKey);

        char[] keyListArray = keyList.toString().toCharArray();
        char[] cipher = new char[phraseArray.length];

        for (int g = 0; g < phraseArray.length; g++) {
            int rowIndex = new String(alphabet).indexOf(phraseArray[g]);
            int colIndex = new String(alphabet).indexOf(keyListArray[g]);
            cipher[g] = table[rowIndex][colIndex];
        }

        System.out.println(new String(cipher));
    }
}

