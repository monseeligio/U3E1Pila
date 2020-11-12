package u3e1pila;

import java.util.Scanner;

public class U3E1Pila {
    public static void main(String[] args) {
      pila pila =new pila();
      int elemento;
     int opc2=0;
     int opc;
     Scanner LECTOR = new Scanner(System.in);
       do{ 
        System.out.println("\n-------Menu------");
        System.out.println("1. Insertar dato");
        System.out.println("2. eliminar");
        System.out.println("3. mostar");
        System.out.println("5. Salir del programa");
        System.out.println("¿Que desea realizar?");
        opc=LECTOR.nextInt();
        switch(opc){
            case 1:
            Scanner Lector2 = new Scanner(System.in);
            int cont=10;
            while (cont>0){
            System.out.println("inserte un elemento ");
            elemento=Lector2.nextInt();
            if(elemento>49 && elemento<501 ){
            pila.empuja(elemento); 
            cont--;
            }
            else{
                System.out.println("El numero no esta en el rango permitido");    
                    }
            }
            
            break;
            case 2:pila.Sacarpila();break;
            case 3:pila.mostrarPila();break;
            case 5: System.exit(0);break;
            default:System.out.println("No existe esa opcion, por favor intente de nuevo");
        }
        
          System.out.println("\n¿Desea realizar otro proceso? presione 2=NO");
       opc2=LECTOR.nextInt();
       }while(opc2!=2); 


    }
    
}
