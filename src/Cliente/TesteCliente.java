package Cliente;

public class TesteCliente {
    public static void main(String[] args) {
        Cliente c = new Cliente("Juliana", TipoCliente.PESSOA_FISICA);

        Cliente c2 = new Cliente("Vinícius", TipoCliente.PESSOA_JURIDICA);

        System.out.println(c);
        System.out.println(c2);
    }
}
