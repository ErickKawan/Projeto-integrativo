public class Geladeira {
    private int capacidade;
    private String marca;
    private String cor;
    private int portas;
    
    // Construtor sem parâmetros
    public Geladeira() {
        capacidade = 75;
        marca = "Samsung";
        cor = "Preta";
        portas = 2;
    }

    // Construtor com parâmetros
    public Geladeira(int ca, String m, String c,int p) {
        capacidade = ca;
        marca = m;
        cor = c;
        portas= p;
    }
    
    // capacidade
    public int getCapacidade() {
        return capacidade;
    }
    
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    //marca
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) { 
        this.marca = marca;
    }

    // cor
    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPortas() {
        return portas;
    }
    
    public void setPortas(int portas) {
        this.portas = portas;
    }
    public static void main(String[] args) {
        Geladeira g1 = new Geladeira();  // usando o construtor sem parâmetros
        System.out.println("Capacidade: " + g1.getCapacidade());
        System.out.println("Marca: " + g1.getMarca());
        System.out.println("Cor: " + g1.getCor());
        System.out.println("Portas:"+g1.getPortas());

        Geladeira g2 = new Geladeira (400, "Eletrolux", "Cinza",2); // usando o construtor com parâmetros
        System.out.println("\nCapacidade: " + g2.getCapacidade());
        System.out.println("Marca: " + g2.getMarca());
        System.out.println("Cor: " + g2.getCor());
        System.out.println("Portas:"+g2.getPortas());
    }
}

