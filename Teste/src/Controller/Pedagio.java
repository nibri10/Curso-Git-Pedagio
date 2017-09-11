/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Nicolas
 */
public class Pedagio {
    private Veiculo veiculo;
    private String Endereco;
    private String NomeConcessionario;
    private int registro=0;
    private int Cod;
    private float valorpedagio;

    public Pedagio(String Endereco, String NomeConcessionario,float valorpedagio) {
        this.Endereco = Endereco;
        this.NomeConcessionario = NomeConcessionario;
        registro++;
        this.Cod = registro;
        this.valorpedagio = valorpedagio;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getNomeConcessionario() {
        return NomeConcessionario;
    }

    public void setNomeConcessionario(String NomeConcessionario) {
        this.NomeConcessionario = NomeConcessionario;
    }

    public int getCod() {
        return Cod;
    }

    public void setCod(int Cod) {
        this.Cod = Cod;
    }

    public float getValorpedagio() {
        return valorpedagio;
    }

    public void setValorpedagio(float valorpedagio) {
        this.valorpedagio = valorpedagio;
    }
    
    
}
