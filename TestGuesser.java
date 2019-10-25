public class TestGuesser{

	public static void main(String[] args){
	
	new TestGuesser();
	}

	public TestGuesser(){
		Guesser guess1 = new Guesser(5,10);
		System.out.println("Guess1 ok");
		guess1.start();
	}

}
