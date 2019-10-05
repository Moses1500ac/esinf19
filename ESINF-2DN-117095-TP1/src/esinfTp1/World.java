/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esinfTp1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author tiago class world containing a map with countries and their borders
 */
public class World {

    /*
    @param mCountriesFrontiers map with countries as key and their frontiers as a set of countries
     */
    Map<Country, Set<Country>> mCountriesFrontiers;

    World() {

        mCountriesFrontiers = new HashMap<>();

    }

    /**
     * method to read a list of string containing countries and saving them in a
     * set string to country
     *
     * @param lCountries lsit of countries (String)
     * @return a set with all countries
     */
    public Set getCountries(List<String> lCountries) {
        Country keyCtr;

        Country countryNeighbor;
        Set<Country> countries = new TreeSet<>();

        for (String sCountries : lCountries) {
            String[] aux = sCountries.trim().split(",");
            keyCtr = new Country(aux[0], aux[1], Double.parseDouble(aux[2]), aux[3], Double.parseDouble(aux[4]), Double.parseDouble(aux[5]));
            countries.add(keyCtr);

        }
        return countries;
    }

    /**
     * function that reads frontiers and associates them with their country in
     * map
     *
     * @param lFrontiers list of frontiers (string)
     * @param sCountries set of contries (Country)
     */
    public void saveCountriesFrontiers(List<String> lFrontiers, Set<Country> sCountries) {
        Set<Country> frontiers;
        Country neighbor;
        for (Country c : sCountries) {
            frontiers = new TreeSet<>();
            for (String f : lFrontiers) {
                String[] aux = f.trim().split(",");
                if (c.getCtrName().trim().equalsIgnoreCase(aux[0].trim())) {

                    neighbor = findCtrByName(aux[1], sCountries);
                    frontiers.add(neighbor);
                } else if (c.getCtrName().trim().equalsIgnoreCase(aux[1].trim())) {
                    neighbor = findCtrByName(aux[0], sCountries);
                    frontiers.add(neighbor);
                }

            }
            mCountriesFrontiers.put(c, frontiers);

        }

    }

    /**
     * function to find a country in a a set of countries through the country´s
     * name
     *
     * @param ctrName country name (string)
     * @param sCountries set countaining all countries (Country)
     * @return country
     */
    public Country findCtrByName(String ctrName, Set<Country> sCountries) {
        for (Country c : sCountries) {
            if (c.getCtrName().trim().equalsIgnoreCase(ctrName.trim())) {
                return c;

            }
        }
        return null;
    }

    /**
     * function that orders countries from a certain continent by population
     * with population > nPopulation
     *
     * @param continentName requested continent name (String)
     * @param nPopulation requested lower population limit in millions (double)
     * @return set of countries ordered by ascending order of population
     */
    public Set<Country> orderContinentPopulation(String continentName, double nPopulation) {

        Set<Country> orderByPopulation = new TreeSet<>(new populationComp());

        for (Country c : mCountriesFrontiers.keySet()) {
            if (continentName.equals(c.getCtrContinent().trim()) && nPopulation < c.getCtrPopulation()) {
                orderByPopulation.add(c);
            }
        }

        return orderByPopulation;
    }

    /**
     * funtion to print the map wich contains countries and their frontiers
     */
    public void printMap() {
        for (Iterator<Map.Entry<Country, Set<Country>>> it = mCountriesFrontiers.entrySet().iterator(); it.hasNext();) {
            Map.Entry<Country, Set<Country>> entry = it.next();
            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
        }

    }

    /**
     * groups countries from a certain continent by the numnber of frontiers
     * they have
     *
     * @param continentName requested continent name (String)
     * @return a descending ordered by number of fronteirs ( key) map
     */
    public Map groupByFrontiers(String continentName) {

        Map<Integer, Set<Country>> mGrouped = new TreeMap<>(Collections.reverseOrder());
        for (Map.Entry<Country, Set<Country>> entry : mCountriesFrontiers.entrySet()) {
            if (entry.getKey().getCtrContinent().trim().equalsIgnoreCase(continentName)) {
                if (mGrouped.containsKey(entry.getValue().size())) {
                    mGrouped.get(entry.getValue().size()).add(entry.getKey());

                } else {
                    mGrouped.put(entry.getValue().size(), new TreeSet<>());
                    mGrouped.get(entry.getValue().size()).add(entry.getKey());
                }
            }

        }
        return mGrouped;
    }

    /**
     * method to find the shortest path between two countries as long as thei
     * are in the same continent
     *
     * @param origin name of the country to leave/country a (String)
     * @param destination name of the country to get to/ country b (String)
     * @return numebr of frontiers to cross in order to get from country a to b
     */
    public int findPath(String origin, String destination) {
        Country originCtr = findCountry(origin);
        Country destinationCtr = findCountry(destination);

        if (originCtr.equals(destinationCtr)) {
            return 1;

        }
        if (!originCtr.getCtrContinent().equalsIgnoreCase(destinationCtr.getCtrContinent())) {
            return 0;

        }
        int counterFrontiers = 0;
        List<Integer> nFrontiersByPath = new ArrayList<>();

        findRecursive(counterFrontiers, originCtr, destinationCtr, nFrontiersByPath);

        int minFrontiers = nFrontiersByPath.get(0);
        for (int i = 1; i < nFrontiersByPath.size(); i++) {
            if (nFrontiersByPath.get(i) < minFrontiers) {
                minFrontiers = nFrontiersByPath.get(i);
            }

        }

        return minFrontiers;

    }

    /**
     * find a country in a map by name
     *
     * @param ctrName country name to search (STring)
     * @return country found in map
     */
    private Country findCountry(String ctrName) {

        for (Country ctr : mCountriesFrontiers.keySet()) {
            if (ctr.getCtrName().equals(ctrName)) {
                return ctr;
            }
        }
        return null;
    }

    /**
     *recursive function to calculate and save all possible paths to go from country a to b
     * @param counterFrontiers frontier counter where it went trough(int)
     * @param currentCtr curret country (Country)
     * @param destinationCtr country to get to (Country)
     * @param nFrontiersByPath list of the number of frontiers counted in each path (List<integer>)
     * @return frontiers counted
     */
    private int findRecursive(int counterFrontiers, Country currentCtr, Country destinationCtr, List<Integer> nFrontiersByPath) {
        currentCtr.getVisited();
        counterFrontiers++;

        for (int i = 1; i < nFrontiersByPath.size(); i++) {
            if (counterFrontiers > nFrontiersByPath.get(i)) {
                currentCtr.deVisited();
                return counterFrontiers--;

            }

        }
        for (Country ctr : mCountriesFrontiers.get(currentCtr)) {
            if (ctr.equals(destinationCtr)) {
                nFrontiersByPath.add(counterFrontiers);
                currentCtr.deVisited();
                return counterFrontiers--;

            }
        }

        for (Country ctr1 : mCountriesFrontiers.get(currentCtr)) {
            if (ctr1.isNotVisited()) {
                findRecursive(counterFrontiers, ctr1, destinationCtr, nFrontiersByPath);

            }
        }
        currentCtr.deVisited();
        return counterFrontiers--;
    }

}
