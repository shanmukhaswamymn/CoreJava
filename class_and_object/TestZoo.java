class TestZoo{
 public static void main(String []args){
 
 Zoo ani =new Zoo();
 
 ani.name = "mysorezoo";
 String res = ani.name;
 System.out.println(res);

 ani.area = 120;
 int zooarea = ani.area;
 System.out.println("mysore zoo having area of acre");
 System.out.println(zooarea);
 
 ani.entryfee = 50;
 short zooentry = ani.entryfee;
 System.out.println("zoo has entry fee of");
 System.out.println(zooentry);
 
 ani.noofanimals = 120;
 byte animals= ani.noofanimals;
 System.out.println("mysore zoo having no of animals around");
 System.out.println(animals);
 
 
  }


}