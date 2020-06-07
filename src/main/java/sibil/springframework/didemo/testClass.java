package sibil.springframework.didemo;

import java.util.ArrayList;

public class testClass {
    public static void main(String[] args){
        ArrayList<String> a =new ArrayList<>();
        a.add("A");
        a.add("B");
        a.add("C");
        System.out.println(a);
        a.set(1,"C");
       //a.get(1).replace(a.get(1),"D");
       System.out.println(a);
    }


}
