/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatricerpn;
import calculatricerpn.SaisieRPN;
import exeption.SAISIException;


/**
 *
 * @author HP
 */
public class CalculatriceRPN {
    
    	//val1;
	CalculatriceRPN() 
	{
	
		SaisieRPN b=new SaisieRPN();
		  try {
			b.saisie();
		} catch (SAISIException e) {
			System.out.println(e.getMessage());
		}		
		
	}
	
	public static void main(String[] args) {
		CalculatriceRPN e;	
	}
		
    
}
