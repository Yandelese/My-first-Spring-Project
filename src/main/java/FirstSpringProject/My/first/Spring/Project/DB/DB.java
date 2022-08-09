package FirstSpringProject.My.first.Spring.Project.DB;


import FirstSpringProject.My.first.Spring.Project.Classes.Items;

import java.util.ArrayList;

public class DB {

 public static ArrayList<Items>itemsArrayList=new ArrayList<Items>();

 static {
     itemsArrayList.add(new Items(1L,"XIOMI","TELEPHONE",150000));
     itemsArrayList.add(new Items(2L,"DELL","NOTEBOOK",140000));
     itemsArrayList.add(new Items(3L,"ASUS","NOTEBOOK",120000));
     itemsArrayList.add(new Items(4L,"I-PHONE","SMARTPHONE",150000));
     itemsArrayList.add(new Items(5L,"ZENFONE","TELEPHONE",170000));
 }

 public static ArrayList<Items>getallitems(){

     return itemsArrayList;
 }

 public static void additems(Items items){
     itemsArrayList.add(items);
 }

}
