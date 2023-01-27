package com.foxminded.creatcharcounterapp.formatter;

import java.util.Map;

public class Formatter {

   public String aplly(Map<Character, Integer> result) {

      StringBuilder sb = new StringBuilder();
      result.forEach((letter, amount) -> sb.append(String.format("%s = (%d)\n", letter, amount)));
      return sb.toString();
   }
}
