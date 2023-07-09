import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.Solution;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testSolution() {
        Solution solution = new Solution();

        // Test Case 1
        String[] sentences1 = {"I love coding"};
        int expected1 = 3;
        int actual1 = solution.mostWordsFound(sentences1);
        assertEquals(expected1, actual1);

        // Test Case 2
        String[] sentences2 = {"This is a test sentence"};
        int expected2 = 5;
        int actual2 = solution.mostWordsFound(sentences2);
        assertEquals(expected2, actual2);

        // Test Case 3
        String[] sentences3 = {"Hello", "world"};
        int expected3 = 1;
        int actual3 = solution.mostWordsFound(sentences3);
        assertEquals(expected3, actual3);

        // Test Case 4
        String[] sentences4 = {};
        int expected4 = 0;
        int actual4 = solution.mostWordsFound(sentences4);
        assertEquals(expected4, actual4);

        // Test Case 5
        String[] sentences5 = {"One", "two", "three", "four", "five"};
        int expected5 = 1;
        int actual5 = solution.mostWordsFound(sentences5);
        assertEquals(expected5, actual5);

        // Test Case 6
        String[] sentences6 = {"The quick brown fox"};
        int expected6 = 4;
        int actual6 = solution.mostWordsFound(sentences6);
        assertEquals(expected6, actual6);

        // Test Case 7
        String[] sentences7 = {"A sentence with multiple words"};
        int expected7 = 5;
        int actual7 = solution.mostWordsFound(sentences7);
        assertEquals(expected7, actual7);

        // Test Case 8
        String[] sentences8 = {"Testing", "multiple", "sentences", "with", "different", "lengths"};
        int expected8 = 1;
        int actual8 = solution.mostWordsFound(sentences8);
        assertEquals(expected8, actual8);

        // Test Case 9
        String[] sentences9 = {"Java programming", "is", "fun"};
        int expected9 = 2;
        int actual9 = solution.mostWordsFound(sentences9);
        assertEquals(expected9, actual9);

        // Test Case 10
        String[] sentences10 = {"A", "B", "C", "D", "E"};
        int expected10 = 1;
        int actual10 = solution.mostWordsFound(sentences10);
        assertEquals(expected10, actual10);

        System.out.println("All test cases passed.");
    }
}
