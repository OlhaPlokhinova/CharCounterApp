package com.foxminded.creatcharcounterapp.cachetools;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

interface Cache<K, V> {

   HashMap<Character, Integer> get(String key);

   boolean contains(String key);

   void put(String key, HashMap<Character, Integer> count);




   
   
  


   
   

  
  

  
   
   
   
   
   
   

}
