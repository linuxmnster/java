import java.util.*;

class HTDemo{
    public static void main(String[] args){
        Enumeration birds; String key;

        Hashtable<String, String> ht = new Hashtable<String, String>();
        ht.put("sparrow", "small bird");
        ht.put("eagle", "large bird");
        ht.put("parrot", "green bird");
        ht.put("crow", "black bird");
        ht.put("pigeon", "white bird");

        birds = ht.keys();
        while(birds.hasMoreElements()){
            key = (String)birds.nextElement();
            System.out.println(key + " : " + ht.get(key));
        }
    }
}

//hasMoreElements();
//birds.nextElement();