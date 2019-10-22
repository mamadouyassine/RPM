/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeption;
import java.lang.Exception;
/**
 *
 * @author HP
 */
public class DivideException extends ArithmeticException{
    public DivideException()
    {
        super();
    }
	public DivideException(String message)
    {
        super (message);
    }
}
