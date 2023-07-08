package teste;
import java.text.DecimalFormat;

import atividade.Funcionario;
import atividade.Gerente;
import atividade.Produto;
import atividade.Vendedor;
import modelos.Cliente;
import modelos.Conta;
import modelos.ContaCorrente;
import modelos.ContaPoupança;
import atividade.Endereco;
import modelos.Telefone;

public class Teste {
    public static void main(String[] args) {

        Endereco endereco = new Endereco("Rua dos idiotas", "123", "Manaus", "Amazonas");
        Vendedor lorhan = new Vendedor("Lorhan", endereco ,"12378129807", "lorhanxl99@gmail.com","vendas");
        System.out.println("Salario vendedor " + lorhan.calculaSalario(10.0)); 
        
        Gerente yasmin = new Gerente("Yasmin", endereco, "9999999", "ycardosochatinha", "Rap de branco");
        System.out.println("Salario gerente " + yasmin.calculaSalario(300.0));
        Produto celularGb = new Produto("Xiomi", "1232123", 123123, 10.0);
        System.out.println("Preço de compra " + celularGb.getPreco());
        System.out.println("Preço de venda " + celularGb.calcPrecoVenda());
        
    }
}
