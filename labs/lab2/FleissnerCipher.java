public class FleissnerCipher {
    public static void main(String[] args) {
        String phrase = "договор подписали";
        System.out.println(phrase);
        String key = "шифр";
        System.out.println(key);

        String encryptedText = encryptFleissner(phrase, key);
        System.out.println("Зашифрованный текст: " + encryptedText);
    }

    public static String encryptFleissner(String phrase, String key) {
        int keyLength = key.length();
        int phraseLength = phrase.length();
        char[] encryptedText = new char[phraseLength];

        for (int i = 0; i < phraseLength; i++) {
            int keyIndex = i % keyLength;
            char keyChar = key.charAt(keyIndex);
            int shift = keyChar % 32; // Диапазон символов кириллицы

            char encryptedChar = (char) (phrase.charAt(i) + shift);
            if (encryptedChar > 'я') {
                encryptedChar = (char) (encryptedChar - 32); // Обертывание по алфавиту
            }
            encryptedText[i] = encryptedChar;
        }

        return new String(encryptedText);
    }
}