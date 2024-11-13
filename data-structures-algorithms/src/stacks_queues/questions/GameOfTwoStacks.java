package stacks_queues.questions;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * https://www.hackerrank.com/challenges/game-of-two-stacks/
 */
class Result {

  public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
    return rec(maxSum, a, b, 0, 0) - 1;
  }

  public static int rec(int maxSum, List<Integer> a, List<Integer> b, int count, int runningSum) {

    if(runningSum > maxSum) {
      return count;
    }

    int aCount = 0;
    int bCount = 0;

    /**
     * Creating copies so that original is not modified
     */

    if(!a.isEmpty()) {
      ArrayList<Integer> aCopy = new ArrayList<>(a);
      aCount = rec(maxSum, aCopy, b, count+1, runningSum + aCopy.removeFirst());
    }
    if(!b.isEmpty()) {
      ArrayList<Integer> bCopy = new ArrayList<>(b);
      bCount = rec(maxSum, a, bCopy, count+1, runningSum + bCopy.removeFirst());
    }

    return Math.max(aCount, bCount);
  }

}

public class GameOfTwoStacks {

  public static void main(String[] args) throws IOException {

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//    BufferedWriter bufferedWriter = new BufferedWriter(
//        new FileWriter(System.getenv("OUTPUT_PATH")));

    int g = Integer.parseInt(bufferedReader.readLine().trim());

    IntStream.range(0, g).forEach(gItr -> {
      try {
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        int maxSum = Integer.parseInt(firstMultipleInput[2]);

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.twoStacks(maxSum, a, b);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
        System.err.println(result);
      } catch (IOException ex) {
        throw new RuntimeException(ex);
      }
    });

    bufferedReader.close();
//    bufferedWriter.close();
  }
}

