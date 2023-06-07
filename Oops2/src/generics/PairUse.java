package generics;

import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

public class PairUse {
	public static void main(String [] args) {
		/*Creating Pair of Pairs-LEC name= Chained Generic Pairs*/
//		Pair <String, Integer> pInner = new Pair<>();
//		Pair <Pair<String,Integer> , String> pPairs = new Pair <>();
//		pPairs.setFirst(pInner);
//		
//		System.out.println(pPairs.getFirst());
//		System.out.println(pPairs.getFirst().getFirst());
//		System.out.println(pPairs.getFirst().getSecond());
//		pInner.setFirst("lama");
//		pInner.setSecond(100);
//		System.out.println(pPairs.getFirst().getFirst());
//		System.out.println(pPairs.getFirst().getSecond());
		
//idea is to have a pair which have two pair inside
		Pair <Pair<String,Integer>, Pair<Integer,String>> pipi = new Pair <>();
		Pair <String,Integer> p1 = new Pair<>("one",11);
		Pair <Integer, String> p2 = new Pair<>(22, "two");
		pipi.setFirst(p1);
		pipi.setSecond(p2);
		System.out.println(pipi.getFirst().getFirst());//one
		System.out.println(pipi.getFirst().getSecond()); //11
		System.out.println(pipi.getSecond().getFirst()); //22
		System.out.println(pipi.getSecond().getSecond()); //two
//		pPairs.setSecond("abcd");
//		System.out.println(pPairs.getSecond());
		
		
		/*Classes with multiple generic types lecture*/
//		Pair<String , Integer> pSI = new Pair<String, Integer> ("abc" , 100);
//		System.out.println(pSI.getFirst() + " " +  pSI.getSecond());
//		pSI.setFirst("aaa");
//		pSI.setSecond(999);
//		System.out.println(pSI.getFirst() + " " +  pSI.getSecond());
//		Pair<String> p = new Pair<>();
//		p.setFirst("abc"); //-->WE ARE MAKING p point to a string called "abc"
//		System.out.println(p.getFirst() + " " + p.getSecond());
//		/*Creating Objects of Generic*/
//		Pair<String> pS = new Pair<String>("aa" , "bb");
//		System.out.println(pS.getFirst() + " " + pS.getSecond());
//		
////		Pair<int> pI = new Pair<int> (10,29);
//		
//		Pair<Integer> pI = new Pair<Integer>(10, 20);
//		System.out.println(pI.getFirst() + " " + pI.getSecond());
//		
//		Pair<Double> pD = new Pair<Double>(10.1, 20.3);
//		System.out.println(pD.getFirst() + " " + pD.getSecond());
//		
//		/*Introduction to Generic*/
////		Pair p = new Pair(10,20);
////		System.out.println(p.getFirst() + " " + p.getSecond());
//		
////		PairString pS = new PairString("String1" , "String2"); 	//pair of two Strings
////		PairDouble pD = new PairDouble(3.1, 7.2);	//pair of two double
//		/*now to get two string and two doubles,
//		 * we would be creating PairString class and a PairDouble class
//		 * But we realize that syntactically or structurally they both are same
//		 * to Pair class that we have for integers
//		 * Here, we can use Generics. If a class is only differing with the type of variables
//		 * then we don't have to create multiple classes for multiple types..
//		 * --> We can us Generic instead
//		 * */
//		
	}
	
}
