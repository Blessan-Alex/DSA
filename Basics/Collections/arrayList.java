import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class arrayList{
    public static void main(String[] args){
    ArrayList<Integer> num =new ArrayList<>();
    num.add(2);
    num.add(4);
    num.add(6);
    num.add(8);
    num.add(1,8);
    System.out.println(num);

    List<Integer> num2 = new ArrayList();
    num2.add(1000);
    System.out.println(num2);

    num2.addAll(num);
    System.out.println(num2);

    System.out.println(num2.get(1));

    num2.remove(5);
    System.out.println(num2);

    num2.remove(Integer.valueOf(1000));
    System.out.println(num2);

    num2.set(2, 780);
    System.out.println(num2);

    System.out.println(num2.contains(6));

    for (int i = 0; i < num2.size(); i++) {
        System.out.println("The elements are : "+num2.get(i));
    }

    for (Integer e : num2) {
        System.out.println("The elements are : "+e);
    }

    Iterator<Integer> it = num2.iterator();
    while (it.hasNext()) {
        System.out.println("Iterator: "+it.next());
    }

    num2.clear();
    System.out.println(num2);

    

    }
}