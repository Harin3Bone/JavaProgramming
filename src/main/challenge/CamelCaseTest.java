package main.challenge;

public class CamelCaseTest {
    public void runCamelCase() {
        String data = solution("case");
        System.out.println(data);
    }

    private String solution(String input) {
        StringBuilder str = new StringBuilder();
        int lastIndex = 0;

        for (int index = 0; index < input.length(); index++) {
            if (input.charAt(index) == input.toUpperCase().charAt(index)) {
                str.append(input.substring(lastIndex, index)).append(" ");
                lastIndex = index;
            } else if (index == (input.length() - 1)) {
                str.append(input.substring(lastIndex, index + 1));
            }
        }
        return str.toString();
    }
}
