class TestTime{
public static void main(String []args){
	int hours=10;
	byte mins=4;
	byte secs=29;
	String zone="GMT+5.30";
Time.currtime();
Time.currtime(hours,mins,secs);
System.out.println("timezone is "+Time.timezone(zone)); 

}

}