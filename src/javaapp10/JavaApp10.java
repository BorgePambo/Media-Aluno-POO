package javaapp10;

import java.util.Scanner;

public class JavaApp10 {

  
    public static void main(String[] args) {
      
        try{
            Scanner sc = new Scanner(System.in);

            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Digite nota do Av1 : ");
            float nota1 = sc.nextFloat();
            System.out.print("Digite nota do Av2: ");
            float nota2 = sc.nextFloat();

            Aluno aluno = new Aluno(nome, nota1, nota2);

            System.out.println("=========================");
            System.out.println(aluno.toString());
        }
        catch(java.util.InputMismatchException e){
            System.out.println("Entrada Invalída");
        }
    
        
        
    }   
}
