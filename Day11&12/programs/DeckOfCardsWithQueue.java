package oop.programs;

import java.util.Random;

class Card{
	
	String suit;
	String rank;
	
	public Card(String suit, String rank) {
		this.suit = suit;
		this.rank = rank;
	}

	@Override
	public String toString() {
		return rank+" of "+suit;
	}	
}

class Node<T>{
	T data;
	Node<T> next;
	
	Node(T data){
		this.data=data;
		this.next=null;
	}
}

class Queue<T> {
	Node<T> front, rear;
	
	Queue(){
		this.front=null;
		this.rear=null;
	}
	
	void enqueue(T data) {
		Node<T> newNode = new Node<>(data);
		
		if(this.rear==null) {
			this.front=this.rear=newNode;
			return;
		}
		this.rear.next = newNode;
		this.rear = newNode;
	}
	T dequeue() {
        if (this.front == null)
            return null;
        Node<T> temp = this.front;
        this.front = this.front.next;
        if (this.front == null)
            this.rear = null;
        return temp.data;
    }

    boolean isEmpty() {
        return front == null;
    }
}
class Player {
    String name;
    Queue<Card> cardQueue;

    Player(String name) {
        this.name = name;
        this.cardQueue = new Queue<>();
    }

    void addCard(Card card) {
        cardQueue.enqueue(card);
    }

    void sortCards() {
        if (cardQueue.isEmpty()) return;

        Node<Card> sorted = null;

        while (!cardQueue.isEmpty()) {
            Card current = cardQueue.dequeue();
            sorted = sortedInsert(sorted, current);
        }

        while (sorted != null) {
            cardQueue.enqueue(sorted.data);
            sorted = sorted.next;
        }
    }

    private Node<Card> sortedInsert(Node<Card> sorted, Card newCard) {
        Node<Card> newNode = new Node<>(newCard);
        if (sorted == null || compareRank(sorted.data.rank, newCard.rank) > 0) {
            newNode.next = sorted;
            return newNode;
        } else {
            Node<Card> current = sorted;
            while (current.next != null && compareRank(current.next.data.rank, newCard.rank) <= 0) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        return sorted;
    }

    private int compareRank(String rank1, String rank2) {
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
        int rank1Index = -1, rank2Index = -1;
        for (int i = 0; i < ranks.length; i++) {
            if (rank1.equals(ranks[i])) rank1Index = i;
            if (rank2.equals(ranks[i])) rank2Index = i;
        }
        return Integer.compare(rank1Index, rank2Index);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(name + "'s cards:\n");
        Node<Card> temp = cardQueue.front;
        while (temp != null) {
            sb.append(temp.data.toString()).append("\n");
            temp = temp.next;
        }
        return sb.toString();
    }
}

public class DeckOfCardsWithQueue {
    static String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
    static String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
    static Card[] deck = new Card[52];

    public static void main(String[] args) {
        initializeDeck();
        shuffleDeck();

        Queue<Player> playerQueue = new Queue<>();
        for (int i = 1; i <= 4; i++) {
            playerQueue.enqueue(new Player("Player " + i));
        }

        distributeCards(playerQueue);
        printPlayers(playerQueue);
    }

    public static void initializeDeck() {
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = new Card(suit, rank);
            }
        }
    }

    public static void shuffleDeck() {
        Random random = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = random.nextInt(deck.length);
            Card temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    public static void distributeCards(Queue<Player> playerQueue) {
        for (int i = 0; i < 36; i++) {
            Player player = playerQueue.dequeue();
            player.addCard(deck[i]);
            playerQueue.enqueue(player);
        }

        for (int i = 0; i < 4; i++) {
            Player player = playerQueue.dequeue();
            player.sortCards();
            playerQueue.enqueue(player);
        }
    }

    public static void printPlayers(Queue<Player> playerQueue) {
        while (!playerQueue.isEmpty()) {
            Player player = playerQueue.dequeue();
            System.out.println(player);
        }
    }
}
