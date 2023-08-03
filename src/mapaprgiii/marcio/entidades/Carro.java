/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapaprgiii.marcio.entidades;

/**
 *
 * @author Márcio
 */
public class Carro {
    private String modelo;
    private String marca;
    private double valorPorKm;

    // Construtor
    public Carro(String modelo, String marca, double valorPorKm) {
        this.modelo = modelo;
        this.marca = marca;
        this.valorPorKm = valorPorKm;
    }

    // Métodos Getter
    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public double getValorPorKm() {
        return valorPorKm;
    }

    // Método para mostrar dados do carro
    public String mostrarDados() {
        return "Modelo: " + modelo + "\nMarca: " + marca + "\nValor por Km: " + valorPorKm;
    }
}
