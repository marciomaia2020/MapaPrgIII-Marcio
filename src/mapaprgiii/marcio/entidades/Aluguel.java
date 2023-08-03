/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapaprgiii.marcio.entidades;

/**
 *
 * @author Márcio
 */
import javax.swing.JOptionPane;

public class Aluguel {
    private Usuario usuario;
    private Carro carro;
    private int quantidadeDias;
    private int kmInicial;
    private int kmFinal;
    private double valorTotalAluguel;

    // Método para cadastrar o usuário
    public void cadastrarUsuario() {
        String nome = JOptionPane.showInputDialog("Digite o nome do usuário:");
        String cpf = JOptionPane.showInputDialog("Digite o CPF do usuário:");
        String telefone = JOptionPane.showInputDialog("Digite o telefone do usuário:");
        usuario = new Usuario(nome, cpf, telefone);
    }

    // Método para cadastrar o carro
    public void cadastrarCarro() {
        String modelo = JOptionPane.showInputDialog("Digite o modelo do carro:");
        String marca = JOptionPane.showInputDialog("Digite a marca do carro:");
        double valorPorKm = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por Km do carro:"));
        carro = new Carro(modelo, marca, valorPorKm);
    }

    // Método para iniciar o aluguel
    public void iniciarAluguel() {
        cadastrarUsuario();
        cadastrarCarro();
        quantidadeDias = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dias de locação:"));
        kmInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite o Km inicial do veículo:"));
    }

    // Método para fechar a locação
    public void fecharLocacao() {
        kmFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite o Km final do veículo:"));

        double valorTotal = quantidadeDias * carro.getValorPorKm() * (kmFinal - kmInicial);

        if (quantidadeDias > 20) {
            valorTotal *= 0.8; // Desconto de 20% para locações com mais de 20 dias
        } else if (quantidadeDias > 10) {
            valorTotal *= 0.9; // Desconto de 10% para locações com mais de 10 dias
        }

        valorTotalAluguel = valorTotal;
    }

    // Método para mostrar o resumo da locação
    public void mostrarResumoLocacao() {
        String resumo = "Resumo Aluguel\n";
        resumo += "Cliente\n" + usuario.mostrarDados() + "\n";
        resumo += "Carro\n" + carro.mostrarDados() + "\n";
        resumo += "Aluguel\n";
        resumo += "Quantidade de dias: " + quantidadeDias + "\n";
        resumo += "Km Inicial: " + kmInicial + "\n";
        resumo += "Km Final: " + kmFinal + "\n";
        resumo += "Valor Total: R$" + valorTotalAluguel + "\n";

        JOptionPane.showMessageDialog(null, resumo);
    }
}
