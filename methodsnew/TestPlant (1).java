class TestPlant{
 public static void main(String []args){

 Plant.grow();
 
 String res=Plant.name();
   System.out.println(res);
 
 Plant hei= new Plant();
 float result=hei.height();
  System.out.println(result);
 
 Plant branch=new Plant();
 byte slt=branch.noofbranches();
  System.out.println(slt);
 
    }
 
 }