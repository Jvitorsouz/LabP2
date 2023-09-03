public class AlunoApp{

    private String nome;
    private String sobrenome;
    private int exercicios;

    public AlunoApp(String nome, String sobrenome, int exercicios){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.exercicios = exercicios;
    }

    public void adicionaExercicio(){
        this.exercicios += 1;
    }

    public String toString(){
        return "\nNome: " + this.nome + "\nSobrenome: " +  this.sobrenome + "\nExercicios: "+ this.exercicios;
    }
}