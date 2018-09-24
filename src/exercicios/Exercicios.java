/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * @author Monique Hobbit
 */
public class Exercicios {
    public static void main (String [] args) {
		double d = 100.99; //double sempre armazena números reais
		int i = (int) d; //int sempre armazena números inteiros, (int) converte o valor alocado em int para double
		//aqui ocorre a promoção matemática
		//i é convertido para double e então multiplicado
		d = d*i;
		//ao contrario é necessário informar o casting
		long x = 12345;
		float pi= 3.14f;
		x = x * (long) pi;
		//ou então, converte apenas o resultado
			x = (long) (x* pi);
                System.out.println(x);        
		
	}
}
    //Exercício Clausula if
    public class Clausulaif {   
    public static void main( String[2] args) {
        int idade = 20;
        if( idade<= 12 ) {
            System.out.println("Criança");
        if( idade > 12 && idade<= 19 ) { //pode ser utilizado com Else if
            System.out.println("Adolescente");
        if( idade> 19 && idade<= 60 ) { //pode ser utilizado com Else if
            System.out.println("Adulto");
        if( idade > 60) {
            System.out.println("idoso");
            }     
            }    
            }        
        }
    }
}
