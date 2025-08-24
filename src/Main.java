public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.marca = "Ferrari";
        carro1.modelo = "F8 Tributo";
        carro1.ano = 2023;

        Carro carro2 = new Carro();
        carro2.marca = "Bugatti";
        carro2.modelo = "Chiron";
        carro2.ano = 2022;


        System.out.println("--- Informações iniciais ---");
        carro1.mostrarInformacoes();
        carro2.mostrarInformacoes();


        carro2.marca = "Porsche";
        carro2.modelo = "911 Turbo S";
        carro2.ano = 2024;


        System.out.println("\n--- Valores modificados ---");
        carro1.mostrarInformacoes();
        carro2.mostrarInformacoes();


        System.out.println("\n--- Ligando os carros ---");
        carro1.ligar();
        carro2.ligar();
    }
}
