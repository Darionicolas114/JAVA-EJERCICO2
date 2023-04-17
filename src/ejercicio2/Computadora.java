//2. En un nuevo proyecto crear una clase que represente una Computadora, usted determine
//que atributos describirían mejor a dicho objeto y luego agregue un constructor para
//inicializar sus atributos y los respectivos métodos getter y setter. Desde el método main de
//la clase principal del proyecto, instanciar una Computadora y mostrar por consola el estado
//de todos sus atributos.

package ejercicio2;

/**
 *
 * @author dario
 */
public class Computadora {
    
    private double pantalla;
    private int mause;
    private int teclado;
    private String marca;
    
    public Computadora() {}
    
    
    public Computadora(double pantalla, int mause, int teclado, String marca)
    
    { this.pantalla = pantalla;
      this.mause = mause;
      this.teclado = teclado;
      this.marca = marca;
    
    }

    public double getPantalla() {
        return pantalla;
    }

    public int getMause() {
        return mause;
    }

    public int getTeclado() {
        return teclado;
    }

    public String getMarca() {
        return marca;
    }
    
    
    
    public void setPantalla(double pantalla)
    {this.pantalla = pantalla;
     
     
     
    }
    
    public void setMause(int mause)
    {this.mause = mause;
    }
    
    public void setTeclado(int teclado)
    {this.teclado = teclado;
    }
    
    public void setMarca(String marca)
        {this.marca = marca;
    }
    
}
