 package tries;

public class TrieUse {
	public static void main(String [] arg) {
		
		Trie t = new Trie();
		t.add("AND");
		t.add("NOTE");
		t.add("RISHABH");
		t.add("RSSSKK");
		

//		System.out.println(t.search("AND"));
		System.out.println(t.search("RISHABH"));
//		System.out.println(t.search("RSSSKK"));
		
//		t.remove("AND");
		t.remove("RISHABH");
//		t.remove("RSSSKK");
		
//		System.out.println(t.search("AND"));
		System.out.println(t.search("RISHABH"));
//		System.out.println(t.search("RSSSKK"));
	
		
		
		
	}

}
