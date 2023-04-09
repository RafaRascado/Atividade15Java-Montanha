// Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
// salário bruto.
// quanto pagou ao INSS.
// quanto pagou ao sindicato.
// o salário líquido.
// calcule os descontos e o salário líquido, conforme a tabela abaixo:

import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    
    System.out.println("Quanto você ganha por hora: ");
    Scanner tecladoGanhoPorHora = new Scanner(System.in);
    double ganhoPorHora = tecladoGanhoPorHora.nextDouble();

    System.out.println("Quantas horas foram trabalhadas esse mês: ");
    Scanner tecladoHoraPorMes = new Scanner(System.in);
    double horaPorMes = tecladoHoraPorMes.nextDouble();

    double salarioBruto = ganhoPorHora * horaPorMes; 
    double descontoImpostoDeRenda = (salarioBruto * 11) / 100;
    double descontoInss = (salarioBruto * 8) / 100;
    double descontoSindicato = (salarioBruto * 5) / 100;
    double descontoTotais = descontoImpostoDeRenda + descontoInss + descontoSindicato; 
    double salarioLiquido = salarioBruto - descontoTotais; 

    System.out.println("O salário bruto é: " + salarioBruto + " O desconto de imposto de renda é: " + descontoImpostoDeRenda + "O desconto do INSS é: " + descontoInss + "O desconto do sindicato é: " + descontoSindicato + " O salário líquido será: " + salarioLiquido);
  }
}