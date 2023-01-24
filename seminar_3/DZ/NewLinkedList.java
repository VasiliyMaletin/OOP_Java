import java.util.Iterator;
import java.util.NoSuchElementException;

public class NewLinkedList<E> implements Iterable<E> {

    private int size = 0;
    private Entry<E> first;
    private Entry<E> last;

    @Override
    public Iterator<E> iterator() {
        return new ListIterator();
    }

    private static class Entry<E> {
        E element;
        Entry<E> next;
        Entry<E> prev;

        public Entry(E element ,Entry<E> next, Entry<E> prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

    private class ListIterator implements Iterator<E> {

        private int nextIndex;
        private Entry<E> current;
        private Entry<E> lastReturned;

        ListIterator() {
            current = first;
            nextIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return nextIndex < size;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            lastReturned = current;
            current = current.next;
            nextIndex++;
            return lastReturned.element;
        }
    }

    public String toString() {
        Iterator<E> it = iterator();
        if (! it.hasNext())
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (;;) {
            E e = it.next();
            sb.append(e == this ? "(this Collection)" : e);
            if (! it.hasNext())
                return sb.append(']').toString();
            sb.append(',').append(' ');
        }
    }

    public void add(E item) {
        final Entry<E> currentLast = last;
        final Entry<E> newItem = new Entry<E>(item, null, currentLast);

        last = newItem;

        if (first == null && currentLast == null) {
            first = newItem;
        }
        else {
            currentLast.next = newItem;
        }
        size++;
    }
}
