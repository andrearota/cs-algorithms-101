package com.andrearota.datastructure;

import java.util.HashMap;
import java.util.Map;

public class LRUCache<T> {

	private class CacheNode<S> {
		String key;
		S value;
		CacheNode<S> next;
		CacheNode<S> prev;
	}

	private CacheNode<T> head;
	private CacheNode<T> tail;
	private Map<String, CacheNode<T>> entryIndex;
	private final int MAX_SIZE;
	private int actualSize;

	public LRUCache(int maxSize) {
		this.MAX_SIZE = maxSize;
		this.entryIndex = new HashMap<String, CacheNode<T>>(maxSize);
		this.head = this.tail = null;
	}

	public void put(String key, T value) {

		CacheNode<T> node = entryIndex.remove(key);

		if (node != null) {
			if (node.prev == null) {
				head = node.next;
				node.next.prev = null;
			} else {
				node.prev.next = node.next;
				node.next.prev = node.prev;
			}
		} else {
			actualSize++;
		}
		CacheNode<T> newNode = new CacheNode<T>();
		newNode.value = value;
		newNode.key = key;

		if (head == null) {
			head = newNode;
			newNode.next = null;
			newNode.prev = null;
		} else {
			tail.next = newNode;
			newNode.prev = tail;

		}

		tail = newNode;
		entryIndex.put(key, newNode);

		if (actualSize > MAX_SIZE) {
			entryIndex.remove(head.key);
			head.next.prev = null;
			head = head.next;
			actualSize--;
		}

	}

	public T get(String key) {

		CacheNode<T> node = entryIndex.get(key);

		if (node != null) {
			return node.value;
		} else {
			return null;
		}

	}

}