package com.aibek;

class Tictactoe {
    private int N=10;
    private int K=5;
    char[][] A = new char[N][N];

    Tictactoe(String[] inputArray){
        int o = 0, x = 0;
        for(int i = 0; i < N; i++) {
            A[i] = inputArray[i].toCharArray();
            for(int j = 0; j < N; j++)
                if (A[i][j] == 'O') o++; else
                if (A[i][j] == 'X') x++;
        }
        if (x != o) throw new java.lang.RuntimeException("Input must contain equal number of Xs and Os!");
    }

    private boolean isValid(int i, int j) {
        return j >= 0 && j < 10 && i >= 0 && i < 10 && A[i][j] == 'X';
    }

    private boolean getSides(int i, int j, int x, int y) {
        int a = 1;
        int b = 1;
        boolean stateA;
        boolean stateB;
        do {
            stateA = isValid(i + x * a, j + y * a);
            stateB = isValid(i - x * b, j - y * b);
            if (stateA) a++;
            if (stateB) b++;
        } while ((stateA || stateB) && a+b-1 < K);

        return (a + b - 1) >= K;
    }

    private boolean isWinState(int i, int j) {
        return getSides(i, j, 1, 0) |
                getSides(i, j, 0, 1) |
                getSides(i, j, 1, 1) |
                getSides(i, j, 1, -1);
    }

    String getAnswer() {
        for(int i = 0; i < N; i++)
            for(int j = 0; j < N; j++)
                if (A[i][j] == '.')
                    if (isWinState(i, j)) {
                        return "YES";
                    }
        return "NO";
    }
}