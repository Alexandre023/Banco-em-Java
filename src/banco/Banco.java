package banco;

class Banco {
    private String nome;
    private int codBanco;
    private Funcionario funcionario;
    private Cliente Cliente;
    
    public void Funcionario(){
        System.out.println("Funcionario: "+funcionario.getNome());
        System.out.println("Codigo: "+funcionario.getCodFuncionario());
        System.out.println("Idade: "+funcionario.getIdade());
        System.out.println("Cpf: "+funcionario.getCpf());
        System.out.println("Setor: "+funcionario.getSetor());
    }
    
    public void Cliente(){
        System.out.println("Cliente: "+Cliente.getNome());
        System.out.println("Codigo: "+Cliente.getCodCliente());
        System.out.println("Idade: "+Cliente.getIdade());
        System.out.println("Cpf: "+Cliente.getCpf());
        System.out.println("Credito: "+Cliente.getCredito());
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodBanco() {
        return codBanco;
    }

    public void setCodBanco(int codBanco) {
        this.codBanco = codBanco;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

}
