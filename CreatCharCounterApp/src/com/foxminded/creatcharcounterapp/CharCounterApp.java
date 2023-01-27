package com.foxminded.creatcharcounterapp;

import java.util.Map;
import com.foxminded.creatcharcounterapp.cachetools.CachingCharCounter;
import com.foxminded.creatcharcounterapp.cachetools.DefaultCache;
import com.foxminded.creatcharcounterapp.charcountertools.BasicCharCounter;
import com.foxminded.creatcharcounterapp.charcountertools.CharCounter;
import com.foxminded.creatcharcounterapp.charcountertools.CharCounterDecorator;
import com.foxminded.creatcharcounterapp.formatter.Formatter;

public class CharCounterApp {
   public static void main(String[] args) {

      String text = "I love my dog";
      CharCounter basic = new BasicCharCounter();
      Formatter formatter = new Formatter();
      Map<Character, Integer> result = basic.count(text);
      String formatted = formatter.aplly(result);

      System.out.println(text);
      System.out.println(formatted);

   }
}

