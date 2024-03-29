package banco;

public class Principal {

    public static void main(String[] args) {
        
        Banco b1 = new Banco();
        Cliente c1 = new Cliente();
        Funcionario f1 = new Funcionario();
        
        b1.setCodBanco(5);
        b1.setNome("Bradesco");
        b1.setCliente(c1);
        b1.setFuncionario(f1);
        
        f1.setCodFuncionario(3);
        f1.setNome("Victor");
        f1.setIdade(27);
        f1.setCpf("000.000.000-0");
        f1.setSetor("Administração");
        f1.setBanco(b1);
        
        c1.setCodCliente(10);
        c1.setNome("Carol");
        c1.setIdade(33);
        c1.setCpf("111.111.111-1");
        c1.setBanco(b1);
        c1.setCredito(10.5);
        
        System.out.println("-------------------------");
        
        System.out.println("Banco: "+b1.getNome());
        
        System.out.println("                 ");
        
        b1.Cliente();
        
        System.out.println("                 ");
        
        b1.Funcionario();
        
        
        System.out.println("-------------------------");
        
        System.out.println("Banco: "+b1.getNome());
        System.out.println("Codigo: "+b1.getCodBanco());
        
        System.out.println("                 ");
        
        System.out.println("Cliente: "+c1.getNome());
        System.out.println("Cpf: "+c1.getCpf());
        
        System.out.println("                 ");
        
        System.out.println("Cliente: "+f1.getNome());
        System.out.println("Cpf: "+f1.getCpf());
        
        System.out.println("-------------------------");
    }
    
}
