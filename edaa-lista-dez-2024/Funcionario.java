public class Funcionario {
    private int id;

    public Funcionario(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void atenderCliente(Cliente cliente) {
        System.out.println("Atendendo o cliente: " + cliente.getId() + " ...");
        System.out.println("Cliente " + cliente.getId() + " atendido pelo funcionario " + id + " com tempo de espera de  " + cliente.getTempoEspera() + " minutos.\n");
    }
}