package com.foxminded.creatcharcounterapp;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Map;
import org.junit.jupiter.api.Test;
import com.foxminded.creatcharcounterapp.charcountertools.BasicCharCounter;
import com.foxminded.creatcharcounterapp.charcountertools.CharCounter;
import com.foxminded.creatcharcounterapp.formatter.Formatter;

class CharCounterTest {

   @Test
   void CharCounterAppTest_CheckEquals() {

      String text = "I love my dog";
      CharCounter basic = new BasicCharCounter();
      Formatter formatter = new Formatter();
      Map<Character, Integer> result = basic.count(text);
      String expectation = formatter.aplly(result);

      String acual =

            "I = (1)\n" + 
            "  = (3)\n" + 
            "l = (1)\n" + 
            "o = (2)\n" + 
            "v = (1)\n" + 
            "e = (1)\n" + 
            "m = (1)\n" + 
            "y = (1)\n" + 
            "d = (1)\n" + 
            "g = (1)\n";

      assertEquals(acual, expectation);
   }
   
   @Test
   void CharCounterAppTest_CheckReturnIsNotNull() {

      String text = "I love my dog";
      CharCounter basic = new BasicCharCounter();
      Formatter formatter = new Formatter();
      Map<Character, Integer> result = basic.count(text);
      String expectation = formatter.aplly(result);

      assertNotNull(expectation);
   }

   @Test
   void CharCounterAppTest_CheckReturnIsEmptyPlace() {

      String text = "   ";
      CharCounter basic = new BasicCharCounter();
      Formatter formatter = new Formatter();
      Map<Character, Integer> result = basic.count(text);
      String expectation = formatter.aplly(result);

      assertEquals("  = (3)\n", expectation);

   }
}
