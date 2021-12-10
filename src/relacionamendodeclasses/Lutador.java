package relacionamendodeclasses;

public class Lutador {

    // Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    // Metodos Abstratos
    public void apresentar() {
        System.out.println("Chegou a hora de apresentarmos o lutador " + this.getNome());
        System.out.println("Diretamente de " + getNacionalidade());
        System.out.println("com " + getIdade() + " anos");
        System.out.println("pesando " + getPeso() + " Kg");
        System.out.println(this.getVitorias() + " Vitorias!");
        System.out.println(this.getDerrotas() + " Derrotas!");
        System.out.println(this.getEmpates() + " Empates!");
    }

    public void status() {
        System.out.println(this.getNome() + " eh um " + getCategoria());
        System.out.println("Ganhou " + getVitorias() + " vezes");
        System.out.println("Perdeu " + getDerrotas() + " vezes");
        System.out.println("Empatou " + getEmpates() + " vezes");
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    // Metodo Contrutor
    public Lutador(String no, String na, int id, float alt, float pe, int vi, int der,
            int emp) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = alt;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = der;
        this.empates = emp;
    }

    // ***************Metodos Especiais*******************/
    // Nome
    public String getNome() {
        return nome;
    }

    private void setNome(String no) {
        this.nome = no;
    }

    // Nacionalidade
    public String getNacionalidade() {
        return nacionalidade;
    }

    private void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    // Idade
    public int getIdade() {
        return idade;
    }

    private void setidade(int id) {
        this.idade = id;
    }

    // Altura
    public float getAltura() {
        return altura;
    }

    private void setIdade(int id) {
        this.idade = id;
    }

    // Peso
    public float getPeso() {
        return peso;
    }

    private void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }

    // Categoria
    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2)
            this.categoria = "Invalido";
        else if (this.peso <= 70.3)
            this.categoria = "Leve";
        else if (this.peso <= 83.9)
            this.categoria = "Medio";
        else if (this.peso <= 120.2)
            this.categoria = "Pesado";
        else
            this.categoria = "Invalido";
    }

    // Vitorias
    public int getVitorias() {
        return vitorias;
    }

    private void setVitorias(int vi) {
        this.vitorias = vi;
    }

    // Derrotas
    public int getDerrotas() {
        return derrotas;
    }

    private void setDerrotas(int der) {
        this.derrotas = der;
    }

    // Empates
    public int getEmpates() {
        return empates;
    }

    private void setEmpates(int emp) {
        this.empates = emp;
    }
    // *************** Fim de Metodos Especiais*******************/
}
