class TestGrains{
 public static void main(String []args){
  
 Grains pappu = new Grains();
 
 pappu.types=8;
 byte graintypes=pappu.types;
 System.out.println(graintypes);

 pappu.name ="greengram";
 String grainname =pappu.name;
 System.out.println(grainname);

 pappu.colour ="green";
 String graincolour=pappu.colour;
 System.out.println(graincolour);

 pappu.protein= 77.8f;
 float grainprotein=pappu.protein;
 System.out.println(grainprotein);

    }

} 