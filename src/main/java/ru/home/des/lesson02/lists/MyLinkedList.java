package ru.home.des.lesson02.lists;

import java.util.LinkedList;

public class MyLinkedList<E> {

    private Node<E> firstNode;

    private static class Node<E>{
        E data;
        Node<E> prev;
        Node<E> next;

        public Node(E data, Node<E> prev, Node<E> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    public void put(E item){
        if (firstNode == null){
            firstNode = new Node<E>(item, null, null);
            return;
        }
        Node<E> tmp = firstNode;
        while (tmp.next != null){
            tmp = firstNode.next;
        }
        tmp.next = new Node<E>(item, tmp, null);
    }

    public E findFirst() throws Exception {
        if (firstNode == null){
            throw new Exception("First element is null");
        }
        return firstNode.data;
    }

    public void remove(E item) throws Exception {
        if (firstNode == null){
            throw new Exception("No find element");
        }
        Node<E> tmp = firstNode;
        while (tmp.next != null){
            if (tmp.data == item){
                tmp.prev.next = tmp.next;
                tmp.next.prev = tmp.prev;
                return;
            }
            tmp = firstNode.next;
        }
        throw new Exception("No find element");
    }

    public void removeFirst() throws Exception {
        if (firstNode == null){
            throw new Exception("First element null");
        }
        Node<E> tmp = firstNode.next;
        tmp.prev = null;
        firstNode = tmp;
    }
}
