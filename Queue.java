package Queue;

// Java program for linked-list implementation of queue 

// A linked list (LL) node to store a queue entry 
class QNode { 
	Cars data; 
	QNode next; 

	// constructor to create a new linked list node 
	public QNode(Cars data) 
	{ 
		this.data = data; 
		this.next = null; 
	}

	public void displayNode() {
		System.out.println( data + " ");
	} 
} 

// A class to represent a queue 
// The queue, front stores the front node of LL and rear stores the 
// last node of LL 
class Queue { 
	QNode front, rear; 

	public Queue() 
	{ 
		this.front = this.rear = null; 
	} 

	// Method to add an key to the queue. 
	void enqueue(Cars data) 
	{ 

		// Create a new LL node 
		QNode temp = new QNode(data); 

		// If queue is empty, then new node is front and rear both 
		if (this.rear == null) { 
			this.front = this.rear = temp; 
			return; 
		} 

		// Add the new node at the end of queue and change rear 
		this.rear.next = temp; 
		this.rear = temp; 
	} 

	// Method to remove an key from queue. 
	QNode dequeue() 
	{ 
		// If queue is empty, return NULL. 
		if (this.front == null) 
			return null; 

		// Store previous front and move front one node ahead 
		QNode temp = this.front; 
		this.front = this.front.next; 

		// If front becomes NULL, then change rear also as NULL 
		if (this.front == null) 
			this.rear = null; 
		return temp; 
	} 
	public void displayLinkedList() {
        QNode tempDisplay = front; // start at the beginning of linkedList
        while (tempDisplay != null){ // Executes until we don't find end of list.
               tempDisplay.displayNode();
               tempDisplay = tempDisplay.next; // move to next Node
        } 

	} 
}	
