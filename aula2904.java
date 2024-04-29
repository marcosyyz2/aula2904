package aula2;

import java.util.Scanner;

public class aula2904 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double num, quad, cubo, raiz;
		
		
		System.out.println("digite um numero");
		num =sc.nextInt();
		
		while (num > 0); {
			quad = num * num;
			cubo = num * num;
			raiz = Math.sqrt(num);
			num = sc.nextDouble();
			System.out.println("a raiz quadrada de" + num +"é" + raiz + ", o quadrado é" + quad+", e o cubo é" + cubo + ".");
		}
	
		sc.close();

	}

}
