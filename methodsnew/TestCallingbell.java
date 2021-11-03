class TestCallingbell {
 public static void main(String []args){
 
 Callingbell.ring();
 
 boolean res=Callingbell.tones();
  System.out.println(res);
 
 
 Callingbell call=new Callingbell();
 int result = call.battery();
 System.out.println(result);
 
   }

 }
 