public class BuscaLinear {
    public static int buscar(int[] array, int valorProcurado) {
        // itera sobre cada elemento do array, começando no índice 0
        for (int i = 0; i < array.length; i++) {
            // compara o elemento atual com o valor que estamos procurando
            if (array[i] == valorProcurado) {
                // se encontrar o valor, retorna índice (posição) onde ele está
                System.out.println("Busca Linear: Valor " + valorProcurado + " encontrado no índice " + i);
                return i;
            }
        }
        // Se o loop terminar e o valor não for encontrado, retorna -1
        System.out.println("Busca Linear: Valor " + valorProcurado + " não encontrado.");
        return -1;
    }

    public static void main(String[] args) {
        int[] idclientes = {127, 432, 744, 422, 521, 321};
        int idprocurado = 127;
        int idinexistente = 100;

        buscar(idclientes, idprocurado);
        buscar(idclientes, idinexistente);
    }
}
