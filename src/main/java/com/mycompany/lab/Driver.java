/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab;

/**
 *
 * @author badaransari
 */
public class Driver 
  {
    public static void main(String[] args) throws Exception {
		MyList mal = new MyArrayList();
		mal.add("4");
		mal.add("5");
                mal.add("0");
		mal.add("89");
                System.out.println("The size is "+mal.getSize());
		mal.add("2");
		mal.add("3");
		mal.add("9");
                System.out.println("The size is "+mal.getSize());
                mal.add("7");
		mal.add("6");
		
		mal.add("8");
                System.out.println("The size is "+mal.getSize());


                 mal.add(7, "M");
                System.out.println("The size is "+mal.getSize());
		System.out.println(mal);
	}
}