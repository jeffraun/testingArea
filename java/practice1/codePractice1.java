/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codepractice1;

/**
 *
 * @author Jeff
 */
import java.util.ArrayList;

public class CodePractice1 {

   public void myArrayList(){

       System.out.println("load and show an ArrayList");

       ArrayList<Integer> elements = new ArrayList<>();

       elements.add(10);
       elements.add(20);
       elements.add(30);

       for (int i = 4; 1 < 8; i++){
           elements.add(1*10);
       }

       for (int i = 0; i < elements.size(); i++){
           int value = elements.get(i);
           System.out.println(value);
       }

   }
}





    public static void main(String[] args) {

        myArrayList();
        // TODO code application logic here


    }

}
