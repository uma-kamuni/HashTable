package com.bridgelabz;

public interface INode <K extends Comparable> {
	K getKey();
	void setkey(K key);
	
	INode<K> getNext();

	void setNext(INode<K> tempNode);
}
