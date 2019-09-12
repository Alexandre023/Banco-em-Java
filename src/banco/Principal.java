package banco;

public class Principal {

    public static void main(String[] args) {
        Banco b = new Banco();
        Cliente c = new Cliente();
        Funcionario f = new Funcionario();
        
        b.setCodBanco(5);
        b.setNome("Santander");
        b.setCliente(c);
        b.setFuncionario(f);
        
        f.setCodFuncionario(3);
        f.setSetor("Administração");
        f.setBanco(b);
        
        c.setCodCliente(10);
        c.setBanco(b);
        c.setCredito(10.5);
        
    }
    
}
