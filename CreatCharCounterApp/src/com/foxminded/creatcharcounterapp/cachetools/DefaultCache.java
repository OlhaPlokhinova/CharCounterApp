package com.foxminded.creatcharcounterapp.cachetools;

import java.util.HashMap;
import java.util.Map;

public class DefaultCache implements Cache {

   private final Map<String, Map<Character, Integer>> cache;

   public DefaultCache(Map<String, Map<Character, Integer>> cache) {
       this.cache = cache;
   }

   public DefaultCache() {
       this(new HashMap<>());
   }


   @Override
   public HashMap<Character, Integer> get(String key) {
       return (HashMap<Character, Integer>) cache.get(key);
   }

   @Override
   public boolean contains(String key) {
       return cache.containsKey(key);
   }


   @Override
   public void put(String key, HashMap value) {
    cache.put(key, value);
      
   }
      
   }

