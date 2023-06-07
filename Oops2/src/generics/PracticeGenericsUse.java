package generics;

public class PracticeGenericsUse {
	public static void main(String [] args) {
		PracticeGenerics<String> g = new PracticeGenerics<String>("red" , "blue");
		System.out.println(g.getColor());
		
//		PracticeGenerics <String> g1= new PracticeGenerics<> ("try","Generic");
//		System.out.println(g1.getFirst() + " " + g1.getSecond());
//		
//		PracticeGenerics <Integer> gI = new PracticeGenerics <Integer> (100,50);
//		System.out.println(gI.getFirst() + " " + gI.getSecond());
	}

}
