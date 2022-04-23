package com.mycompany.lab;

/**
 *
 * @author BadarAnsari
 */
interface MyList{
   public void add(Object t) throws Exception;
   public void add(int i, Object t) throws Exception;
   public void remove(Object t) throws Exception;
   public void remove(int i) throws Exception;
   public Object get() throws Exception;
   public Object get(int i) throws Exception;
   public int getSize() throws Exception;
    
}