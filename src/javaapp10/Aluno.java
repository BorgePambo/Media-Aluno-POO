package javaapp10;


public class Aluno {
    
    private String nome;
    private float nota1;
    private float nota2;

    public Aluno(String nome, float nota1, float nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nome = nome;
    }

    public float getNota1() {
        return nota1;
    }


    public float getNota2() {
        return nota2;
    }

       
    public  float media(){
        float m = (nota1 + nota2) / 2;
        return m;
    }
    
    public String verificar(){
        if(media() >= 7){
            return "Aprovado";
        }
        else{
            return "Reprovado";
        }
    }
    
    @Override
    public String toString(){
        String s = String.format("Nome: %s%n",nome)+
                   String.format("Média: %.1f%n", media())+
                   String.format("Status: %s%n ", verificar());
        
        return s;
                
    }
    
}
