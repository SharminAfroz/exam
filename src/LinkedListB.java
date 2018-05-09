import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;

public class LinkedListB {
    public void getLinkedItems(){
        LinkedList list=new LinkedList();
        list.add("a");
        list.add("B");
        list.add("C");
        list.add("B");
        System.out.println(list);
        getIteratedItems(list);
    }

    public void getIteratedItems(LinkedList list){
        Iterator iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());

        }

    }
}


