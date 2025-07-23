package Model;

import Interface.Persistivel;

public class Computador implements Persistivel {

    private long id;

    private String modelo;
    private  String marca;
    private double preco;
    private int memoriaRam;
    private String processador;
    private boolean placaDeVideoDedicada;

    Fabricante fabricante;

    // Construtor
    public Computador(String modelo, String marca, double preco, int memoriaRam, String processador, boolean placaDeVideoDedicada, Fabricante fabricante) {
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
        this.memoriaRam = memoriaRam;
        this.processador = processador;
        this.placaDeVideoDedicada = placaDeVideoDedicada;
        this.fabricante = fabricante;
    }

    // Get
    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public double getPreco() {
        return preco;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public String getProcessador() {
        return processador;
    }

    public boolean isPlacaDeVideoDedicada() {
        return placaDeVideoDedicada;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    // Metodos
    public double calcularDesconto(double desconto){
        return preco * desconto;
    }

    boolean adicionarMemoriaRam(int quantidade){
        if (quantidade % 2 == 1) return false; // não pode ser par
        memoriaRam += quantidade;
        preco += quantidade * 150;
        return true;
    }

    // toSring
    @Override
    public String toString() {
        return  "Modelo: " + modelo +
                ", \nMarca: " + marca +
                ", \nPreco: " + preco +
                ", \nMemoriaRam: " + memoriaRam +
                ", \nProcessador: " + processador +
                ", \nPlaca de Video Dedicada: " + placaDeVideoDedicada +
                ", \nFabricante: " + fabricante;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public Persistivel cadastrar(Persistivel p) {

        // Foi cadastrado em um banco de dados
        return p;
    }

    @Override
    public Persistivel consultar(long id) {
        return this;
    }

    @Override
    public Persistivel alterar(Persistivel p) {

        // Alterando
        return p;
    }

    @Override
    public boolean excluir(long identificador) {
        return true;
    }
}
