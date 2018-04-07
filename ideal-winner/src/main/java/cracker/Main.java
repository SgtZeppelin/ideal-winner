/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cracker;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gersc
 */
public class Main {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File("C:\\Users\\Flo\\Documents\\NetBeansProjects\\ideal-winner2\\bibel.txt"))));
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }
        } catch (IOException ex) {
            Logger.getLogger(FitnessFunction.class.getName()).log(Level.SEVERE, null, ex);
        }
        RealLetterCounter rlc = new RealLetterCounter();
        String cypertext = builder.toString();
        List<LetterNumberPair> count = rlc.count(cypertext);
        KeyTranslator keyTranslator = new KeyTranslator();
        Filter filter = new Filter();
        count = filter.deleteSpecialCharacters(count);
        Key key = keyTranslator.translate(count);
        FitnessFunction fitnessFunction = new FitnessFunction("C:\\Users\\Flo\\Documents\\NetBeansProjects\\ideal-winner2\\wordlist.txt");
        Decryptor decryptor = new Decryptor();
        System.out.println(decryptor.decrypt(cypertext, key));
        int fitness = fitnessFunction.getFitness(decryptor.decrypt(cypertext, key));

        Mutator mutator = new Mutator();
        Key bestKey = key;
        int counter = 0;
        Random random = new Random();
        while (true) {

            key = mutator.shake(bestKey);
            if (random.nextBoolean()) {
                key = mutator.shake(key);
                if (random.nextBoolean()) {
                    key = mutator.shake(key);
                }
            }

            String decrypt = decryptor.decrypt(cypertext, key);
            int tempFitness = fitnessFunction.getFitness(decrypt);
            counter = counter + 1;
            if (tempFitness > fitness) {
                bestKey = key;
                fitness = tempFitness;
                System.out.println(decrypt);
                System.out.println(fitness);
                System.out.println(counter);

            }
        }

    }

}
