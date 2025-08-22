import java.util.Arrays;

public class BuscaBinaria {
    public static int buscar(int[]array, int valorProcurado){
       //A busca binária exige que o array esteja ordenado
       //se o array não estiver esta linha ordena para continuar o funcionamento

       Arrays.sort(array);
       System.out.println("Array ordenado " + Arrays.toString(array));
       int inicio = 0;
       int fim = array.length - 1;

       //O loop ira continuar enquanto o ponto de inicio for menor ou igual ao ponto de fim

       while (inicio <= fim){
        int meio = inicio + (fim - inicio) / 2; //calculando o indice do meio
        //compara o valor do meio com o valor procurado
        if(array [meio] == valorProcurado){
            System.out.println("Busca binária. Valor " + valorProcurado +" Encontardo no indice " + meio);
            return meio; // Encontrado
        }
        //Se o valor procurado for menor que o do meio. ajusta o fim para a metade esquerda.
        if (array[meio] > valorProcurado) {
            fim = meio - 1;
        }else {
            //Se o valor procurado for maior, ajusta o inicio para a metade direita
            inicio = meio + 1;

        }
    }
        //Se o loop terminar, o valor não foi encontrado
        System.out.println("Busca binária valor: " + valorProcurado + " Não foi encontrado ");
        return -1;
    }

    public static void main(String[]args){
        int[] idclientes = {124,943,321,521,462,667,245};
        int idprocurado = 321;
        int idInexistente = 534;

        buscar(idclientes, idprocurado);
        buscar(idclientes, idprocurado);
    }
}
