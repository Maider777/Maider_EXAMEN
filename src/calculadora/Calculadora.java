public class Calculadora{

    public String fb(int x) {/*crear funcion de tipo string llamado fb que tiene un parametro de tipo entero*/

        String resultado = "";/*crear resultado de tipo string*/

        if (x % 3 == 0) {/*si la x dividido entre tres es 0*/
            resultado = "Face";
            return resultado;/*devolver resultado*/
        }else if(x % 5 == 0){
            resultado = "Book";
            return resultado;
        }else if(x % 30 == 0){
            resultado = "Facebook";
            return resultado;
        }else{
            return resultado;

        }
    }

    public String array(int [] array){/*crear funcion publica de tipo string llamada array que tiene un array de tipo entero*/

        String resultado = "";/*crear resultado de tipo string*/

        for (int i=0; i<3; i++) {/*recorrer el indice*/
            
        }
    }

}