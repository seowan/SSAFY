package answer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 첫번 째 row 는 무조건 'W', 마지막 row 는 무조건 'R'
// 첫번 째와 마지막 row 를 제외한 row (N-2) 개의 조합을 기준으로 고쳐야 할 칸의 최소값을 계산한다.
public class swea_4613_러시아국기같은깃발 {

static int T, N, M;
static char[][] map;
static char[] rowArray;
static int preCnt;
static int min;
static int cnt;

public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    T = Integer.parseInt(br.readLine());
    
    for (int tc = 1; tc <= T; tc++) {
        String[] str = br.readLine().split(" ");
        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);
        map = new char[N][M];
        rowArray = new char[N-2];
        
        preCnt = 0;
        min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            map[i] = br.readLine().toCharArray();
        }
        
        for (int i = 0; i < M; i++) {
            if ( map[0][i] != 'W') preCnt++;
            if ( map[N-1][i] != 'R') preCnt++;
        }
        
        // 단순 색 조합
//            comb(0, 'W');
//            comb(0, 'B');

            // 가지치기 색 조합
            // Blue, Red 숫자를 전달 
            comb(0, 0, 0);
            System.out.println("#" + tc + " " + (preCnt + min));
        }
        br.close();
    }

// 가지치기 하지 않고, 전체 색상을 조합하는 경우
// 많이 수행하게 되고, 색상 순서 체크하는 부분이 복잡
static void comb(int depth, char color) {
    // complete code
    if (depth == N - 2) {
        // row 별 색상 순서 체크
    }
    
    rowArray[depth] = color;
    
    comb(depth + 1, 'W');
    comb(depth + 1, 'B');
    comb(depth + 1, 'R');
}


static void comb(int depth, int blue, int red) {
    // complete code
    if (depth == N - 2) {
        if (blue == 0)    return;
        cnt = 0;
        
        // 확정된 rowArray 기준으로
        // map 의 각 row 별로 rowArray 의 색과 일치하지 않는 경우를 계산
        // 첫줄 제외하고 비교 ==> map[i+1][j] == rowArray[i]
        // rowArray 의 길이 + 2 = map row 길이
        for (int i = 0; i < rowArray.length; i++) {
            for (int j = 0; j < M; j++) {
                if (!(map[i+1][j] == rowArray[i])) cnt++;
            }
        }
        
        min = Math.min(min, cnt);
        return;
    }
    
    // 아직 blue 가 아니면 white 를 가 본다. 
    if (blue == 0 && red == 0) {
        rowArray[depth] = 'W';
        comb(depth + 1, blue, red);
    }

    if (red == 0) {
        rowArray[depth] = 'B';
        comb(depth + 1, blue + 1, red);
    }

    rowArray[depth] = 'R';
    comb(depth + 1, blue, red + 1);
}
}