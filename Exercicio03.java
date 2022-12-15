//3) Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. 
//Calcular e escrever o valor do novo salário.  

import java.util.Scanner;

public class Exercicio03 {

public static void main (String[]args) {

Scanner sc = new Scanner(System.in);

System.out.println("Digite o Valor do salario atual");

int salario= sc.nextInt();

System.out.println("Digite o valor do reajuste em porcentagem");

int reajuste= sc.nextInt();

System.out.println(salario + reajuste/100);

 }

}

