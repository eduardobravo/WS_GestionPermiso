/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgBLL;

/**
 *
 * @author Ro
 */
public class PRM {
    private int index;
    private String tipo;
    private String valor;

    public int getIndex() {
        return index;
    }
    public String getTipo() {
        return tipo;
    }
    public String getValor() {
        return valor;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    public PRM(int index, String tipo, String valor) {
        this.index = index;
        this.tipo = tipo;
        this.valor = valor;
    }
    

}
