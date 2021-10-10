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
abstract class Curso {
    
    private String instNOME;
    private String instEND;
    private int telDDD;
    private int telNUM;
    
    public void setFACU(String NOME) {
        this.instNOME = NOME;
    }
    
    public String getFACU() {
        return instNOME;
    }
    
    public void setONDE(String ONDE) {
        this.instEND = ONDE;
    }
    
    public String getONDE() {
        return instEND;
    }
    public void setDDD(int DDD) {
        this.telDDD = DDD;
    }

    public int getDDD() {
        return telDDD;
    }    
    
    public void setNUM(int TEL) {
        this.telNUM = TEL;
    }
    
    public int getNUM() {
        return telNUM;
    } 
    
    public abstract void ListarDadosDoCurso ();
    
}
