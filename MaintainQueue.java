import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import javax.swing.JOptionPane;

public class MaintainQueue {
	private Queue<String> customers;

	public MaintainQueue() {
		customers = new LinkedList<String>();
	}

	public static void main(String[] args) {
		MaintainQueue obj = new MaintainQueue();
		obj.processCustomers();
	}

	public void processCustomers() {
		int choiceNum = 0;
		String[] choices = { "add", "peek", "remove", "size", "position",
				"quit" };
		while (choiceNum < choices.length - 1) {
			choiceNum = JOptionPane.showOptionDialog(null,
					"Select an operation on customer queue", "Queue menu",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
			try {
				String name;
				switch (choiceNum) {
				case 0:
					name = JOptionPane
							.showInputDialog("Enter new customer name");
					customers.offer(name);
					JOptionPane.showMessageDialog(null, "Customer " + name
							+ " added to the queue");
					break;
				case 1:
					JOptionPane.showMessageDialog(null,
							"Customer " + customers.element()
									+ " is next in the queue");
					break;
				case 2:
					JOptionPane.showMessageDialog(null,
							"Customer " + customers.remove()
									+ " removed from the queue");
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Size of queue is "
							+ customers.size());
					break;
				case 4:
					name = JOptionPane.showInputDialog("Enter customer name");
					int countAhead = 0;
					for (String nextName : customers) {
						if (!nextName.equals(name)) {
							countAhead++;
						} else {
							JOptionPane.showMessageDialog(null,
									"The number of customers ahead of " + name
											+ " is " + countAhead);
							break;
						}
					}
					if (countAhead == customers.size()) {
						JOptionPane.showMessageDialog(null, name
								+ " is not in queue");
					}
					break;
				case 5:
					JOptionPane.showMessageDialog(null,
							"Leaving customer queue. "
									+ "\nNumber of customers in queue is "
									+ customers.size());
					break;
				default:
					JOptionPane.showMessageDialog(null, "Invalid selection");
					break;
				}
			} catch (NoSuchElementException e) {
				JOptionPane.showMessageDialog(null, "The Queue is empty", "",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
