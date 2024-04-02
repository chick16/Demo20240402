package service.impl;


import service.ConsecutiveCharRemoverService;

public class ConsecutiveCharRemoverServiceImpl implements ConsecutiveCharRemoverService {

    @Override
    public String replaceConsecutiveChars(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuffer result = new StringBuffer();
        char prevChar = input.charAt(0);
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == prevChar) {
                count++;
            } else {
                if (count >= 3) {
                    if ((char) (prevChar - 1) == 96) {
                        result.setLength(0);
                    } else {
                        result.append((char) (prevChar - 1));
                    }
                } else {
                    for (int j = 0; j < count; j++) {
                        result.append(prevChar);
                    }
                }
                prevChar = input.charAt(i);
                count = 1;
            }
        }

        // Handle the last characters
        if (count >= 3) {
            result.append((char) (prevChar - 1));
        } else {
            for (int j = 0; j < count; j++) {
                result.append(prevChar);
            }
        }

        return result.toString();
    }
}
