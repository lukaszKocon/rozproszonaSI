/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nowy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
public class NazwaKierowcy extends Kierowca{
    
   
     byte wiek;
    long id;
     ArrayList<Samochod> samochod;//=new ArrayList<>();
     

    public NazwaKierowcy(String imie, String nazwisko, byte wiek, long id, Samochod samochod) {
        
        this.samochod=new ArrayList<>();
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.id = id;
        this.samochod.add(samochod);
    }

    void addCar(Samochod samochod){
        
        this.samochod.add(samochod);
    }
    
    public NazwaKierowcy() {
    }

    @Override
    public String toString() {
        String ciag="";
        
          
        ciag+="Imie właściciela: "+imie+"\n";
        ciag+="Nazwisko właściciela: "+nazwisko+"\n";
        ciag+="Wiek właściciela: "+wiek+"\n";
        
        
        for(int i=0;i<samochod.size();i++)
            ciag+="Model samochodu "+samochod.get(i).model+" \nWaga: "+samochod.get(i).waga+" \nRok: "+samochod.get(i).rocznik+ "\n";
      
       
        ciag+="\n\n";
        
        return ciag;
        
    }

    
  
    
    
}
