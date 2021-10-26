class Result{
	public static void main(String []marks){
		for(int mark=0; mark <marks.length;mark++){
			String cgpa = marks[mark];
			Double per = Double.parseDouble(cgpa);
			int percentage = Integer.parseInt(cgpa);
                        long percent = Long.parseLong(cgpa);
                        short percentag = Short.parseShort(cgpa); 

			System.out.println(cgpa +"\t" + per +"\t" + percentage+"\t"+percent +"\t"+percentag);
		}
	}
}