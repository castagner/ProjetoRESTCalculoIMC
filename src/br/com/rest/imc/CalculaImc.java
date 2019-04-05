package br.com.rest.imc;

public class CalculaImc {
	
	private final double altura;
	private final double peso;
	private double imc;
	
	public CalculaImc( double altura, double peso ) {
		
		this.altura = altura;
		this.peso = peso;
		this.imc = Math.round( calcula() );
	}
	
	
	private double calcula() {
		
		return (peso / ( Math.pow(altura, 2) ) );
	}
	
	
	public String getResultado() {
		
		if ( imc < 18.5 ) {
			return "Abaixo do peso";
		}
		
		if ( imc >= 18.5 && imc <= 24.9 ) {
			return "Com peso normal";
		}
		
		if ( imc >= 25 && imc <= 29.9 ) {
			return "Com sobrepeso";
		}
		
		if ( imc >= 30 && imc <= 34.9 ) {
			return "Com obesidade grau 1";
		}
		
		if ( imc >= 35 && imc <= 39.9 ) {
			return "Com obesidade grau 2";
		}
		
		return "Com obesidade grau 3";
	}

}
