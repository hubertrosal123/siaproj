/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ias;

/**
 *
 * @author Wendel Rosal
 */
public class Caesar {
    static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    public static String c_encrypt(String input, int key)
    {
       String cipher = "";
       for(int i = 0; i <input.length();i++)
       {
           char a = input.charAt(i);
           int index = alphabet.indexOf(a);
           int newIndex = (index + key)%26;
           char b = alphabet.charAt(newIndex);
           cipher += b;
       }
       return cipher;
    }
    public static String c_decrypt(String cipher, int key)
    {
       String input = "";
       for(int i = 0; i<cipher.length();i++)
       {
           char c = cipher.charAt(i);
           int index = alphabet.indexOf(c);
           int newIndex = (index - key + 26)%26;
           char d = alphabet.charAt(newIndex);
           input += d;
       }
       return input;
    }
    
}
