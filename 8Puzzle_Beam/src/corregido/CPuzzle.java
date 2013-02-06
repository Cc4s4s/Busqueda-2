/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package corregido;
import java.awt.Point;
/**
 *
 * @author owner
 */
public class CPuzzle {
  private int Casilla [][]; //Valores de las piezas del rompecabezas
  private int heuristica; // Guarda la heuristica del rompecabezas
  private Point hueco; //Guarda la posicion del 0
  private int Datos[][]; // Guarda el estado final o modelo
  private int Nivel; //Nivel al que pertenece el nodo
  
  
  
  /* CONSTRUCTOR */
  /* Crea un CPuzzle de 3x3 a partir de la Casilla dada de parámetro
   * 
   */
   
    public CPuzzle(int Casilla[][], int Nv){
     
        this.Casilla =  new int[3][3];                  
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                    this.Casilla[i][j]  = Casilla[i][j]; //Se copian valores
                }
            }

            hueco = new Point(); //Se crea un Punto que guardara el 0
            Datos = new int[3][3]; //Datos del modelo a alcanzar
            Nivel = Nv;// Nivel al cual pertenece


           Hueco(); //Guarda la posicion x y en Hueco
           IniciarModelo(); //Establece el estado modelo
           calcularHeuristica(); //Calcula heuristica con base al modelo                              
    }
    
  public int[][] getCasilla() {
        return Casilla; //Regresa el arreglo de piezas
    }
     public int Heuristica() {
        return heuristica; // Regresa el valor de heurística
    }
     public int getNivel() {
        return Nivel; // Regresa el valor de heurística
    }
      public Point Cero() {
        return hueco;// Regresa la posición del hueco
    }
      /***
       * Calcula la heusritica de los acomodados y pone el valor en h
       */
    private void calcularHeuristica() {
       //Entre mas pequeño es el valor de h más se parece Casillas
        // a modelo
        int x1 = 0, y1 = 0, x2, y2, Tam = 0;
        int h = 0; // Valor máximo de la heurística
        
        // Desacomodados
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if (Casilla[i][j] != Datos[i][j])// Si el modelo es igual
                    // a la posicion se resta de h.
                    h++;
                }
            }
        heuristica = h;
        
        /*
        // Acomodados
        h=9;
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if (Casilla[i][j] == Datos[i][j])// Si el modelo es igual
                    // a la posicion se resta de h.
                    h--;
                }
            }
        heuristica = h;
        
        */
        
        /*
        h = 0;
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                 Point c = buscar(Datos[i][j]);
                 int distancia = Math.abs(i - c.x) + Math.abs(j - c.y);
                 h = h + distancia;
            }
        }
        
        
        for (int i=1;i<((Tam + 1)*(Tam + 1) - 2);i++){ 
            BuscarP(x1, y1, i);
            BuscarP(x1, y1, i+1);
            if ((Math.abs(x1-x2) = 1) && (Math.abs(y1-y2) = 0) || (Math.abs(x1-x2) = 0) && (Math.abs(y1-y2) = 1)){
                h = h + 10;
            }
        }*/
                
    }
    
    private void BuscarP(int x1, int y1, int i) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    private Point buscar(int ii) {
        Point p = new Point();
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                    if (Casilla[i][j] == ii){
                        p.x=i;
                        p.y=j;
                    }
            }
        }
        
        return p;
    }
    
    /**
         * Se inicializa el estado Meta
         */
  private void IniciarModelo(){
   /* Datos[0][0]= 2;
    Datos[0][1]= 8;
    Datos[0][2]= 3;
    
    Datos[1][0]= 0;
    Datos[1][1]= 6;
    Datos[1][2]= 4;
    
    Datos[2][0]= 1;
    Datos[2][1]= 7;
    Datos[2][2]= 5;*/
    
    
    Datos[0][0]= 1;
    Datos[0][1]= 2;
    Datos[0][2]= 3;
    Datos[1][0]= 8;
    Datos[1][1]= 0;
    Datos[1][2]= 4;
    Datos[2][0]= 7;
    Datos[2][1]= 6;
    Datos[2][2]= 5;  
     
}
  
          
  
            /**
           * Obtiene la posicion donde está la casilla vacía y la pone
           * en hueco
           */
   
   private void Hueco() 
    {
        int x,y;
    
        for (x=0;x<3;x++)
        {
            for(y=0; y<3; y++)
            {
                if (Casilla[x][y]==0) //Si encuentra un cero, guarda
                    // la posicion y sale
                {
                    hueco.x= x;
                    hueco.y= y;
                    return;
                }
            }
        }  
}

    

   
}
