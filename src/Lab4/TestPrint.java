package Lab4;

import java.util.Scanner;

public class TestPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		QueueArrayBased queue = new QueueArrayBased();
		
		int choice = 0;
		int id = 1;
		
		System.out.println("Welcome to TestPrint please select a number from the list.");
		
		while(choice != 6) {
			
			System.out.println("1. Enqueue a job");
			System.out.println("2. Dequeue a job");
			System.out.println("3. Peek at the job at the fromt of the queue");
			System.out.println("4. Empty the queue");
			System.out.println("5. Display all jobs");
			System.out.println("6. Quit the program");
			
			choice = scanner.nextInt();
			scanner.nextLine();
			
			if(choice == 1) {
				System.out.println("Enter document name: ");
				String name = scanner.nextLine();
				
				System.out.println("Enter number of pages: ");
				int pages = scanner.nextInt();
				
				PrintJob job = new PrintJob(id, name, pages);
				
				try {
					queue.enqueue(job);
					System.out.println(name + " was added to the print queue");
					System.out.println();
					id++;
				}
				
				catch (QueueException e) {
					System.out.println(e.getMessage());
				}
			}
			
			else if (choice == 2) {
				if(!queue.isEmpty()) {
					PrintJob job = (PrintJob) queue.dequeue();
					System.out.println("Printing job: " + job);
				}
				else {
					System.out.println("The queue is empty");
				}
			}
			
			else if (choice == 3) {
				if(!queue.isEmpty()) {
					PrintJob job = (PrintJob) queue.peek();
					System.out.println("Next Job to print: " + job);
				}
				else {
					System.out.println("The queue is empty");
				}
			}
			
			else if (choice == 4) {
				queue.dequeueAll();
				System.out.println("The queue has been emptied");
			}
			
			else if (choice == 5) {
				queue.displayQueue();
			}
			
			else if (choice == 6) {
				System.out.println("Goodbye");
			}
			
			else {
				System.out.println("Invalid choice please try again");
			}
			
		}

	}

}
