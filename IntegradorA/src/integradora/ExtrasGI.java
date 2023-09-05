/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integradora;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ExtrasGI {
    
    public static void calcularTiempo(){
        System.out.println("Ingresar minutos: ");
        Scanner leer=new Scanner(System.in);
        int min,h,d;
        min=leer.nextInt();
        
        h=min/60;
        min=min%60;
        
        d=h/24;
        h=h%24;
        
        System.out.println("1600 minutos son: " + h + " horas " + d + " dia " );
   
        
        
    }
    
    public static void cambiarValor(){
        Scanner leer=new Scanner(System.in);
        int A;
        int B;
        int C;
        int D;
        int aux;
        
        System.out.println("ingresar primero numero: ");
        A=leer.nextInt();
        System.out.println("ingresar segundo numero: ");
        B=leer.nextInt();
        System.out.println("ingresar tercer numero: ");
        C=leer.nextInt();
        System.out.println("ingresar cuarto numero: ");
        D=leer.nextInt();
        
        aux=A;
        A=D;
        D=B;
        B=C;
        C=aux;
        
        
        
        System.out.println("ahora a "+ A + " vale: " );
        System.out.println("ahora b "+ B + " vale: " );
        System.out.println("ahora c "+ C + " vale: ");
        System.out.println("ahora d "+ D + " vale: ");
        
        
    }
    
    public static void sonVocales(){
        char vocal;
        System.out.println("Ingrese la letra: ");
        Scanner leer=new Scanner(System.in);
        vocal=leer.next().charAt(0);
        vocal=Character.toLowerCase(vocal);
        
        if ('A' == vocal || 'E' == vocal || 'I' == vocal || 'O' == vocal || 'U' == vocal) {
            System.out.println("Esta letra es una vocal.");
        } else {
            System.out.println("Esta letra es una consonante. ");
        }
    }
     public static void romano() {
        int cont = 0;
        do {
            System.out.println("Ingrese una numero entre 1 y 10");
            Scanner leer=new Scanner(System.in);

            int numero = leer.nextInt();
            if (numero > 0 && numero < 11) {
                switch (numero) {

                    case 1:
                        System.out.println("El numero en romano es:  I");
                        break;
                    case 2:
                        System.out.println("El numero en romano es:  II");
                        break;
                    case 3:
                        System.out.println("El numero en romano es: III");
                        break;
                    case 4:
                        System.out.println("El numero en romano es: IV");
                        break;
                    case 5:
                        System.out.println("El numero en romano es:  V");
                        break;
                    case 6:
                        System.out.println("El numero en romano es: VI");
                        break;
                    case 7:
                        System.out.println("El numero en romano es: VII");
                        break;
                    case 8:
                        System.out.println("El numero en romano es: VIII");
                        break;
                    case 9:
                        System.out.println("El numero en romano es: IX");
                        break;
                    case 10:
                        System.out.println("El numero en romano es: X");
                        break;

                }
            } else {
                System.out.println("El numero esta fuera de rango");
                cont++;
            }
        } while (cont == 0);
    }
     
     public static void ObraSocial() {
        char SocioA = 'A', SocioB = 'B', SocioC = 'C', opcion;
        double valor;

        System.out.println("Ingrese la clase de socio A, B o C : ");
        Scanner leer=new Scanner(System.in);
        opcion = leer.next().charAt(0);
        opcion = Character.toUpperCase(opcion);
        System.out.println("Ingrese el monto a abonar. ");
        valor = leer.nextDouble();

        switch (opcion) {
            case 'A':
                System.out.println("El monto a abonar es: " + (valor / 2));// (tAMBIEN PUEDE SER VALOR *0.5)
                break;
            case 'B':
                System.out.println("El monto a abonar es: " + (valor - (valor/ 20) * 7)); //*35/100 o *0.35
                break;
            case 'C':
                System.out.println("El monto a abonar es: " + valor);
                break;
            default:
                System.out.println("El tipo de socio ingresado no es válido.");
                ObraSocial();
        }

    }
     public static void alturaDePersonas(){
         System.out.println("Ingresar la altura de una persona: ");
         double N;
         Scanner leer=new Scanner(System.in);
         N=leer.nextInt();
         
         
     }
     
     public static void simulacionDeResta(){
         int num;
         int num2;
         int conta=0;
         
         do{
         Scanner leer=new Scanner(System.in);
         System.out.println("Escriba el numero a dividir: ");
         num=leer.nextInt();
         System.out.println("Escriba el divisor: ");
         num2=leer.nextInt();
         
         }while(num<=0 || num2<=0);
         
         while(num2<=num){
             num=num-num2;
             conta++;
         }
         System.out.println("el conciente es: " + conta);
         System.out.println("el resto es: " + num);
     }
     public static void resultadoMultiplicacion(){
         int elnumero;
         int resultado;
         int random=(int)(Math.random()*11);
         int random2=(int)(Math.random()*11);
         Scanner leer=new Scanner(System.in);
         resultado=random*random2;
         
         System.out.println("Multiplicacion aleatoria: ");
         do{
             elnumero=leer.nextInt();
             if(elnumero>resultado){
                 System.out.println("el numero es mas grande");
             }else if(elnumero<resultado){
                 System.out.println("el numero es mas chico");
             }
             
         }while(elnumero!=resultado);
         System.out.println("lo encontraste");
         
     }
     
     public static void cantidadDeDigitos(){
         Scanner leer=new Scanner(System.in);
//         String entero;
         System.out.println("ingresar entero: ");
//         entero=leer.next();
//         System.out.println("este numero tiene " + entero.length()+ "digitos" );
         
         int entero;
         int conta=0;
         entero=leer.nextInt();
                 
         while(entero>0){
             entero=entero/10;
             conta++;
         }
         System.out.println("la cantidad de digitos es: "+ conta );
      
     }
     
     public static void escaleraNumeros(){
         System.out.println("Ingresar altura");
         int numero;
         Scanner leer=new Scanner(System.in);
         numero=leer.nextInt();
         
         for(int i=1;i<=numero;i++){
             for(int j=1;j<=i;j++){
                 System.out.print(j);
             }
             System.out.println("");
         }
     }
     
     public static void reemplazarDigito(){
        String d;
        String c;
        String u;
        for (int i = 0; i < 10; i++) {
            c = "" + i;
            for (int j = 0; j < 10; j++) {
                d = "" + j;
                for (int k = 0; k < 10; k++) {
                    u = "" + k;
                    if (c.equals("3")) {
                        c="E";
                    }if(d.equals("3")){
                        d="E";
                    }if(u.equals("3")){
                        u="E";
                    }
                    System.out.println(c+"-"+d+"-"+u);
                }
                
            }

        }
    }
}

