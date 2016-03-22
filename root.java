
public class root {

	public double square(double no)
	{
		return(Math.sqrt(no));	
	}
	
	public double cube(int no)
	{
 		
		return(Math.cbrt(no));		
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		root r = new root();
		
		System.out.println("sqareroot is "+(r.square(4)));
		
		System.out.println("sqareroot is "+(r.cube(64)));
		
		

	}

}
