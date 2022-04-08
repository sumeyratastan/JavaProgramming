package day19_LoopsPractices;

public class Test {
    public static void main(String[] args) {
        String entry = "dflsslnnnnnncee";

        String result = "";

        for (int j = 0; j < entry.length(); j++) {
            char ch1 = entry.charAt(j);
            int count = 0;
            for (int i = 0; i < entry.length(); i++) {
                char ch2 = entry.charAt(i);
                if (ch1 == ch2) {
                    count++;
                }
            }
            if (!result.contains("" + ch1 + count))
                result += "" + ch1 + count;
        }
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == '2') {
                System.out.print(result.charAt(i-1));
            }
        }

    }
}
