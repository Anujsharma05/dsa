package arrays;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/defuse-the-bomb/description/
 */
public class DefuseTheBomb {

  public static void main(String[] args) {

    int[] code = {2,4,9,3};
    int k = -2;

    int[] result = decrypt(code, k);

    System.out.println(Arrays.toString(result));
  }

  static int[] decrypt(int[] code, int k) {

    int[] result = new int[code.length];

    if (k == 0) {
      return result;
    }

    if (k > 0) {
      forwardSum(code, k, result);
    } else {
      backwardSum(code, k, result);
    }

    return result;
  }

  static void forwardSum(int[] code, int k, int[] result) {

    int sum = 0;
    for(int i=1; i<=k; i++) {
      sum+=code[i];
    }
    result[0] = sum;

    int len = code.length;

    for(int i=1; i<code.length; i++) {
      sum = sum + code[(i+k)%len] - code[i];
      result[i] = sum;
    }
  }

  static void backwardSum(int[] code, int k, int[] result) {

    int len = code.length;
    int sum = 0;
    for(int i=len-2; i>=len+k-1; i--) {
      sum+=code[i];
    }
    result[len-1] = sum;

    for(int i=len-2; i>=0; i--) {
      int idx = i+k;
      idx = idx >=0 ? idx : idx + len;
      sum = sum + code[idx] - code[i];
      result[i] = sum;
    }
  }

  /**
   * Brute force
   */
  public static int[] decryptBruteForce(int[] code, int k) {

    int[] result = new int[code.length];

    if (k == 0) {
      return result;
    }

    if (k > 0) {
      forwardSumBF(code, k, result);
    } else {
      backwardSumBF(code, k, result);
    }

    return result;
  }

  static void forwardSumBF(int[] code, int k, int[] result) {

    int len = code.length;

    for(int i=0; i<len; i++) {
      int sum = 0;
      int idx = i+1;
      for(int j=0; j<k; j++) {
        idx = idx%len;
        sum += code[idx];
        idx++;
      }
      result[i] = sum;
    }
  }

  static void backwardSumBF(int[] code, int k, int[] result) {

    int len = code.length;

    for(int i=0; i<len; i++) {
      int idx = i-1;
      int sum = 0;
      for(int j=0; j<Math.abs(k); j++) {
        if(idx < 0) {
          idx = len-1;
        }
        sum = sum + code[idx];
        idx--;
      }
      result[i] = sum;
    }
  }
}
