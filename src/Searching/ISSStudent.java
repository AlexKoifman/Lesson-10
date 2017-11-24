
package Searching;
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
    @Override
    public int compareTo(Object t) {
        int otherId = ((ISSStudent)t).getId();
        if (otherId > this.Id) return -1;
        else if (otherId < Id) return 1;
        else return 0;
    }
    
}
