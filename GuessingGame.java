public class GuessingGame {

    public static void main(String[] args) {
        
	try{
	Guesser g;
        if (args.length != 0 && args.length<3) {
            g = new Guesser(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        } else {
            g = new Guesser(0, 1000);
        }
	g.start();
	}catch(NumberFormatException nfe){
  System.exit(2);
 }
        

    }

}

