/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nowy;

/**
 *
 * @author student
 */
public class Samochod {
    
      char tabRej[]=new char[8];
      boolean sizeBig;
      int waga;
      long id;
      static int numer;
      int nr;
      String model;
      short rocznik;
      
    public Samochod(int waga, String tab,String nazwa,short rok) {
        
        nr=++numer;
        if(waga<1500)
            sizeBig=false;
        else
            sizeBig=true;
        
        this.model=nazwa;
        this.tabRej=tab.toCharArray();
        this.waga = waga;
        this.id = id;
        this.rocznik = rok;
    }

    

    public Samochod() {
      
    }
      
      
    
}
