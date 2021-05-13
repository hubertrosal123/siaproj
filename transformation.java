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
public class transformation {
    
    public static String t_encrypt(String text, int key){
       String encryptText="";
        char[][] rail = new char[key][text.length()];
        
        for(int i=0; i<key;i++){
            for(int j=0 ; j< text.length(); j++){
                rail[i][j] = '.';
            }
        }
 
        int row = 0;
        int check = 0;
        
       for(int i=0; i<text.length(); i++){
            if(check ==0){
               rail[row][i]= text.charAt(i);
               row++;
               if(row==key){
                   check = 1;
                   row--;
               }
            } else if (check==1){
                   row--;
                   rail[row][i]= text.charAt(i);
                   if(row==0){
                       check =0;
                       row=1;
                   }
               }
            }
            for(int i=0; i<key; i++){
                for(int j=0; j<text.length();j++){
                    encryptText+=rail[i][j];
                    
                }
            }
            encryptText = encryptText.replaceAll("\\.","");
            return encryptText;
    }
    
   public static String t_decrypt(String text, int key){
        String decryptText = "";
        char[][] rail = new char[key][text.length()];
        
        for(int i=0; i<key;i++){
            for(int j=0 ; j< text.length(); j++){
                rail[i][j] = '.';
            }
        }
 
       int row =0;
       int check =0;
        
       for(int i=0; i<text.length(); i++){
            if(check ==0){
               rail[row][i]= text.charAt(i);
               row++;
               if(row==key){
                   check = 1;
                   row--;
               }
            } else if (check==1){
                   row--;
                   rail[row][i]= text.charAt(i);
                   if(row==0){
                       check =0;
                       row=1;
                   }
               }
            }
       
       int order=0;
       for(int i=0;i<key;i++){
           for(int j=0;j<text.length();j++){
               String temp = rail[i][j] + "";
               if(temp.matches("\\.")){
               continue;
               }
            else {
                   rail[i][j]= text.charAt(order);
                   order++;
              }
           }
       }
       
        check =0;
        row=0; 
    
        for(int i=0; i<text.length(); i++){
            if(check==0){
                decryptText +=rail[row][i];
                row++;
                if(row==key){
                    check = 1;
                    row--;
                }
            }else if (check==1){
                row--;
                decryptText +=rail[row][i];
                if(row==0){
                    check = 0;
                    row =1;
                }
            }
        }  
            return decryptText;
        }
}
