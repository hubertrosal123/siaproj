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
public class IAS {

    /**
     * @param args the command line arguments
     */
    
    static String generateKey(String inputKey, String key) {
        int x = inputKey.length();

        for (int i = 0;; i++) {
            if (x == i) {
                i = 0;
            }
            if (key.length() == inputKey.length()) 
            {
                break;
            }
            key += (key.charAt(i));
        }
        return key;
    }
    
    static String v_encrypt(String input, String key) {
        String cipher = "";

        for (int i = 0; i < input.length(); i++) {
            // converting in range 0-25 
            int x = (input.charAt(i) + key.charAt(i)) % 26;

            // convert into alphabets(ASCII) 
            x += 'A';
            cipher += (char) (x);
        }
        return cipher;
    }
    static String v_decrypt(String cipher, String key) {
        String input = "";

        for (int i = 0; i < cipher.length()
                && i < key.length(); i++) {
            // converting in range 0-25 
            int x = (cipher.charAt(i)
                    - key.charAt(i) + 26) % 26;

            // convert into alphabets(ASCII) 
            x += 'A';
            input += (char) (x);
        }
        return input;
    }
    public static void main(String[] args) {
        // TODO code application logic here
     
      form form = new form();
      form.setVisible(true);
    }
    }
    

