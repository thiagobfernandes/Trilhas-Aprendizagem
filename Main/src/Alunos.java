public class Alunos {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    // Construtor
    public Alunos(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    // Método para calcular o IMC
    public double calcularIMC() {
        return peso / (altura * altura);
    }

    // Método para verificar se o aluno é menor de idade
    public boolean isMenorDeIdade() {
        return idade < 18;
    }

    // Métodos Getters para acessar os atributos
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + " anos, Peso: " + peso + " kg, Altura: " + altura + " m, IMC: " + String.format("%.2f", calcularIMC()) +
                (isMenorDeIdade() ? " (Menor de idade)" : " (Maior de idade)");
    }

}
