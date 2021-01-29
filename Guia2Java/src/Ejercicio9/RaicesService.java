

package Ejercicio9;


public class RaicesService {
Raices raices=new Raices();
double Discriminante;
boolean tieneRaices,tieneRaiz;

public double getDiscrimiante(Raices raices){
    Discriminante = (Math.pow(raices.b, 2))-(4*raices.a*raices.c); 
    return Discriminante;
}
public boolean tieneRaices(){
    if (Discriminante>=0) {
       return tieneRaices=true;
        
    }else return tieneRaices=false;
    
    
}

public boolean tieneRaiz(){
    tieneRaiz=(Discriminante==0);
    return tieneRaiz;
}
public void obtenerRaices(Raices raices){
    if (tieneRaiz==true) {
        ///(-b± ((b^2)-(4*a*c)))/(2*a)
        System.out.println(-raices.b+((Math.pow(raices.b, 2))-(4*raices.a*raices.c))/(2*raices.a));
        System.out.println(-raices.b-((Math.pow(raices.b, 2))-(4*raices.a*raices.c))/(2*raices.a));
    }
}
public void obtenerRaiz(Raices raices){
    if (tieneRaiz==true) {
        System.out.println(-raices.b+((Math.pow(raices.b, 2))-(4*raices.a*raices.c))/(2*raices.a));
    }
}
public void calcular(Raices raices){
   obtenerRaiz(raices); 
}

}   