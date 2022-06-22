package c2ejercicio4;

import javax.swing.JOptionPane;

public class C2Ejercicio4 {

    public static void main(String[] args) {
         
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Elije una opcion: \n 1: Empleado base mas comision \n 2: Empleado por comision"));
       
            switch(opcion)
            {
                case 1:
                    InterfazBaseMasComision EmpleadoSueldo = new InterfazBaseMasComision();
                    EmpleadoSueldo.setVisible(true);
                    break;
                case 2: 
                    InterfazPorComision EmpleadoComision = new InterfazPorComision();
                    EmpleadoComision.setVisible(true);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Por favor inserte una opcion valida");
            }
    }
    
}
