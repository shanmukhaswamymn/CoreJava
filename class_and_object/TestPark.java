class TestPark {
 public static void main(String []args){

 Park vana = new Park();
 vana.name = "cubbonpark";
  System.out.println ("Name of the park is");
 String parkname = vana.name;
 System.out.println (parkname);
 
 vana.area = 10;
  System.out.println ("area of cubbonpark in kilometer");
  int parkarea = vana.area;
   System.out.println (parkarea);

  vana.nooftrees = 80;
  System.out.println ("no of trees in cubbon park are"); 
  short trees = vana.nooftrees ;
   System.out.println (trees);
         
      }

} 