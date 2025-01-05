import java.util.Scanner;
public class Main {
    public static void main(String ... ADA) {
        Scanner sc = new Scanner(System.in);

        // Solicitar que o usuário digite uma senha.
        System.out.println("Digite uma senha com 4 numeros positivos: ");
        String senha = sc.nextLine();

        // Garantir que a senha atende os requisitos.
        while (senha.length() < 4) {
            System.out.println("Senha inválida. Digite novamente com exatamente 4 digitos positivos:");
            senha = sc.nextLine();
        }


        // Capturar o tempo inicial. Só aceita tipo long na variável
        long contadorTempoInicial = System.currentTimeMillis();


        //Variáveis para o processo da Força Bruta
        int tentativas = 0; // conta o número de tentativas feitas
        String senhaEncontrada = " "; // Inicio com vazio, só depois guarda a senha quando esta for encontrada


        // Criar um LOOP para testar as combinações 0000 a 9999
        // Use a estrutura de repeticao FOR,  é menor e mais organizado.
        for (int i = 0; i <= 9999; i++) {
            tentativas++; //conta mais uma tentativa


            String tentativaAtual = String.format("%04d", i); // formata a impressao da variavel para 4 digitos da contagem
// teste da impressao           System.out.println(tentativaAtual);



            if (tentativaAtual.equals(senha)) { //compara a senha digitada com a repeticao do for
                senhaEncontrada = tentativaAtual; // senha encontrada recebe o valor da variavel tentativaAtual incrementada no for
                break; // parada quando as senhas são iguais
            }
        }
long contadorTempoFim = System.currentTimeMillis(); // Marca o tempo final do processo Forca Bruta
long duracao = (contadorTempoFim - contadorTempoInicial); // Conta do tempo gasto no processo

        System.out.println("Senha encontrada é: " + senhaEncontrada); // Exibe a senha encontrada
        System.out.printf("O tempo gasto foi de: " + duracao + " segundos\n", duracao / 1000); // Exibe o tempo
        sc.close(); // Fecha o scanner

    }
}

