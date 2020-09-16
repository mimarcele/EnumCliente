package Cliente;

public class Cliente {
    private String nome;
    private TipoCliente tipo;

    public Cliente(String nome, TipoCliente tipo){
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public String toString(){
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo=" + tipo +
                '}';
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setTipo(TipoCliente tipo){
        this.tipo = tipo;
    }

    public TipoCliente getTipo(){
        return this.tipo;
    }
}
