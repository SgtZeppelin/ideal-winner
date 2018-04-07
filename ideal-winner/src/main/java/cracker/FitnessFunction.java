/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cracker;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Flo
 */
public class FitnessFunction {
    
    private List<String> wordList;
    
    public FitnessFunction(String path){
        wordList = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(path))));
            String line;
            while((line = reader.readLine())!= null){
                wordList.add(line);
            }
        } catch (IOException ex) {
            Logger.getLogger(FitnessFunction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int getFitness(String text){
        int counter = 0;
        for(String word : wordList){
            if(text.contains(word)){
                counter = counter + 1;
            }
        }
        return counter;
    }
}
