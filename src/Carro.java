public class Carro {
    String marca;
    String modelo;
    int ano;

    public void mostrarInformacoes() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Ano: " + ano);
    }

    public void ligar() {
        System.out.println(marca + " " + modelo + " está ligado! 🚗");
    }
}
