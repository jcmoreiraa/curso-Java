public class Filme {
    public String titulo;
    public int duracaoEmMinutos;
    public String genero;

    public Filme(String titulo, int duracaoEmMinutos, String genero) {
        this.titulo = titulo;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.genero = genero;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Duração: " + this.duracaoEmMinutos + " minutos");
        System.out.println("Gênero: " + this.genero);
    }

    public void calcularDuracaoHoras() {
        int horas = this.duracaoEmMinutos / 60;
        int minutos = this.duracaoEmMinutos % 60;
        System.out.println(horas + " horas e " + minutos + " minutos");
    }

    public static void main(String[] args) {
        Filme filme = new Filme("Shrek", 90, "Animação");
        filme.exibirInformacoes();
        filme.calcularDuracaoHoras();
    }
}
