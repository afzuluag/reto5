package utp.misiontic2022.c2.p47.reto4.vista;

import utp.misiontic2022.c2.p47.reto4.controlador.ControladorRequerimientos;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;

public class VistaRequerimientosReto4 {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1(){
        try {
            var requerimiento1 = controlador.consultarRequerimiento1();
            System.out.println("Conocer el id de las compras que si estén pagadas");
            System.out.println("ID_Compra");
                     
            for(Requerimiento_1 Req1 : requerimiento1){
                System.out.printf("%d %n", Req1.getIdCompra());
            }                
                   
            // Su código()
        } catch (Exception e) {
            System.err.println(e);
        }
        
    }

    public static void requerimiento2(){
        try {
            var requerimiento2 = controlador.consultarRequerimiento2();
            System.out.println("Conocer el id de todas las compras cuyo precio por unidad de su material de construcción sea inferior a 1100");
            System.out.println("ID_Compra");
            
            for (Requerimiento_2 Req2 : requerimiento2){
                System.out.printf("%d %n", Req2.getIdCompra());
            }                
                               
            // Su código
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3(){
        try {
            var requerimiento3 = controlador.consultarRequerimiento3();
            System.out.println("Obtener el id de la compra y el año de las compras pagadas parcialmente y en el mes '02'");
            System.out.println("Id_Proyecto fecha");
            
            for (Requerimiento_3 Req3 : requerimiento3){
                System.out.printf("%d %s %n", Req3.getIdCompra(), Req3.getAnoCompra());
            }
                   
            // Su código
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
}