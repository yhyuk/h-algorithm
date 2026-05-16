class Solution {
    public int solution(int[] numbers, int target) {
        int answer = dfs(numbers, target, 0, 0);
        return answer;
    }

    private int dfs(int[] numbers, int target, int index, int currentSum) {
        // 모든 숫자를 다 사용했을 때
        if (index == numbers.length) {
            // 현재까지의 합이 타겟 넘버와 같으면 1을 반환 (하나의 방법 찾음)
            if (currentSum == target) {
                return 1;
            } else {
                // 다르면 0을 반환
                return 0;
            }
        }

        // 현재 숫자를 더하는 경우와 빼는 경우를 탐색
        int ways = 0;
        // 현재 숫자를 더하고 다음 숫자로 넘어감
        ways += dfs(numbers, target, index + 1, currentSum + numbers[index]);
        // 현재 숫자를 빼고 다음 숫자로 넘어감
        ways += dfs(numbers, target, index + 1, currentSum - numbers[index]);

        return ways;
    }
}