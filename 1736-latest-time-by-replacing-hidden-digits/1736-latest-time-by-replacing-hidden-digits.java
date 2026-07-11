class Solution {
    public String maximumTime(String time) {
        StringBuilder result = new StringBuilder();

        // First digit
        if (time.charAt(0) == '?') {
            if (time.charAt(1) >= '4' && time.charAt(1) <= '9') {
                result.append('1');
            } else {
                result.append('2');
            }
        } else {
            result.append(time.charAt(0));
        }

        // Second digit
        if (time.charAt(1) == '?') {
            if (result.charAt(0) == '2') {
                result.append('3');
            } else {
                result.append('9');
            }
        } else {
            result.append(time.charAt(1));
        }

        result.append(':');

        // Third digit
        if (time.charAt(3) == '?') {
            result.append('5');
        } else {
            result.append(time.charAt(3));
        }

        // Fourth digit
        if (time.charAt(4) == '?') {
            result.append('9');
        } else {
            result.append(time.charAt(4));
        }

        return result.toString();
    }
}