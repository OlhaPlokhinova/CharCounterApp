package com.foxminded.creatcharcounterapp;

import com.foxminded.creatcharcounterapp.cachetools.CachingCharCounter;
import com.foxminded.creatcharcounterapp.cachetools.DefaultCache;
import com.foxminded.creatcharcounterapp.charcountertools.CharCounter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.HashMap;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CacheCharCounterTest {

   private final HashMap<Character, Integer> output = new HashMap<>() {

      {
         put('t', 2);
         put('e', 1);
         put('x', 1);
      }
   };
   private final String input = "text";
   @Mock
   CharCounter counter;
   @Mock
   DefaultCache cache;
   @InjectMocks
   CachingCharCounter decorator;

   @Test
   void testCountShouldReturnValueFromCacheIfPresent() {
      when(cache.contains(input)).thenReturn(true);
      when(cache.get(input)).thenReturn(output);
      assertEquals(output, decorator.count(input));
      verify(counter, never()).count(anyString()); 
   }

   @Test
   void testCountShouldCalculateAndReturnValueFromCacheIfNotPresent() {
      when(cache.contains(input)).thenReturn(false);
      when(counter.count(input)).thenReturn(output);
      assertEquals(output, decorator.count(input));
      verify(cache).put(input, output); 
   }
}






