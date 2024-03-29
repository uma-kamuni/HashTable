package com.bridgelabz;

public class HashMap<K extends Comparable, V> {
	MyLinkedList<K> linkList;
	
	public HashMap() {
		this.linkList = new MyLinkedList<>();
	}

	public V get(K key) {
		MapNode<K,V> mapNode =(MapNode<K, V>)this.linkList.search(key);
		return (mapNode == null)? null : mapNode.getValue();
	}
	public void add(K key, V value) {
		MapNode<K,V> mapNode =(MapNode<K,V>)this.linkList.search(key);
		if(mapNode == null) {
			mapNode = new MapNode<>(key ,value);
			this.linkList.append(mapNode);
		}
		else {
			mapNode.setValue(value);
		}
	}
	public void remove(K key) {
		 MapNode<K,V> mapNode = (MapNode<K,V>) this.linkList.search(key);
	        if(mapNode != null) {
	            this.linkList.delete(mapNode);
	        }
	    }	
	 public void printHashMap()
	    {
	        linkList.printMyNodes();
	    }
	@Override
	public String toString() {
		return "HashMapNodes{" + linkList + '}';
	}

	
	}
	