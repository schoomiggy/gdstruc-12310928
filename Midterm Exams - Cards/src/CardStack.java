import java.util.EmptyStackException;

public class CardStack {
    private Card[] cardArray;
    private int top;

    public CardStack(int capacity) {
        cardArray = new Card[capacity];
        top = -1;
    }

    public void push(Card card) {
        // stack is full
        if (top == cardArray.length - 1) {
            Card[] largerCardArray = new Card[cardArray.length * 2];
            System.arraycopy(cardArray, 0, largerCardArray, 0, cardArray.length);
            cardArray = largerCardArray;
        }

        cardArray[++top] = card;
    }

    public Card pop() {
        // stack is empty
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return cardArray[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public void printStack() {
        for (int i = top; i >= 0; i--) {
            System.out.println(cardArray[i]);
        }
    }
}
