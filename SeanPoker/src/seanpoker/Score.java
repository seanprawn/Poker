/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seanpoker;

import java.util.Arrays;

/**
 *
 * @author sean
 */
    public class Score {
        public final int weight;
        public final String name;
        public final String[] hand;
 
        public Score(String n, int w, String[] h) {
            weight = w;
            name = n;
            hand = h != null ? h.clone() : h;
        }
 
        @Override
        public String toString() {
            return Arrays.toString(hand) + " " + name;
        }
    }
