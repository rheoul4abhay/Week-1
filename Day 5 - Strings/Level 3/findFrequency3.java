import java.util.Scanner;

class findFrequency3{

    static String[] findCharacterFrequency(String text) {
        char[] chars = text.toCharArray();
        int length = chars.length;
        String[] result = new String[length];
        boolean[] visited = new boolean[length];

        for (int i = 0; i < length; i++) {
            if (visited[i] || chars[i] == '0') {
                continue;
            }
            int frequency = 1;

            for (int j = i + 1; j < length; j++) {
                if (chars[i] == chars[j]) {
                    visited[j] = true;
                    frequency++;
                }
            }

            result[i] = chars[i] + ": " + frequency;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String[] frequencyResult = findCharacterFrequency(text);
        System.out.println("Character Frequency:");
        for (String entry : frequencyResult) {
            if (entry != null) {
                System.out.println(entry);
            }
        }
    }
}
