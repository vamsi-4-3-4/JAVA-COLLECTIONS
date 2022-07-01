import java.util.*;
public class Program
{
    public static void main(String[] args) {
	//*******************
    //||| 1.addAll() ||||
    //-------------------
    
    List<String> mylist=new ArrayList<String>();
    System.out.println("\nADDALL METHOD IN COLLECTIONS CLASS\n");
    Collections.addAll(mylist,"Apache Nutch","Apache Accumulo","Apache ActiveMQ");
    System.out.println(mylist);

    //*********************
    //||| 2.asLifoQueue() ||
    //---------------------
    //as lastin first out Queue
    Deque<String> mydeque=new ArrayDeque<String>();
    System.out.println("\nASLIFOQUEUE METHOD");
    Collections.addAll(mydeque,"beego","agtel","Axis");
    System.out.println(mydeque);
    Queue<String> myqueue=Collections.asLifoQueue(mydeque);
    myqueue.add("expressjs");
    myqueue.add("passportjs");
    myqueue.add("reduxjs");
    System.out.println(myqueue);

    //*********************
    //||| 3.binarySearch()||
    //----------------------
    System.out.println("\nBINARY SEARCH METHOD");
    //returns the index of the provided element in the List
    //returns the -1 if the provided element is not present in the List
    int result=Collections.binarySearch(mylist,"Apache ActiveMQ");
    System.out.println("index of Apache ActiveMQ:"+result);
    int resulta=Collections.binarySearch(mylist,"golang");
    System.out.println("index of he go lang:"+resulta);

    //***************************
    //|| 4.checkedCollection() ||
    //---------------------------
    //this method returns dynamically typesafe view for the specified Collection
    System.out.println("\nCHECKED COLLECTION METHOD");
    List<String> mycheckedcollection=new ArrayList<String>();
    Collections.addAll(mycheckedcollection,"hadoop","hbase","hive","rabbitmq","kakfa","play");
    System.out.println(mycheckedcollection);
    Collection<String> mynewcollection=Collections.checkedCollection(mycheckedcollection,String.class);
    System.out.println("checkedcollection\n:::"+mynewcollection);
    mycheckedcollection.add("ruby");
    System.out.println(mycheckedcollection);
    //***************
    //|| 5.fill() ||
    //--------------
    System.out.println("\nFILL METHOD");
    ArrayList<String> myarrlist=new ArrayList<String>();
    Collections.addAll(myarrlist,"java","is","javascript");
    System.out.println("BEFORE FILL:\n:::"+myarrlist);
    Collections.fill(myarrlist,"GOLANG");
    System.out.println("AFTER FILL:\n:::"+myarrlist);

    //*******************
    //|| 6.frequency() ||
    //-------------------
    System.out.println("MY ARRAYLIST\n"+myarrlist+"\nFREQUNECY OF GOLANG:\n:::"+Collections.frequency(myarrlist,"GOLANG"));
    //******************
    //||| 7.sort()   |||
    //------------------
    List<String> sortinglist=new ArrayList<String>();
    Collections.addAll(sortinglist,"golang","ruby","python","java","javascript","kotlin","swift","dart","scala","erlang");
    System.out.println("\nMY LIST BEOFRE SORTING\n::"+sortinglist);
    Collections.sort(sortinglist);
    System.out.println("MY LISF AFTER SORTING\n::"+sortinglist);
    //*****************
    //||| 8.reverse() ||
    //-----------------
    System.out.println("\nMY LIST BEFORE REVERSEING\n:"+sortinglist);
    Collections.reverse(sortinglist);
    System.out.println("\nMY LIST AFTER REVERSEING\n:"+sortinglist);
    
    //**********************
    //|| 9.reverseOrder() ||
    //----------------------
    List<String> myrevorder=new ArrayList<String>();
    Collections.addAll(myrevorder,"md5","crypt12","crypt14","rsa","sha","blowfish","twofish");
    System.out.println("MY ARRAY LIST\n::"+myrevorder);
    Comparator<String> mycomparator=Collections.reverseOrder();
    Collections.sort(myrevorder,mycomparator);
    System.out.println("REVERSEORDER OUTPUT\n:::"+myrevorder);
    //***********************
    //||    10.rotate()   |||
    //-----------------------
    System.out.println("\nROTATE METHOD");
    System.out.println("MYLIST BEFORE ROTATION\n:::"+myrevorder);
    Collections.rotate(myrevorder,5);
    System.out.println("MY LIST AFTER ROTATION\n:::"+myrevorder);
    Collections.rotate(myrevorder,3);
    System.out.println("MY LIST AFTER ROTATION\n:::"+myrevorder);
    Collections.rotate(myrevorder,1);
    System.out.println("MY LIST AFTER ROTATION\n:::"+myrevorder);
    Collections.rotate(myrevorder,2);
    System.out.println("MY LIST AFTER ROTATION\n:::"+myrevorder);
    //********************
    //||| 11.shuffle() |||
    //--------------------
    //Randomly roeders the List 
    System.out.println("\nMY LIST BEFORE SHUFFLE\n:::"+myrevorder);
    Collections.shuffle(myrevorder);
    System.out.println("MY LIST AFTER SHUFFLE\n:::"+myrevorder);
    Collections.shuffle(myrevorder,new Random(1));
    System.out.println("MY LIST AFTER SHUFFLE\n:::"+myrevorder);
    Collections.shuffle(myrevorder,new Random(2));
    System.out.println("MY LIST AFTER SHUFFLE\n:::"+myrevorder);
    Collections.shuffle(myrevorder,new Random(3));
    System.out.println("MY LIST AFTER SHUFFLE\n:::"+myrevorder);
    Collections.shuffle(myrevorder,new Random(4));
    System.out.println("MY LIST AFTER SHUFFLE\n:::"+myrevorder);
    Collections.shuffle(myrevorder,new Random(5));
    System.out.println("MY LIST AFTER SHUFFLE\n:::"+myrevorder);

    //**************
    //|| 12.swap()||
    //--------------
    System.out.println("\nMY ARRAY LIST BEFORE SWAPING\n:::"+myrevorder);
    Collections.swap(myrevorder,1,2);
    System.out.println("MY ARRAY LIST AFTER SWAP\n:::"+myrevorder);
    Collections.swap(myrevorder,1,3);
    System.out.println("MY ARRAY LIST AFTER SWAP\n:::"+myrevorder);
    Collections.swap(myrevorder,2,1);
    System.out.println("MY ARRAY LIST AFTER SWAP\n:::"+myrevorder);
    Collections.swap(myrevorder,2,3);
    System.out.println("MY ARRAY LIST AFTER SWAP\n:::"+myrevorder);
    Collections.swap(myrevorder,5,3);
    System.out.println("MY ARRAY LIST AFTER SWAP\n:::"+myrevorder);
    Collections.swap(myrevorder,4,2);
    System.out.println("MY ARRAY LIST AFTER SWAP\n:::"+myrevorder);


	}
}
