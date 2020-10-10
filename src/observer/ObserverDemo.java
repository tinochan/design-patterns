package observer;

public class ObserverDemo {
    public static void main(String[] args) {
        System.out.println("Enter Text: ");
        EventSource eventSource = new EventSource();
        
        eventSource.addObserver(event -> {
            System.out.println("First Observer received response: " + event);
        });

        eventSource.addObserver(event -> {
            System.out.println("Second Observer received response: " + event);
        });
        
        eventSource.scanSystemIn();
    }
}