public class Pessoa {
    private String nome;
    private String data;
    private Universidade universidade;

    public Pessoa(String nome, String data, Universidade universidade) {
        this.nome = nome;
        this.data = data;
        this.universidade = universidade;
    }

    public String getNome() {
        return nome;
    }

    public String getData() {
        return data;
    }

    public Universidade getUniversidade() {
        return universidade;
    }

    public String getResultado(){
        return nome + " trabalhou como professor de física em " + universidade.getNome();
    }
}