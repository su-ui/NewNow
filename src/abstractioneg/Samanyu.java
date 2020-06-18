package abstractioneg;

public class Samanyu extends Supriya {
	
	int id4=2;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Samanyu s=new Samanyu();
		s.commute();
		s.learn();
		
		System.out.println(s.id4);
		
		
		System.out.println(s.id);
		System.out.println(s.name);
		

	}
	

	@Override
	public void learn() {
		// TODO Auto-generated method stub
		System.out.println("supriya learns testing");
		
	}

	@Override
	public void commute() {
		// TODO Auto-generated method stub
		System.out.println("supriya travels by bus");
		
	}
	
	
	public void childsam()
	{
		System.out.println("will this execute");
	}
	
	     

}
