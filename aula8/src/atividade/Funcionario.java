package atividade;

public class Funcionario {
    private String nome;
    private Endereco endereco;
    private String telefone;
    private String email;
    private static Double salMinimo = 1320.0;

    public Funcionario(String nome,Endereco endereco ,String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;

    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    protected Double calculaSalario(double totalVendas){
        Double salario = salMinimo;
        return salario;
    }

    public static Double getSalMinimo() {
        return salMinimo;
    }
    
}
