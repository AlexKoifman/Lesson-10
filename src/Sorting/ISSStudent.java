
package Sorting;

import Searching.*;

public class ISSStudent implements Comparable{

  private String Name, Adress;
  private int Id;
    
   public ISSStudent(String n, String a, int i){
       Name = n;
       Adress = a;
       Id = i;
       
   }
   public int getId(){
       return Id;
   }
    public String toString(){
    String str = "Name: \t" + Name;
    str = "Adress: \t" + Adress;
    str = "Id: \t" + Id;
    return str;
    
}
    public String getName(){
        return Name;
    }
    @Override
    public int compareTo(Object t) {
        String enterName = ((ISSStudent)t).getName();
        return this.Name.compareTo(enterName);
    }
    
}
