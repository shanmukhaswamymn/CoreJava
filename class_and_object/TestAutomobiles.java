class TestAutomobiles{
 public static void main(String []args){

 Automobiles mobi= new Automobiles();
    
   
    mobi.name = "motorbike";
    String name=mobi.name;
   System.out.println(name);

  mobi.brand = "TVS";
  String vehiclebrand = mobi.brand;
    System.out.println(vehiclebrand);

  mobi.price = 55000;
  int vehicleprice= mobi.price;
   System.out.println(vehicleprice);

  mobi.colour="blackcement";
  String vehiclecolour=mobi.colour;
    System.out.println(vehiclecolour);
 
   }

 }