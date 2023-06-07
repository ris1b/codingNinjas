package finalhashmap;

import java.util.ArrayList;

public class Map<K, V> {
	ArrayList<MapNode<K, V>> buckets;
	int count;
	int numBuckets;

	public Map() {
		buckets = new ArrayList<>(); // initialized bucket with new arrayLisy
		numBuckets = 20; // Added 20 entries
		for (int i = 0; i < numBuckets; i++) {
			buckets.add(null); // each entry is NULL
		}
	}

	private int getBucketIndex(K key) {
		int hc = key.hashCode();
		int index = hc % numBuckets;
		return index;
	}

	public double loadFactor() {
		return (1.0 * count) / numBuckets;
	}

	public void insert(K key, V value) {
		int bucketIndex = getBucketIndex(key);
		MapNode<K, V> head = buckets.get(bucketIndex);
		// element is already there? just update it's value
		while (head != null) {
			if (head.key.equals(key)) {
				head.value = value;
				return;
			}
			head = head.next;
		}
		// element is not there. insert at 0th position
		head = buckets.get(bucketIndex);
		MapNode<K, V> newNode = new MapNode<>(key, value);
		newNode.next = head;
		buckets.set(bucketIndex, newNode);
		count++;
		double loadFactor = (1.0 * count) / numBuckets;
		if (loadFactor > 0.7) {
			rehash();
		}
	}

	private void rehash() {
		ArrayList<MapNode<K, V>> temp = buckets;
		buckets = new ArrayList<>();
		for (int i = 0; i < 2 * numBuckets; i++) {
			buckets.add(null);
		}
		count = 0;
		numBuckets = numBuckets * 2;
		// now on the old list, we have to go on each element of the LL
		for (int i = 0; i < temp.size(); i++) {
			// each element of this arrayLis is a LL
			// So we first get a head of LL
			MapNode<K, V> head = temp.get(i); // --> this give's head

			// now traverse on the LL
			while (head != null) {
				K key = head.key;
				V value = head.value;
				insert(key, value);
				head = head.next;
			}
			/*
			 * we have an insert function internally we have to provide a key and value to
			 * it so insert() inserts into new ArraayList
			 */
		}
	}

	public int size() {
		return count;
	}

	/*
	 * Function to getValue--> Value type will be V First we need to find the index
	 * For getting the value, that key should be there in the Map So first find the
	 * bucketIndex Once we get the index, whatever LL is there--> we'll traverse on
	 * this LL and match the key wherever it's present and return it's value. If
	 * it's not present in LL --> return NULL
	 */
	public V getValue(K key) {
		int bucketIndex = getBucketIndex(key);
		MapNode<K, V> head = buckets.get(bucketIndex);
		while (head != null) {
			if (head.key.equals(key)) {
				return head.value; // --> when we are able to find the element
			}
			head = head.next;
		}
		return null;
	}

	/*
	 * Function to remove key Here also, we have to find out the index and the head
	 * of LL as well Because to remove the key, the key should be there. And once we
	 * are removing the key we have to remove the value corresponding to it as well
	 * ie. to remove the key "abc",10 --> remove 10 as well
	 */
	public V removeKey(K key) {
		int bucketIndex = getBucketIndex(key);
		MapNode<K, V> head = buckets.get(bucketIndex);
		MapNode<K, V> prev = null;
		while (head != null) {
//			if (head.key.equals(key)) { /*commented on 2023 Feb*/
				if (head.key.equals(key)) {
					if (prev != null) {
						prev = head.next;
					} else {
						buckets.set(bucketIndex, head.next);
					}
					count--;
					return head.value;
				}
				prev = head; // when we are able to find the key
				head = head.next; // prev.next of head should be head.next
//			} /*commented on 2023 Feb*/
//			prev = head; // while traversing, prev becomes previous head /*commented on 2023 Feb*/
//			head = head.next; /*commented on 2023 Feb*/
		}
		// when key not found
		return null;

	}
}
