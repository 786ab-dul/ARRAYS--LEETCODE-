class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) { //if the last digit of array is less than 9 then increment with the number with 1
                digits[i]++;
                return digits;
            }
            digits[i] = 0; //else if the last number is 9 then change it to 0
        }
        //if arr has a only singledigit then,
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;

        return newNumber;
    }
}