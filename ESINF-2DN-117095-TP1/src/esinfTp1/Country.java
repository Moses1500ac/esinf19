/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esinfTp1;

import java.util.Objects;

/**
 * class Country with constructor and essential functions
 *
 * @author tiago
 */
public class Country implements Comparable<Country>
{
    
    private String ctrName;
    private String ctrContinent;
    private double ctrPopulation;
    private String ctrCapital;
    private double ctrLatitude;
    private double ctrLongitude;
    private boolean visited;
    
    /**
     * Country constructor
     * @param ctrName country´s name
     * @param ctrContinent country´s continent name
     * @param ctrPopulation country´s population in millions
     * @param ctrCapital country´s capital name
     * @param ctrLatitude country´s latitude
     * @param ctrLongitude country´s longitude
     */
    public Country (String ctrName, String ctrContinent, double ctrPopulation, String ctrCapital, double ctrLatitude, double ctrLongitude)
    {
        this.ctrName = ctrName;
        this.ctrContinent = ctrContinent;
        this.ctrPopulation = ctrPopulation;
        this.ctrCapital = ctrCapital;
        this.ctrLatitude = ctrLatitude;
        this.ctrLongitude = ctrLongitude;
        this.visited = false;
    
    }
    
    

    /**
     * @return the ctrName
     */
    public String getCtrName() {
        return ctrName;
    }

    /**
     * @param ctrName the ctrName to set
     */
    public void setCtrName(String ctrName) {
        this.ctrName = ctrName;
    }

    /**
     * @return the ctrContinent
     */
    public String getCtrContinent() {
        return ctrContinent;
    }

    /**
     * @param ctrContinent the ctrContinent to set
     */
    public void setCtrContinent(String ctrContinent) {
        this.ctrContinent = ctrContinent;
    }

    /**
     * @return the ctrPopulation
     */
    public double getCtrPopulation() {
        return ctrPopulation;
    }

    /**
     * @param ctrPopulation the ctrPopulation to set
     */
    public void setCtrPopulation(int ctrPopulation) {
        this.ctrPopulation = ctrPopulation;
    }

    /**
     * @return the ctrCapital
     */
    public String getCtrCapital() {
        return ctrCapital;
    }

    /**
     * @param ctrCapital the ctrCapital to set
     */
    public void setCtrCapital(String ctrCapital) {
        this.ctrCapital = ctrCapital;
    }

    /**
     * @return the ctrLatitude
     */
    public double getCtrLatitude() {
        return ctrLatitude;
    }

    /**
     * @param ctrLatitude the ctrLatitude to set
     */
    public void setCtrLatitude(double ctrLatitude) {
        this.ctrLatitude = ctrLatitude;
    }

    /**
     * @return the ctrLongitude
     */
    public double getCtrLongitude() {
        return ctrLongitude;
    }

    /**
     * @param ctrLongitude the ctrLongitude to set
     */
    public void setCtrLongitude(double ctrLongitude) {
        this.ctrLongitude = ctrLongitude;
    }
    
    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
           Country c = (Country) obj;
           return this.ctrName.equals((c.getCtrName()));
        }
        return false;              
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.ctrName);
        return hash;
    }

    @Override
    public int compareTo(Country t) {
        return this.getCtrName().compareTo(t.getCtrName());
    }

    @Override
    public String toString() {
        return "\nPais = " + ctrName + ", Continente = " + ctrContinent + ", Populacao = " + ctrPopulation ;
    }
    
    void getVisited() {
        this.visited  = true;
    }

    void deVisited() {
       this.visited = false;
    }

    boolean isNotVisited() {
        return !this.visited;
    }

    

   
    
    
    
    
    
    
    
}
