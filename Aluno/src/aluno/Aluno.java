/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluno;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Aluno {

    /**
     * @param args the command line arguments
     */

     public static void main(String[] args) {
        float n1,n2,tr;
        int idade,numero;
        String nome;
        char genero;
        float media;  
        Scanner ler = new Scanner(System.in);
       
        System.out.print("Introduza o numero do aluno: ");
        numero=ler.nextInt();
        ler.nextLine();
        System.out.print("Introduza o nome e apelido: ");
        nome=ler.nextLine();
        System.out.print("Introduza o Genero: ");
        genero=ler.next().charAt(0);
        System.out.print("Introduza a Idade: ");
        idade=ler.nextInt();
        System.out.print("Introduza a nota 1: ");
        n1=ler.nextFloat();
        System.out.print("Introduza a nota 2: ");
        n2=ler.nextFloat();
        System.out.print("Introduza a nota do trabalho: ");
        tr=ler.nextFloat();
       
        media = (n1+n2+tr)/3;
        
        System.out.println("Nome: "+nome);
        System.out.println("Genero: "+genero);
        System.out.println("Idade: "+idade);
        System.out.println("Nota 1: "+n1);
        System.out.println("Nota 2: "+n2);
        System.out.println("Nota trab: "+tr);
        System.out.println("Média: "+String.format("%.2f", media));
        System.out.println("Média arredondada: "+Math.round(tr));
    }

    
}
