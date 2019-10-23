/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatricerpn;

import exeption.DivideException;

/**
 *
 * @author HP
 */
public enum Operation {
    
    
    MULT("*") {
		@Override
		public double eval(double a, double b) {
		
			return a*b;
		}
	}, ADD("+") {
		@Override
		public double eval(double a, double b) {
			
			return a+b;
		}
	}, SUB("-") {
		@Override
		public double eval(double a, double b ){
			
			return a-b;
		}
	}, DIV ("/") {
		@Override
		public double eval(double a, double b) {
			try {
				double s=a/b;
			if (b==0)   
				throw new DivideException("Division par 0 n'est pas possible\n");
				
				} catch (DivideException e) {  
				}
			return a/b;
		}
	} ;
	
 private  String symbole;
 
 
  private Operation (String symbole)
  {
	
	this.symbole = symbole;
	
}
  public String getsymbole() {  
      return  this.symbole ;  
 }   
  
  public abstract double eval (double a, double b);
  
    
    
   
    
    
    
    
    
}
