package challengebennu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numeros{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
    private int cantidad;
    private int listaNumeros[]; 
    
               //Metodos    
    public void crearArreglo(){
        listaNumeros = new int [cantidad];
    }
//-----------------------------------------------------------
    //RELLENAR ARCHIVO CON NUMEROS ALEATORIOS
    public void numerosAleatorios(){
        for (int i = 0; i < listaNumeros.length; i++) {
            listaNumeros[i]= (int)(Math.random()*10+0);
        }
        System.out.println("Numeros ingresados!!");
    }
//------------------------------------------------------------
    //RELLENAR ARCHIVO CON NUMEROS INGRESADOS POR USUARIO
    public void numerosManual() throws IOException{

        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.print("Ingrese numero: ");
            int numero = Integer.parseInt(br.readLine());
            listaNumeros[i]=numero;
        }
    }   
//-------------------------------------------------------------
    //MOSTRAR NUMEROS DE ARCHIVO
    public void mostrarNumeros(int arre[]){
       for (int i = 0; i < arre.length; i++) {
           System.out.print(arre[i]+ " ");
       }
   }
//--------------------------------------------------------------
    // METODO DE ORDENAMIENMTO POR INSERCION
    public void ordenamientoInsercion(int lista[]){
        for (int i = 0; i < lista.length; i++) {
           int posicion= i;
           int valor = lista[i];
           
           while((posicion>0) && (lista[posicion-1] > valor)){
               lista[posicion] = lista[posicion-1];
               posicion--;
           }
            lista[posicion] = valor;
        }
    }
//--------------------------------------------------------------------------
    //ORDENAR DE MENOR A MAYOR
    public void menorMayor(int listanumMenor[]){
        ordenamientoInsercion(listanumMenor);
        System.out.println("Menor a Mayor");
        for (int i = 0; i < listanumMenor.length ; i++) {
            System.out.print(listanumMenor[i]+"  ");
        }
    }
//--------------------------------------------------------------------------
    //ORDENAR DE MAYOR A MENOR
    public void mayorMenor(int listanumMayor[]){
        ordenamientoInsercion(listanumMayor);
        System.out.println("Mayor a Menor");
        for (int i = (listanumMayor.length-1); i >=0; i--) {
            System.out.print(listanumMayor[i]+"  ");
        }
    }
//--------------------------------------------------------------------------   
    //BUSCAR NUMERO EN EL ARCHIVO
    public void buscarNumero(int lista[], int numero){
        boolean encontrado= false;
        int cont= 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i]== numero){
                encontrado = true;
                cont++;
            }
        }
        if ( encontrado== true) {
            System.out.println("numero "+numero+" encontrado!, se repite "+cont+" veces");
            mostrarNumeros(lista);
        }else{
            System.out.println("Numero no encontrado..");
        }
    }
  //--------------------------------------------------------------------------  
    //GETTERS AND SETTERS
    public int[] getListaNumeros() {
        return listaNumeros;
    }

    public void setListaNumeros(int[] listaNum) {
        this.listaNumeros = listaNum;
    }
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
