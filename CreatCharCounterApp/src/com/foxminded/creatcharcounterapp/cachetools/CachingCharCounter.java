package com.foxminded.creatcharcounterapp.cachetools;

import java.util.HashMap;
import java.util.Map;

import com.foxminded.creatcharcounterapp.charcountertools.CharCounter;
import com.foxminded.creatcharcounterapp.charcountertools.CharCounterDecorator;
import com.foxminded.creatcharcounterapp.formatter.Formatter;

public class CachingCharCounter extends CharCounterDecorator {

   
   private final Cache cache ;
 
   public CachingCharCounter(CharCounter charCounter) {
      super(charCounter);
      this.cache = new DefaultCache();
  }

   public CachingCharCounter(CharCounter charCounter, Cache cache) {
       super(charCounter);
       this.cache = cache;
   }

   @Override
   public HashMap<Character, Integer> count(String text) {
       if (cache.contains(text)) {
           return cache.get(text);
       }
       HashMap<Character, Integer> count = (HashMap<Character, Integer>) charCounter.count(text);
       cache.put(text, count);
       return count;
   }


   
   
   
}


