public class RouteCipher {
    public static void main(String[] args) {
        String phrase = "нельзя недооценивать противника";
        String key = "пароль";
        char[] phraseArray = phrase.replace(" ", "").toCharArray();
        char[] keyArray = key.toCharArray();
        int m = phraseArray.length;
        int n = keyArray.length;
        int l = m % n;

        if (l < n) {
            for (int i = 0; i < n - l; i++) {
                phrase += 'a';
            }
        }

        int blockSize = m / n;
        char[][] blocks = new char[blockSize][n];

        int index = 0;
        for (int i = 0; i < blockSize; i++) {
            for (int j = 0; j < n; j++) {
                blocks[i][j] = phraseArray[index++];
            }
        }

        int[] alphabet = new int[n];
        for (int j = 0; j < n; j++) {
            alphabet[j] = keyArray[j];
        }

        int[] newAlphabet = new int[n];
        for (int i = 0; i < n; i++) {
            newAlphabet[i] = i;
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (alphabet[j] > alphabet[j + 1]) {
                    // Перестановка букв в алфавите
                    int temp = alphabet[j];
                    alphabet[j] = alphabet[j + 1];
                    alphabet[j + 1] = temp;

                    // Перестановка индексов в новом алфавите
                    temp = newAlphabet[j];
                    newAlphabet[j] = newAlphabet[j + 1];
                    newAlphabet[j + 1] = temp;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (int g = 0; g < n; g++) {
            for (int h = 0; h < blockSize; h++) {
                result.append(blocks[h][newAlphabet[g]]);
            }
        }
        System.out.println(phrase);
        System.out.println(key);
        System.out.println(result.toString());
    }
}