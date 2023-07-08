package atividade;

public class Gerente extends Funcionario {
    private String Formacao;

    public Gerente(String nome,Endereco endereco ,String telefone, String email, String formacao) {
        super(nome, endereco ,telefone, email);
        Formacao = formacao;
    }

    public String getFormacao() {
        return Formacao;
    }

    public void setFormacao(String formacao) {
        Formacao = formacao;
    }

    @Override
    public Double calculaSalario(double totalVendas) {
       
        Double aa = totalVendas * 3;
        Double porcento = aa /100;
        
        Double salario = (super.getSalMinimo()*4)+porcento;

        return salario;
    }
    
}
