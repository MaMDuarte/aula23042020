package usarCalculadora;
import com.marioduarte.calculadora.*;

public class exec {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int soma = calculadoraAPI.soma(5, 2); //7
		int sub = calculadoraAPI.subtracao(5, 2); //3
		int multiplic = calculadoraAPI.multiplicacao(5, 2); //10
		double div = calculadoraAPI.divisao(5, 2); //2.5
		
		System.out.println("soma: " + soma);
		System.out.println("subtração: " + sub);
		System.out.println("multiplicação: " + multiplic);
		System.out.println("divisao: " + div);
	}

}
