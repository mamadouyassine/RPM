/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatricerpn;
import exeption.MAXMINException;
import java.util.Stack;

/**
 *
 * @author HP
 */
// Implementation de la classe Moteur
public class MoteurRPN {
    
    Stack<Double> p = new Stack<> ();
	private final static int MIN_VALUE=-999;
	private final static int MAX_VALUE=999;
	

	public MoteurRPN() 
	{
		p=new Stack<>();
	}
	
        
        //methode pour enregistrer une operande 
	public void enregistrer(Double value) throws MAXMINException{
		if (value> MAX_VALUE || value< MIN_VALUE) throw new MAXMINException ("La valeur entrée ne correspond pas à l'intervall\n");
			/*try {
				throw new MAXMINException ("La valeur entrée ne correspond pas à l'intervall\n");
			} catch (MAXMINException e) {
			}*/
		else
		p.push(value);
                
	}
	//methode pour appliquer une operation sur les operandes
	public void calcul(Operation op){	
                        double resultat;
			Double v = depile();//depiler la première operande
			Double y = depile();//depiler la seconde operande
			resultat = op.eval(v, y);//applique une operation sur les operandes x et y
			p.push(resultat);//empiler le resultat de l'operation dans la pile
	}
	
	public boolean isEmpty() 
	{
		return p.empty();
		
	}
	
        //cette fonction permet de depiler l'element se trouvant à la tete de la pile
	public double depile() 
	{	
		if (p.isEmpty());
		return p.pop() ;		  
	}
	//cette fonction renvoie le nombre d'operande
	public int nbrOperande()
	{
		return p.size();
		
	}
	
	public Stack<Double> getP() {
		return p;
	}
}
