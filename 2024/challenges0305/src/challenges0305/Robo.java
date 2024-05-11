package challenges0305;

public class Robo {
    private int posicaoX;
    private int posicaoY;
    private int passos;

    // Construtor
    public Robo(int x, int y) {
        this.posicaoX = x;
        this.posicaoY = y;
        this.passos = 0;
    }

    // Método para encontrar a saída do labirinto
    public int encontrarSaida(int[][] labirinto) {
        return dfs(labirinto, posicaoX, posicaoY);
    }

    // Método de busca em profundidade
    private int dfs(int[][] labirinto, int x, int y) {
        // Se a posição atual é a saída, retorna o número de passos
        if (x == labirinto.length - 1 || y == labirinto[0].length - 1 || x == 0 || y == 0) {
            return passos;
        }

        // Marca a posição atual como visitada (uma parede)
        labirinto[x][y] = 1;

        // Lista de movimentos possíveis (cima, baixo, esquerda, direita)
        int[][] movimentos = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        // Para cada movimento possível
        for (int[] movimento : movimentos) {
            int novoX = x + movimento[0];
            int novoY = y + movimento[1];

            // Se o movimento é válido (dentro dos limites e não é uma parede)
            if (novoX >= 0 && novoX < labirinto.length && novoY >= 0 && novoY < labirinto[0].length && labirinto[novoX][novoY] == 0) {
                // Atualiza a posição do robô
                posicaoX = novoX;
                posicaoY = novoY;

                // Incrementa o número de passos
                passos++;

                // Continua a busca a partir da nova posição
                int resultado = dfs(labirinto, novoX, novoY);

                // Se encontrou a saída, retorna o número de passos
                if (resultado != -1) {
                    return resultado;
                }

                // Se não encontrou a saída, desfaz o movimento (backtracking)
                posicaoX = x;
                posicaoY = y;
                labirinto[novoX][novoY] = 0;
                passos--;
            }
        }

        // Se não encontrou a saída, retorna -1
        return -1;
    }
}
