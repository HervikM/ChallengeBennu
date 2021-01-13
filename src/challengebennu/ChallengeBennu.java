package challengebennu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author Hervik
 */
public class ChallengeBennu {
    /* Challenge
    */

    public static void main(String[] args)throws Exception {
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        Numeros n = new Numeros();
        
        System.out.println("Hola!");
        while(true){
      
            System.out.println("\nSeleccione una opcion: \n"
                             + "|1| Generar archivo de numeros.\n"
                             + "|2| Mostrar archivo de numeros.\n"
                             + "|3| Ordenar numeros. \n"
                             + "|4| Buscar un numero. \n"
                             + "|5| Salir. ");
            
            String opc = br.readLine();
            
            switch(opc){
                
                case "1": //GENERAR ARCHIVO DE NUMEROS 
                     System.out.println("¿Cuantos numeros quiere generar?");
                     int cantidadNumeros = Integer.parseInt(br.readLine());
                     n.setCantidad(cantidadNumeros);
                     
                    System.out.println("Seleccione una opcion: \n"
                                     + "|1| Introducir numeros aleatoriamente. \n"
                                     + "|2| Introducir los numeros de forma manual\n"
                                     + "|3| Salir ");
                    String opc2 = br.readLine();
                    
                    switch(opc2){
                        case "1" : //OPCIONES GENERAR ARCHIVO
                            n.crearArreglo();
                            System.out.println("Ingresando "+cantidadNumeros+" numeros....");
                            n.numerosAleatorios();
                        break;
                        
                        case "2":
                            n.crearArreglo();
                            System.out.println("Ingresa "+cantidadNumeros+" numeros\n");
                             n.numerosManual();
                        break;
                      
                        case "3":
                            System.out.println("Adios");
                        break;
                        
                        default:
                            System.out.println("Opcion incorrecta");
                        break;
                           
                    }
                break;
                
                case "2"://MOSTRAR ARCHIVO
                    System.out.println("Mostrar archivo de numeros.");
                    n.mostrarNumeros(n.getListaNumeros());
                break;

                case "3": //ORDENAR ARCHIVO
                    System.out.println("Ordenar numeros");
                    System.out.println("Seleccione una opcion: \n"
                                     + "|1| Ordenar de menor a mayor. \n"
                                     + "|2| Ordenar de mayor a menor\n"
                                     + "|3| Salir ");
                    
                    String opc3 = br.readLine();
                    switch(opc3){//OPCIONES PARA ORDENAR ARCHIVO
                        case "1":
                            n.menorMayor(n.getListaNumeros());
                        break;
                        
                        case "2":
                            n.mayorMenor(n.getListaNumeros());
                        break;
                        
                        default:
                            System.out.println("Opcion incorrecta");
                        break;
                    }
                break;
                
                case "4"://BUSCAR NUMERO EN ARCHIVO
                    System.out.println("Buscar un numero");
                    System.out.print("Ingrese el numero que desea buscar: ");
                    int num = Integer.parseInt(br.readLine());
                    n.buscarNumero(n.getListaNumeros(), num);
                break;
                
                case "5": //SALIR
                    System.out.println("Adios!");
                    System.exit(0);
                break;
                
                default:
                    System.out.println("Opcion incorrecta");
                break;
            }
        }
        
        
        
    }

}
