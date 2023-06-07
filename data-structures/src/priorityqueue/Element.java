package priorityqueue;

public class Element<T> {
	T value;
	int priority;			/*Each Element has two things
							 * (a) value--> can be string, integer etc
							 * (b) priority--> */
	public Element(T value, int priority) {
		this.value = value;
		this.priority = priority;
	}
							/*When we want to initialize an element
							 * we have to give the vale and priority
							 * of that element*/
	
	/*Note- This element will be stored in an ArrayList*/
}
