/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nowy;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author student
 */
public class Parking implements ParkingInterface{

    /**
     * @param args the command line arguments
     */
     
     ArrayList<NazwaKierowcy>  kierowcy;
     ArrayList <Samochod>  samochod;

    public Parking() {
        
        samochod=new ArrayList<>();
        kierowcy=new ArrayList<>();
        
        
        addCar();
        addDriver();
        wyswietl();
//         for(int i=0;i<4;i++){
//            samochod[i]=new Samochod();
//            samochod[i].id=i;
//        }
//         
//        kierowcy=new NazwaKierowcy[4];
//        samochod=new Samochod[4];
//        for(int i=0;i<4;i++){
//            kierowcy[i]=new NazwaKierowcy();
//            kierowcy[i].id=i;
//        }
        
       
        
        
        
        
        
    }
     
    public static void main(String[] args) {
       new Parking();
    
        
    }

    @Override
    public void addDriver() {
       kierowcy.add(new NazwaKierowcy("Łukasz","Wojewódzki",(byte)25,1,samochod.get(0)));
       kierowcy.add(new NazwaKierowcy("Monika","Sienkiewicz",(byte)55,1,samochod.get(1)));
       kierowcy.add(new NazwaKierowcy("Stefan","Żeromski",(byte)19,1,samochod.get(2)));
       kierowcy.add(new NazwaKierowcy("Ania","Bliska",(byte)56,1,samochod.get(3)));
       
       kierowcy.get(3).addCar(samochod.get(4));
    }

    @Override
    public void addCar() {
        samochod.add(new Samochod(2000,"NPG34593","Audi A1",(short)1993));
        samochod.add(new Samochod(4000,"HPj11523","Audi A4",(short)2000));
        samochod.add(new Samochod(1000,"OHJ34511","Opel Astra",(short)2010));
        samochod.add(new Samochod(2000,"SPE34123","BMW M3",(short)2014));
        samochod.add(new Samochod(2000,"SPE34123","Suzuki Swift",(short)2004));
    }

    @Override
    public void wyswietl() {
        Iterator it=kierowcy.listIterator();
        
        while(it.hasNext())
            System.out.print(it.next());
    }
    
    
    
    
}
