import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Despachante {

	public String Invoke(String mensage){

 		String split_msg[] = new String[3];
 		split_msg = mensage.split(" ");
		String valor1 = split_msg[0];
		String valor2 = split_msg[2]; 

 		String oper = split_msg[1] ;
 		Esqueleto esq = new Esqueleto();

 			//this.valor1 = Double.parseDouble(getRequest());
			
			//this.valor2 = Double.parseDouble(getRequest());
			 	
 		String result;
		if(oper.equals("+")){
			result = esq.add(valor1,valor2);		
		}
		else if(oper.equals("-")){
			result = esq.sub(valor1,valor2);	
		}
		else if(oper.equals("*")){
			result = esq.mult(valor1,valor2);
		}
		else if(oper.equals("/")){
			result = esq.div(valor1,valor2);
		}
		else{
			return "Operação Inválida\n";
		}
				  		
  		
		return result;
	}
}