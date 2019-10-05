/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esinfTp1;

import java.util.Comparator;

/**
 *class population comparator
 * overwriten comapre function in order to compare by population in ascending order
 * @author tiago
 */
public class populationComp implements Comparator<Country>{

    @Override
    public int compare(Country t, Country t1) {
        if(t.getCtrPopulation() > t1.getCtrPopulation()){
            return 1;
        } else {
            return -1;
        }
    }

   
    
}
