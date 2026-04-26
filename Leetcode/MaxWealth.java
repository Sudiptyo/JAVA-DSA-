// 1672. Richest Customer Wealth

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = { { 5, 6, 7 }, { 8, 9, 1 } };
        int maxWealth = 0;
        for (int[] customer : accounts) {
            int sum = 0;
            for (int j = 0; j < customer.length; j++) {
                sum += customer[j];
            }
            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }
        return maxWealth;
    }
}
