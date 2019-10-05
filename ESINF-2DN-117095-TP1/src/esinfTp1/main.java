/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esinfTp1;

import com.sun.webkit.dom.KeyboardEventImpl;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 *
 * @author tiago
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        World newWorld = new World();
   
        List<String> listCountry = Files.lines(Paths.get("paises.txt")).collect(Collectors.toList());
        List<String> listFrontiers = Files.lines(Paths.get("fronteiras.txt")).collect(Collectors.toList());
        Set<Country> sCountries = newWorld.getCountries(listCountry);
        newWorld.saveCountriesFrontiers(listFrontiers, sCountries);

        System.out.println("FICHEIROS CARREGADOS MAPA CRIADO");
        System.out.println("===================================");
        newWorld.printMap();

        System.out.println("\n\nlista de países do continente europa com mais de 50 milhões de habitantes");
        System.out.println("=======================================================================");
        
        Set<Country> list;
        list = newWorld.orderContinentPopulation("europa", 50);
        System.out.println(list);

        
        System.out.println("\n\nPAISES DA EUROPA AGRUPADOS POR NUMERO DE FRONTEIRAS ORDEM DECRESCENTE");
        System.out.println("=====================================================================");
        
        
        Map<Integer, Set<Country>> mGrouped = newWorld.groupByFrontiers("europa");
        for (Iterator<Map.Entry<Integer, Set<Country>>> it = mGrouped.entrySet().iterator(); it.hasNext();) {
            Map.Entry<Integer, Set<Country>> entry = it.next();
            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
        }
        System.out.println("\n\nMINIMO NUMERO DE FRONTEIRAS A ATRAVESSAR DE PORTUGAL A russia");
        System.out.println("==================================================================");
      
        switch (newWorld.findPath("portugal", "russia")) {
            case 0:
                System.out.println("\npaises não se encontram no mesmo continente");
                break;
            case 1:
                System.out.println("\nMesmo pais");
                break;
            default:
                System.out.println("numero fronteiras a atravessar :" + newWorld.findPath("portugal","russia"));
                break;
        }
    }

}
