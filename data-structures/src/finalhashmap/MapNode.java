package finalhashmap;

public class MapNode<K, V> {

	K key;
	V value;
	MapNode<K, V> next;

	public MapNode(K key, V value) {
		this.key = key;
		this.value = value;
	}

	/*
	 * When we want to make a MapNode we have to provide the Key and the Value
	 */
}
