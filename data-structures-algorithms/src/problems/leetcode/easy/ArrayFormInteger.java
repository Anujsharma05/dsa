package problems.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class ArrayFormInteger {
    public static void main(String[] args) {
        int[] num = {7};
        int k = 993;

        List<Integer> output = addToArrayForm(num, k);
        for (Integer i : output) {
            System.out.print(i + " ");
        }
    }

    public static List<Integer> addToArrayForms(int[] num, int k) {

        List<Integer> list = new ArrayList<>();

        for (int i : num) {
            list.add(i);
        }

        int index = num.length - 1;
        int carry = 0;
        int digit = 0;
        while (k != 0 || index >= 0) {
            if (k != 0) {
                digit = k % 10;
                k = k / 10;
            } else {
                digit = 0;
            }
            int currentDigit = 0;
            if(index >= 0) {
                currentDigit = list.get(index);
            }
            int updatedDigit = currentDigit + carry + digit;

            if (index >= 0) {
                list.set(index, updatedDigit % 10);
            } else {
                list.add(0, updatedDigit % 10);
            }
            carry = updatedDigit / 10;
            index--;

        }
        if (carry != 0) {
            list.add(0, carry);
        }
        return list;
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> list = new ArrayList<>();

        int index = num.length-1;
        int carry = 0;
        while(k>0 || index >=0) {

            int numDigit = 0;

            if(index >= 0) {
                numDigit = num[index];
                index--;
            }
            int kDigit = 0;
           if(k != 0) {
               kDigit = k%10;
           }
            int finalDigit = carry + numDigit + kDigit;
           list.add(0, finalDigit%10);
            carry = finalDigit/10;
            k = k/10;
        }

        if(carry == 1) {
            list.add(0, 1);
        }

        return list;
    }
}
