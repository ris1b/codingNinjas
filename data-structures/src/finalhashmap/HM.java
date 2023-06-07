package finalhashmap;

import java.util.ArrayList;

public class HM<K, V> {

	ArrayList<Node<K, V>> bucket;		// this is my bucket
	int count;							// count of elements in bucket
	int numBuckets;						// num of buckets

	// constructor
	public HM() {
		bucket = new ArrayList<>();		// initialize bucket of 20 size
		numBuckets = 20;
		count = 0;
		for (int i = 0; i < numBuckets; i++) {
			bucket.add(null);			// add null
		}
	}

	public void insert(K key, V value) {			// insert ask key and a value 
		int bucketIndex = getBucketIndex(key);		// get the bucket index
		Node<K, V> head = bucket.get(bucketIndex);	// go to the head
		while (head != null) {
			if (head.key.equals(key)) {
				// if element is already present, then update it's value
//				Node<K, V> newNode = new Node<K, V>(key, value);
				head.value = value;
				return;
			}
			head = head.next;
		}
		// here, the element is not present
		head = bucket.get(getBucketIndex(key));
		Node<K, V> newNode = new Node<K, V>(key, value);
		newNode.next = head;
		bucket.set(bucketIndex, newNode);
		count++;									// created a new node and inserted
		// rehash if load factor exceeds
		double loadFactor = (1.0 * count) / numBuckets;
		if (loadFactor > 0.7) {
			rehash();
		}
		return;

	}

	private void rehash() {
		ArrayList<Node<K, V>> temp = bucket;		// make a temp list

		bucket = new ArrayList<>();
		for (int i = 0; i < 2 * numBuckets; i++) {
			bucket.add(null);
		}
		count = 0;
		numBuckets *= 2;
		for (int i = 0; i < temp.size(); i++) {
			Node<K, V> head = temp.get(i);
			while (head != null) {
				K key = head.key;
				V value = head.value;
				insert(key, value);
				head = head.next;
			}
		}
	}

	private int getBucketIndex(K key) {
		/* give me a valid index */
		int hc = key.hashCode();

		int index = hc % numBuckets;
		return index;
	}
	

	public V removeKey(K key) {
		Node<K, V> head = bucket.get(getBucketIndex(key));
		Node<K, V> prev = null;
		while (head != null) {
			if  (head.key.equals(key)) {
				if (prev != null) {
					prev.next = head.next;
				} else {
					bucket.set(getBucketIndex(key), head.next);
				}
				count--;
				return head.value;
			}
			prev = head;
			head = head.next;
		}
		return null;
	}

	// getValue
	public V getValue(K key) {
		int bucketIndex = getBucketIndex(key);
		Node<K, V> head = bucket.get(bucketIndex);

		while (head != null) {
			if (head.key.equals(key)) {
				return head.value;
			}

			head = head.next;
		}
		return null;
	}

	public double loadFactor() {
		return (1.0 * count) / numBuckets;
	}

	public int size() {
		return count;
	}

	// loadFactor

	// size
}
