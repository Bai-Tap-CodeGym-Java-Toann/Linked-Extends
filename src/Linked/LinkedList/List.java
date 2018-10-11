package Linked.LinkedList;

import Linked.Linked;

public abstract class List implements Linked {

    abstract boolean remove(Object data);

    abstract void add(int index, Object data);

    abstract void addFirst(Object data);

    abstract void addLast(Object data);

    abstract boolean remove(int index);

    abstract void removeFirst();

    abstract void removeLast();

    abstract void clear();

    abstract int size();

    abstract void printList();

    abstract boolean isContain(Object data);

    abstract int indexOf(Object data);

    abstract boolean isRound();

    public static boolean isDual(Object list) {
        if (list.getClass() == DualLinkedList.class ||
                list.getClass() == RoundDualLinkedList.class) {
            return true;
        } else return false;
    }

}
