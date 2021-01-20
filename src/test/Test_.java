import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
public class Test_ {
    
    @Test/*crear test*/
    @DisplayName("el multiplo de 3 es 3")/*poner lo que se va a realizar*/
    void test3(){/*crear procedimiento que no devuelva nada llamado test3*/
        Calculadora calc=new Calculadora();/*crear objeto de Calculadora*/
        String resultado=calc.fb(3);/*crear resultado de tipo string, cadena de caracteres, que llame a la funcion de fb*/
        assertEquals("Face", resultado);/*comparar los resultados*/
    }

    @Test
    @DisplayName("el multiplo de 5 es 5")
    void test5(){
        Calculadora calc=new Calculadora();
        String resultado=calc.fb(5);
        assertEquals("Book", resultado);
    }

    @Test
    @DisplayName("el multiplo de 15 es 30")
    void test15(){
        Calculadora calc=new Calculadora();
        String resultado=calc.fb(30);
        assertEquals("Facebook", resultado);
    }

}