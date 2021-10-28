class Calculator{
  static int calculate(String []args){
  for(int i=0 ; i< args.length ; i++){
  System.out.println(args[i]);
       }
      return 1;
   }
  
  static void calculate ( String []args ,int numbers ){
   System.out.println("calculator is used to calculate numbrs");
  for(int i=0 ; i<args.length ; i++){
  System.out.println(args[i] + "\t" +numbers);
      }
   
}
     static void calculate( String []args, short mah ,int numbers){
       System.out.println("battery capacity");
        for(short i=0 ; i< args.length ; i++){
          System.out.println(args[i] + "\t" +numbers + "\t" +mah);
       }
   }

}
    