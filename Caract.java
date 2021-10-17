package models;

public class Caract {

    private int portas, calotas, rodas, ano, km;
    private String modelo, marca, cor, combustivel,transmissao;

    public Caract(int portas, int calotas, int rodas, int ano, int km, String modelo, String marca, String cor, String combustivel, String transmissao ){

        this.portas = portas;
        this.calotas = calotas;
        this.rodas = rodas + 1;
        this.ano = ano;
        this.km = km;
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.combustivel = combustivel;
        this.transmissao = transmissao;
    }

    public int getPortas(){
        return portas;
    }

    public int getCalotas(){
        return calotas;
    }

    public int getrodas(){
        return rodas;
    }

    public int getAno(){
        return ano;
    }

    public int getKm(){
        return km;
    }

    public String getModelo(){
        return modelo;
    }

    public String getMarca(){
        return marca;
    }

    public String getCor(){
        return cor;
    }

    public String getCombustivel(){
        return combustivel;
    }

    public String getTransmissao(){
        return transmissao;
    }
    
}
