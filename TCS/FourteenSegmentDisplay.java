import java.util.*;

public class FourteenSegmentDisplay {
    private static final Map<String, Character> alphabetMap = new HashMap<>();

    static {
        // Populate the 9x5 grid mappings to their corresponding characters.
        alphabetMap.put("1111100100001000100011111", 'A');
        alphabetMap.put("0111100100101111001001111", 'B');
        alphabetMap.put("1111100000100001000011111", 'C');
        alphabetMap.put("0111100100101000100101111", 'D');
        alphabetMap.put("1111100000111110000011111", 'E');
        alphabetMap.put("1111100000111110000010000", 'F');
        alphabetMap.put("1111100000100001010111111", 'G');
        alphabetMap.put("1000110001111111000110001", 'H');
        alphabetMap.put("1111100100001000010011111", 'I');
        alphabetMap.put("0011100000100001000011111", 'J');
        alphabetMap.put("1000110010111001100110001", 'K');
        alphabetMap.put("1000100001000010000111111", 'L');
        alphabetMap.put("1000111010101011000110001", 'M');
        alphabetMap.put("1000111001101011001110001", 'N');
        alphabetMap.put("1111100100101000100011111", 'O');
        alphabetMap.put("1111100100101111000010000", 'P');
        alphabetMap.put("1111100100101000110111111", 'Q');
        alphabetMap.put("1111100100101111000110001", 'R');
        alphabetMap.put("1111100000111110000011111", 'S');
        alphabetMap.put("1111100100001000010000100", 'T');
        alphabetMap.put("1000110001100011000111111", 'U');
        alphabetMap.put("1000110001100010111000100", 'V');
        alphabetMap.put("1000110001111111100010001", 'W');
        alphabetMap.put("1000110001101000100010001", 'X');
        alphabetMap.put("1000110001101000010000100", 'Y');
        alphabetMap.put("1111100001100010000111111", 'Z');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] grid = new String[9];
        for (int i = 0; i < 9; i++) {
            grid[i] = sc.nextLine();
        }
        sc.close();

        int cols = grid[0].length();
        StringBuilder result = new StringBuilder();
        int currentCol = 0;

        while (currentCol < cols) {
            // Find the start of the next letter
            while (currentCol < cols && grid[0].charAt(currentCol) == '0') {
                currentCol++;
            }
            if (currentCol >= cols) break;

            // Extract the 9x5 grid for the current letter
            StringBuilder letter = new StringBuilder();
            for (int i = 0; i < 9; i++) {
                letter.append(grid[i].substring(currentCol, Math.min(currentCol + 5, cols)));
            }

            // Map the letter to its corresponding alphabet
            if (alphabetMap.containsKey(letter.toString())) {
                result.append(alphabetMap.get(letter.toString()));
            } else {
                result.append('?'); // Placeholder for unknown mappings
            }

            // Move to the next letter (past the 9x5 grid + padding)
            currentCol += 5;
        }

        System.out.println(result.toString());
    }
}
