/**
 * Credit for this library:
 * https://rosettacode.org/wiki/Poker_hand_analyser#Java
 * Content is available under GNU Free Documentation License 1.2
 */
package seanpoker;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util;
import java.util.Arrays;
import java.util.HashMap;

    public class Score {
        public final int weight;
        public final String name;
        public final String[] hand;
		public HashMap<String,String> suitIcons = new HashMap<>();

        public Score(String n, int w, String[] h) {
            weight = w;
            name = n;
            hand = h != null ? h.clone() : h;
        }
 
        @Override
        public String toString() {
            return "Your hand: "+Arrays.toString(hand) + " \nYou Have: " + name;
        }
		
		public String[] getIconString(String[] hand1)
		{
			String[] result = new String[5];
			suitIcons.put("H", "\u2665");
			suitIcons.put("D", "\u2666");
			suitIcons.put("C", "\u2663");
			suitIcons.put("S", "\u2660");
		
			for(String item:hand1)
			{
				String letter = item.substring(1,2);
				System.out.println("letter\n"+letter);
//				result./
//				Util.replace(item.substring(1), suitIcons.get(letter));
			}
			
			return result;

		}
    }
