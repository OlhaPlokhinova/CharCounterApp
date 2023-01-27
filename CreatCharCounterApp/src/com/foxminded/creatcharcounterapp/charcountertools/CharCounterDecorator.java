package com.foxminded.creatcharcounterapp.charcountertools;

import java.util.Map;

public abstract class CharCounterDecorator implements CharCounter {
   protected CharCounter charCounter;

   public CharCounterDecorator(CharCounter charCounter) {
       this.charCounter = charCounter;
   }
}

