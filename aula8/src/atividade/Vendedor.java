package atividade;

public class Vendedor extends Funcionario {

    private String setorTrab;


    public Vendedor(String nome,Endereco endereco ,String telefone, String email, String setorTrab) {
        super(nome, endereco ,telefone, email);
        this.setorTrab = setorTrab;
    }
    
    @Override
    public Double calculaSalario(double totalVendas) {
       
        Double aa = totalVendas * 2;
        Double porcento = aa /100;
        
        Double salario = (super.getSalMinimo()*2)+porcento;

        return salario;
    }
    
}
