package oo.encapsulamento;
public class Pessoa {

    private String nome;
    private String sobrenome;
    private int idade;

    public Pessoa(String nome, String sobrenome, int idade){
        setNome(nome);
        setSobrenome(sobrenome);
        setIdade(idade);
    }

    // Getter
    public int getIdade(){
        return idade;
    }

    public String getNome(){
        return nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    // Setter
    public void setIdade(int novaIdade){
        int idadeMinima = 0;
        int idadeMaxima = 120;
        novaIdade = Math.abs(novaIdade);
        if(novaIdade >= idadeMinima && novaIdade <= idadeMaxima){
            this.idade = novaIdade;
        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto(){
        return getNome() + " " + getSobrenome();
    }
    @Override
    public String toString() {
        return "Olá, eu sou o " + getNomeCompleto() + " e tenho " + getIdade() + " anos";
    }
}
