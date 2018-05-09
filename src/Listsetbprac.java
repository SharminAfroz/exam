
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;



public class Listsetbprac {
    public void getListItems(){
   List   list=new ArrayList();
   list.add("A");
   list.add("B");
   list.add("C");
   list.add("B");
   System.out.println(list);
   getIteratedItems(list);
   getForeach(list);
    }
    public void getIteratedItems(List list){
        Iterator iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    public  void  getForeach(List list){
        for(Object o:list)
            System.out.println(o);
    }
    public ArrayList<Integer>getIntegers(){
    ArrayList<Integer>integers=new ArrayList<>();
    integers.add(1);
    integers.add(2);
    return  integers;

    }
}
