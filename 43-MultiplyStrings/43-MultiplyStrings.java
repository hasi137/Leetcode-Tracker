// Last updated: 11/07/2026, 12:40:19
class Solution {
    public String multiply(String num1, String num2) {

        if (num1.equals("0") || num2.equals("0"))
            return "0";

        int[] ans = new int[num1.length() + num2.length()];

        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {

                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');

                int sum = mul + ans[i + j + 1];

                ans[i + j + 1] = sum % 10;
                ans[i + j] += sum / 10;
            }
        }

        StringBuilder res = new StringBuilder();

        for (int num : ans) {
            if (!(res.length() == 0 && num == 0))
                res.append(num);
        }

        return res.toString();
    }
}