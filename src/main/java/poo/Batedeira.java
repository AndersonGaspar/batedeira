package poo;

import java.util.Scanner;

public class Batedeira {


    private String estadoColher = "Batedor";


    public void alterarCoelher(){
        System.out.println("A colher no momente é " + getEstadoCoelher());
        System.out.println("Você deseja alterar?");
        Scanner teclado = new Scanner(System.in);
        String aux = teclado.next();
        //System.out.println(aux);
        if (aux.equals("sim")){
            //System.out.println("alterar");
            System.out.println("Para qual colher você deseja?");
            System.out.println("Batedor, Raquete ou Gancho");
            String colher = teclado.next();
            if (colher.equals("Batedor") || colher.equals("Raquete") || colher.equals("Gancho")){
                setEstadoCoelher(colher);
                System.out.println("Colher alterada para " + getEstadoCoelher() + " com sucesso!");
            } else {
                System.out.println("Colher não identificada!");
            }

        }else {
            System.out.println("Colher " + getEstadoCoelher() + " não alterada");
        }

    }

    public String getEstadoCoelher() {
        return estadoColher;
    }

    public void setEstadoCoelher(String estadoCoelher) {
        this.estadoColher = estadoCoelher;
    }
}
