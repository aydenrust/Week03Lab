/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author 795347
 */
public class Note implements Serializable {
    
   public String title;
   public String contents;
   
   public Note(String title, String contents){
       this.title = title;
       this.contents = contents;
   }
   
   public void setTitle(String title){
       this.title = title;
   }
   
   public void setContents(String contents){
       this.contents = contents;
   }
   
   public String getTitle(){
       return this.title;
   }
   
   public String getContents(){
       return this.contents;
   }
   
}
