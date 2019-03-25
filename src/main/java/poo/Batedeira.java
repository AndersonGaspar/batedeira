package poo;

import java.util.Scanner;

public class Batedeira {


    private String estadoColher = "Batedor";
    private int estadoVelocidade = 0;




    public void alterarVelocidade(){
        System.out.println("No momento a velocidade atual é " + getEstadoVelocidade());
        System.out.println("Para qual velocidade você deseja alterar: 0, 1, 2 ou 3?");
        Scanner teclado = new Scanner(System.in);
        int aux = teclado.nextInt();
        if ((aux==0)||(aux==1)||(aux==2)||(aux==3)){
            setEstadoVelocidade(aux);
            System.out.println("Velocidade alterada para " + getEstadoVelocidade() + " com sucesso!");
        }else{
            System.out.println("Velocidade não identificada");
        }

    }

    public int getEstadoVelocidade() {
        return estadoVelocidade;
    }

    public void setEstadoVelocidade(int estadoVelocidade) {
        this.estadoVelocidade = estadoVelocidade;
    }

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
