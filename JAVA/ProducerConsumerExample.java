import java.util.LinkedList;
import java.util.Queue;

class SharedQueue {
    private Queue<Integer> queue = new LinkedList<>();
    private int capacity; // Maximum queue size

    public SharedQueue(int capacity) {
        this.capacity = capacity;
    }

    // Producer method to add items to the queue
    public synchronized void produce(int value) {
        while (queue.size() == capacity) { // Wait if queue is full
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        queue.add(value);
        System.out.println("Produced: " + value);
        notify(); // Notify consumer
    }

    // Consumer method to remove items from the queue
    public synchronized int consume() {
        while (queue.isEmpty()) { // Wait if queue is empty
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int item = queue.poll();
        System.out.println("Consumed: " + item);
        notify(); // Notify producer
        return item;
    }
}

// Producer Thread
class Producer extends Thread {
    private SharedQueue queue;

    public Producer(SharedQueue queue) {
        this.queue = queue;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            queue.produce(i);
            try {
                Thread.sleep(500); // Simulating some delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Consumer Thread
class Consumer extends Thread {
    private SharedQueue queue;

    public Consumer(SharedQueue queue) {
        this.queue = queue;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            queue.consume();
            try {
                Thread.sleep(1000); // Simulating some delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Main Class
public class ProducerConsumerExample {
    public static void main(String[] args) {
        SharedQueue queue = new SharedQueue(3); // Queue with a capacity of 3
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        producer.start();
        consumer.start();
    }
}
