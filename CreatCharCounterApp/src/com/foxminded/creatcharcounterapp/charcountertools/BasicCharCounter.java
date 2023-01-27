package com.foxminded.creatcharcounterapp.charcountertools;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

   public class BasicCharCounter implements CharCounter {

      @Override
      public HashMap<Character, Integer> count(String text) {

         LinkedHashMap<Character, Integer> result = new LinkedHashMap<>();
         for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (!result.containsKey(letter)) {
               result.put(letter, 1);
            } else {
               Integer amount = result.get(letter);
               amount++;
               result.put(letter, amount);
            }
         }
         return result;
      }

   }




   


   

 
   

   
   



