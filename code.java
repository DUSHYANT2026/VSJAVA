
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BinaryToStringConverter {

    public static void binaryToString(String s) {
        Map<String, Character> map = new HashMap<>();
        map.put("001", 'C');
        map.put("010", 'G');
        map.put("011", 'A');
        map.put("101", 'T');
        map.put("110", 'U');

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i += 3) {
            String x = s.substring(i, Math.min(i + 3, s.length()));
            if (map.containsKey(x)) {
                ans.append(map.get(x));
            }
        }

        for (int i = 0; i < 3; i += 3) {
            String x = s.substring(i, Math.min(i + 3, s.length()));
            if ("000".equals(x)) {
                for (int j = 0; j < ans.length(); j++) {
                    if (ans.charAt(j) == 'U') {
                        ans.setCharAt(j, 'T');
                    }
                }
            } else if ("111".equals(x)) {
                for (int j = 0; j < ans.length(); j++) {
                    if (ans.charAt(j) == 'T') {
                        ans.setCharAt(j, 'U');
                    }
                }
            }
        }

        System.out.println(ans.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        binaryToString(s);
    }
}
