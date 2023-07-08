package atividade;
public class Endereco {
  
    String rua;
    String cep;
    String cidade;
    String estado;
    

  
    public Endereco(String rua, String cep, String cidade, String estado) {
        this.rua = rua;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }

    public String getCep() {
        return cep;
    }

    
    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }



    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
 

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }


    
    

}
