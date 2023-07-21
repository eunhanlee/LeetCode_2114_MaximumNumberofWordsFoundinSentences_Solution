# LeetCode 2114. Maximum Number of Words Found in Sentences Java Problem Solving

category: Algorithm Solving

Hashnode Link: https://eunhanlee.hashnode.dev/leetcode-2114-maximum-number-of-words-found-in-sentences-java-problem-solving

Blogger link: https://eunhanspace.blogspot.com/2023/07/leetcode-2114-maximum-number-of-words.html

## Problem

[Maximum Number of Words Found in Sentences - LeetCode](https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/description/)

### Solution Approach

- This problem is about counting the number of words in a sentence and finding the maximum count among all sentences.
- You should be familiar with loops, counting words, and finding the maximum value to solve this problem.
- Algorithm:
    - Use a loop to iterate through each sentence.
    - Calculate the number of words in each sentence.
    - Compare the word counts to find the maximum value.
- There are several ways to achieve this, such as different types of loops (for loop, while loop, advanced for loop), word counting methods (using `split` to split the sentence and count the words, or using character arrays to find the number of spaces and adding 1), and finding the maximum value (using `if` statements for comparison, using the ternary operator `?` for comparison, or using `Math.max`).
- The provided code uses an advanced for loop, `split` method to count words, and `Math.max` for comparison to solve the problem.

## Github Link

[https://github.com/eunhanlee/LeetCode_2114_MaximumNumberofWordsFoundinSentences_Solution](https://github.com/eunhanlee/LeetCode_2114_MaximumNumberofWordsFoundinSentences_Solution)

## Time Complexity: O(nm), Space Complexity: O(1)

```java
public class Solution {
    /**
     * Finds the maximum number of words in the given array of sentences.
     *
     * @param sentences An array of strings representing sentences.
     * @return The maximum number of words found in any sentence.
     */
    public int mostWordsFound(String[] sentences) {
        int max = 0;

        for (String sentence : sentences) {
            max = Math.max(max, sentence.split(" ").length);
        }

        return max;
    }
}
```
