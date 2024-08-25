import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int solution(int k, int[] tangerine) {
		// k=귤의개수
		// tangerine=귤크기배열
		int answer = 0;

		Map<Integer, Integer> map = new HashMap<>();

		// 귤 크기 별
		for (int i : tangerine) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		// 굴의 크기 array
		List<Integer> keyList = new ArrayList<>(map.keySet());
		// sort 내림차순
		keyList.sort(((o1, o2) -> map.get(o2) - map.get(o1)));

		// k의 개수 만큼 상자에 담기(최소값 추출)
		for (Integer i : keyList) {
			if (k <= 0) {
				break;
			}

			answer++;
			k -= map.get(i);
		}

		return answer;
    }
}