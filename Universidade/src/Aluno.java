class Universidade {
    private String nome;
    private String ra;
    private double[] nota;
    private double presenca;
    private double media;

    // Construtor para as disciplinas
    public Universidade(String nome, String ra, double[] notas, double presenca) {
        this.nome = nome;
        this.ra = ra;
        this.nota = notas;
        this.presenca = presenca;
        this.media = NotaFinal();
    }

    // Método para calcular a nota final com base na quantidade de notas
    private double NotaFinal() {
        if (nota.length == 2) {
            return (nota[0] + nota[1]) / 2;
        } else if (nota.length == 3) {
            return (nota[0] + nota[1] * 2 + nota[2] * 4) / 7;
        } else if (nota.length == 4) {
            return (nota[0] * 0.15) + (nota[1] * 0.30) + (nota[2] * 0.10) + (nota[3] * 0.45);
        } else {
            return 0;
        }
    }

    // Método para definir se o aluno está aprovado ou reprovado
    public String getSituacao() {
        if (media >= 5 && presenca >= 75) {
                return "Aprovado";
            } else {
                return "Reprovado";
            }
        }
 

    // Método para imprimir os dados do aluno
    public void imprimeDados() {
        System.out.println("Nome: " + nome);
        System.out.println("RA: " + ra);
        System.out.printf("Média final: %.3f\n", media);
        System.out.println("Situação: " + getSituacao());
    }
}
   public class Aluno{
    // Método para mostrar os resultados da classe
    public static void main(String[] args) {
        double[] notas = {5.0, 8.0, 7.0};
        Universidade aluno1 = new Universidade("Murilo Ramos", "249257", notas, 80);
        aluno1.imprimeDados();
    }
   }

