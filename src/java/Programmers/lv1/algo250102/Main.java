package java.Programmers.lv1.algo250102;

public class Main {


    // Helper method: Convert "mm:ss" to total seconds
    private static int toSeconds(String time) {
        String[] parts = time.split(":");
        int minutes = Integer.parseInt(parts[0]);
        int seconds = Integer.parseInt(parts[1]);
        return minutes * 60 + seconds;
    }

    // Helper method: Convert total seconds to "mm:ss"
    private static String toTimeString(int seconds) {
        int minutes = seconds / 60;
        seconds = seconds % 60;
        return String.format("%02d:%02d", minutes, seconds);
    }

    public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        // Convert inputs to seconds
        int videoLength = toSeconds(video_len);
        int currentPosition = toSeconds(pos);
        int openingStart = toSeconds(op_start);
        int openingEnd = toSeconds(op_end);

        // Process commands
        for (String command : commands) {
            if (command.equals("prev")) {
                currentPosition = Math.max(0, currentPosition - 10);
            } else if (command.equals("next")) {
                currentPosition = Math.min(videoLength, currentPosition + 10);
            }

            // Skip opening if in the opening section
            if (currentPosition >= openingStart && currentPosition <= openingEnd) {
                currentPosition = openingEnd;
            }
        }

        // Return the final position as "mm:ss"
        return toTimeString(currentPosition);
    }

    public static void main(String[] args) {
        // Example Usage
        System.out.println(solution("34:33", "13:00", "00:55", "02:55", new String[]{"next", "prev"})); // "13:00"
        System.out.println(solution("10:55", "00:05", "00:15", "06:55", new String[]{"prev", "next", "next"})); // "06:55"
        System.out.println(solution("07:22", "04:05", "00:15", "04:07", new String[]{"next"})); // "04:17"
    }
}
