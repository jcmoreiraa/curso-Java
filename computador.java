public class computador {
    public String tipo;
    public String marca;
    public int memoriaRam;
    public int armazenamento;

    public computador(String tipo, String marca, int armazenamento, int memoriaRam){
        this.tipo = tipo;
        this.marca = marca;
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
    }
    void exibirTipoComputador(){
        System.out.println("Tipo do computador:" + " "+ this.tipo);

    }
    void exibirConfigs(){
        //"Marca: HP, Memória RAM: 16GB, Armazenamento: 256GB"
        String gb = "GB";
        String espaco = " ";
         System.out.println("Marca: " + this.marca + "," + espaco + "Memoria RAM: " + this.memoriaRam + gb + "," + espaco+ "Armazentamento: " + this.armazenamento + gb);

    }

    public static void main(String[] args) {
        computador notebook = new computador("Notebook", "HP", 256, 8);
        notebook.exibirConfigs();
        notebook.exibirTipoComputador();
       
    }
}
