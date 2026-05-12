import java.util.*;

class Solution {
    // 이동할 네 가지 방향 (하, 상, 우, 좌)
    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, 1, -1};

    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        // BFS를 위한 큐 생성 (x좌표, y좌표, 현재까지의 거리)
        Queue<int[]> queue = new LinkedList<>();
        
        // 시작 위치 (0, 0)에서 거리 1로 시작
        queue.add(new int[]{0, 0, 1});
        maps[0][0] = 0; // 시작 지점 방문 처리 (벽으로 만듦)

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int distance = current[2];

            // 상대 팀 진영(우측 하단)에 도착했을 경우 거리 반환
            if (x == n - 1 && y == m - 1) {
                return distance;
            }

            // 4방향 탐색
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 맵 범위 내에 있고, 갈 수 있는 길(1)인 경우
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && maps[nx][ny] == 1) {
                    maps[nx][ny] = 0; // 방문 처리
                    queue.add(new int[]{nx, ny, distance + 1});
                }
            }
        }

        // 모든 탐색이 끝났는데도 도달하지 못한 경우
        return -1;
    }
}