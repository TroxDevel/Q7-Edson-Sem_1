/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q7.abstrata;

/**
 *
 * @author kevin
 */
public class ADS extends Curso{
    
    private String cursoNOME;
    private int turmasNUM;
    private int alunosQUANT;
    private float medGERAL;

    @Override
    public void ListarDadosDoCurso() {
        System.out.println(" */ Informações do curso de Análise e Desenvolvimento de Sistemas /*");
        System.out.println("Instituição: "+ this.getFACU());
        System.out.println("Endereço: "+ this.getONDE());
        System.out.println("DDD: "+ "("+ this.getDDD()+")");
        System.out.println("Telefone: "+ this.getNUM());
        System.out.println("Nome do Curso: "+ this.cursoNOME);
        System.out.println("Número de Turmas: "+ this.turmasNUM);
        System.out.println("Quantidade de Alunos: "+ this.alunosQUANT);
        System.out.println("Média Geral: "+ this.medGERAL);
    }
    
}
