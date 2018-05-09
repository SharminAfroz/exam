
import java.util.*;


public class Setlist {
    public void getSetItems(){
        Set set=new TreeSet();
        set.add("E");
        set.add("B");
        set.add("B");
        set.add("I");
        System.out.println(set);
        getIteratedItems(set);
    }

    public void getIteratedItems(Set set){
        Iterator iterator=set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());

        }

    }
    public  void  getForeach(Set set){
        for(Object o:set)
            System.out.println(o);
    }


}
