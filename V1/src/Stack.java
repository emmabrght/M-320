import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Stack implements Iterator{
    private ArrayList<String> elements;
    private int currentIndex;

    public Stack() {
        this.elements = new ArrayList<>();
        this.currentIndex = -1;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < elements.size();
    }

    public String next() {
        if (hasNext()) {
            return elements.get(currentIndex);

        } else {
            throw new IllegalStateException("No next element");
        }

    }

    @Override
    public void remove() {
        if (currentIndex < 0 || currentIndex >= elements.size()) {
            throw new IllegalStateException("No element to remove");
        }
        elements.remove(currentIndex);
        currentIndex--;
    }

    public void push(String element) {
        elements.add(element);
        currentIndex++;
    }

    public String pop() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        String poppedElement = elements.remove(currentIndex);
        currentIndex--;
        return poppedElement;
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public ArrayList<String> getElements() {
        return elements;
    }
}

