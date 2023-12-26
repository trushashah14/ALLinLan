/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allinlan;

    
    
    import java.lang.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author Admin
 */
public class GetName {
   public static String fn;
    /*public  static void save(String file){
    fn=file;
    }
    public  static String result(){
        System.out.print(fn);
      String filename=  reverse(fn);
        return (filename);
    }*/
   public static String reverse(String image){

// System.out.print(file);
        StringBuilder input1 = new StringBuilder();
        input1.append(image);
 
        
        StringBuilder s=input1.reverse();
        String[] arr;
       arr = s.toString().split("/");
      /*  for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }*/
        String fnm=arr[0];
     //  System.out.println("---"+fnm);
          StringBuilder input2 = new StringBuilder();
          input2.append(fnm);
         StringBuilder s1=input2.reverse();
         //     System.out.println("---"+s1);
         return(s1.toString());
      
       // System.out.println(input1);
    }


}
