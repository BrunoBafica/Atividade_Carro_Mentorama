import java.util.Scanner;
import models.Caract;

public class Main {
    public static void main(String[] args) {

        int portas, calotas, rodas, ano, km;
        String modelo, marca, cor, combustivel, transmissao;

        Scanner ler = new Scanner(System.in);
        Scanner inteiro = new Scanner(System.in);

        System.out.print("Modelo do Carro: ");
        modelo = ler.nextLine();

        System.out.print("Ano: ");
        ano = inteiro.nextInt();

        System.out.print("Marca: ");
        marca = ler.nextLine();
        
        System.out.print("Quilometragem: ");
        km = inteiro.nextInt();

        System.out.print("Combustível: ");
        combustivel = ler.nextLine();

        System.out.print("Transmissão: ");
        transmissao = ler.nextLine();

        System.out.print("Cor: ");
        cor = ler.nextLine();

        System.out.print("Quantas rodas possui o carro ? (Sem step): ");
        rodas = ler.nextInt();

        System.out.print("Quantidade de portas(Incluindo porta malas): ");
        portas = ler.nextInt();

        calotas = rodas;

        Caract caract = new Caract(portas, calotas, rodas, ano, km, modelo, marca, cor, combustivel, transmissao);

        System.out.println(" ");
        System.out.println("Modelo: " + caract.getModelo());
        System.out.println("Ano: " + caract.getAno());
        System.out.println("Marca: " + caract.getMarca());
        System.out.println("Quilometragem: " + caract.getKm());
        System.out.println("Combustível: " + caract.getCombustivel());
        System.out.println("Transmissão: " + caract.getTransmissao());
        System.out.println("Cor: " + caract.getCor());
        System.out.println("Rodas: " + caract.getrodas());
        System.out.println("Portas: " + caract.getPortas());
        System.out.println("Calotas: " + caract.getCalotas());


    }
}
