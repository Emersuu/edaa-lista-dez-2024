import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Queue<Cliente> fila = new LinkedList<>();
        Funcionario[] funcionarios = new Funcionario[3]; 

        for (int i = 0; i < funcionarios.length; i++) {
            funcionarios[i] = new Funcionario(i + 1);
        }

        Random random = new Random();
        int numeroClientes = 10; 


        System.out.println("Clientes entrando na fila de espera:");
        for (int i = 0; i < numeroClientes; i++) {
            Cliente cliente = new Cliente(i + 1);
            fila.add(cliente);
            System.out.println("Cliente " + cliente.getId() + " entrou na fila de espera.");
        }

        System.out.println("\nInício do atendimento:");
        while (!fila.isEmpty()) {
            Cliente cliente = fila.poll(); 


            Funcionario funcionario = funcionarios[random.nextInt(funcionarios.length)];


            int tempoEspera = random.nextInt(5) + 1; 
            for (int i = 0; i < tempoEspera; i++) {
                cliente.incrementarTempoEspera();
            }


            funcionario.atenderCliente(cliente);
        }
    }
}