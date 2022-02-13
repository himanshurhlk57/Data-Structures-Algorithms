import java.util.*;
import java.lang.*;
import java.io.*;

//Using seperate chaining
/* Internally our map will maintian an array. Every element of the array is actually a linked list i.e Array of nodes and every node here has two things one is key and one is value.
 * for that we can make a generic array list of nodes key, value 
 * In arraylist when we create arraylist we dont have index if you insert anything that inserted at 0th index but we need to insert at particular index only i.e the index should be their
 * so initially will maintian an arraylist of size 20 and put null
 * if any key comes after passing through hashfunction whaterver index will get will go that index in arraylist and create a linked list there */

class MapNode<K,V>{
	K key;
	V value;
	MapNode<K,V> next;
	
	public MapNode(K key, V value){
		this.key = key;
		this.value = value;
	}
}

//ArrayList of MapNodes in the arraylist index the reference of head will be stored by default it will be null.
// Mainting linked list at each index. Mainting an arraylist of map nodes of K,V types name buckets;
// Mainting an arraylist of 20 entries initially in which every entry is null.
class Map<K,V>{
	
	ArrayList<MapNode<K,V>> buckets;
	int count;
	int numOfBuckets;
	
	public Map(){
		buckets = new ArrayList<>();
		numOfBuckets = 20;
		for(int i = 0; i<numOfBuckets; i++){
			buckets.add(null);
		}
	}
	
	//Provide a key and get the corresponding index in buckets arraylist;
	// Get the hascode and then compression part
	// will use the internal function .hashcode()(present in object class) to get hashcode of any key
	// we can override the hashcode function present in the object class the hashcode present in this class will be called when will we receive key
	
	private int getBucketIndex(K key){
		int hc = key.hashcode();
		int index = hc%numOfBuckets;
		return index;
	}
	
	//Insert function
	//If the key is already present then update its value if it is not present then insert at the head
	public void insert(K key, V value){
		
		int bucketIndex = getBucketIndex(key);
		MapNode<K,V> head = buckets.get(bucketIndex);

		while(head!=null){
			if(head.key.equals(key)){
				head.value = value;
				return;
			}
			head = head.next;
		}
		
		// element is not there,insert at 0th position of linked list.
		head = buckets.get(bucketIndex);
		MapNode<K,V> newNode = new MapNode<>(key,value);
		newNode.next = head;
		buckets.set(bucketIndex,newNode);
		count++;
	}
	
	//Size of the hashmap
	public int size(){
		return count;
	}
	
	//get value for any key
	// for getting a value the key should be there in the hashmap
	//first find out the bucketIndex whaterver linked list is there on that index will travel that linked list and match the key wherever it is present return its value. if not present then return null;
	public V getValue(K key){
		
		int bucketIndex = getBucketIndex(key);
		MapNode<K,V> head = buckets.get(bucketIndex);

		while(head!=null){
			if(head.key.equals(key)){
				return head.value;
			}
			head = head.next;
		}
		return null;
		
	}
	
	//remove key 
	//if you want to remove the key that key should be there
	public V removeKey(K key){
		
		int bucketIndex = getBucketIndex(key);
		MapNode<K,V> head = buckets.get(bucketIndex);
		
		MapNode<K,V> prev = null;
		while(head!=null){
			if(head.key.equals(key)){
				if(prev!=null){
					prev.next = head.next;
				}
			}else{
				buckets.set(bucketIndex, head.next);
			}
			prev = head;
			head = head.next;
		}
		return null;
		
	}
	
	
	
	
} // class map closing braces

class WorkAtTech{
	
	public static void main (String[] args) throws java.lang.Exception{
		
	}
	
}