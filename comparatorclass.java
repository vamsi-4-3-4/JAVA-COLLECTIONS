import java.util.*;
class mycomparator implements Comparator<String>{
    public int compare(String itema,String itemb){
        return itemb.compareTo(itema);
    }
}

class mycomparatorr implements Comparator<String>{
    public int compare(String itema,String itemb){
        return itema.compareTo(itemb);
    }
}
public class Program
{
    public static void main(String[] args) {
        TreeSet<String> myarrlist=new TreeSet<String>(new mycomparator());
        Set<String> myarrlista=new TreeSet<String>(new mycomparatorr());
        
        Collections.addAll(myarrlist,"zebra","yota","airtel","vivo");
        Collections.addAll(myarrlista,"maven","npm","apache","apt","pkg");
        System.out.println("REVERSE SORTED LIST BY COMPARATOR\n:::"+myarrlist);
        System.out.println("\nSORTED LIST\n::"+myarrlista);
	}
}
