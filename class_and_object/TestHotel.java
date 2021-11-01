class TestHotel{
 public static void main(String []args){
 
 Hotel khanawali = new Hotel();
 khanawali.name = "bairaveshwara";
  System.out.println ("name of the hotel is");
  String hotelname= khanawali.name; 
  System.out.println (hotelname);

  khanawali.type="nonvegitarian";
  String hoteltype=khanawali.type;
   System.out.println (hoteltype);

  khanawali.monthlyincome= 55000;
   System.out.println ("monthly income of the hotel is");
    int adaya = khanawali.monthlyincome;
     System.out.println (adaya);

      }

 }