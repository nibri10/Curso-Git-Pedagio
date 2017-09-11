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
public class Veiculo {
   
   private Pedagio pedagio;
   private String placa;
   private int cat;
   private String hora;
   private String data;
   private int registro=0,cod;
   Veiculo [] auto = new Veiculo[0];

    public Veiculo(String placa, int cat,Pedagio pedagio) {
        registro++;
        this.cod = registro;
        this.placa = placa;
        this.cat = cat;
        
    }
    
    private static int[] arrayDinamico(int vetor[], int elem){
		int temp[] = new int[vetor.length+1];
		for(int i=0 ; i<vetor.length ; i++){
			temp[i] = vetor[i];
		}
		temp[temp.length-1] = elem;
		return temp;
	}

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCat() {
        return cat;
    }

    public void setCat(int cat) {
        this.cat = cat;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
   
   
           
    
}
