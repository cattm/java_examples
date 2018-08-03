
	import java.util.*;

	public class Safe {
	    private List<String> items = new ArrayList<String>();
	    private int capacity;

	    public Safe(int capacity) {
	        this.capacity = capacity;
	    }

	    public int getCapacity() { 
	      return capacity;
	    }

	    public List<String> getItems() {
	      return Collections.unmodifiableList(items); 
	    }

	    
	    public void addItem(String item) {
	        if (this.items.size() < capacity)
	        {
	        	items.add(item);
	        } else {
	            throw new IllegalStateException();
	        }
	        
	    }
	    
	    @Override 
	    public String toString() {
	        return String.format("Safe: {%d}/{%d}", items.size(), capacity);
	    }
	    
	    public static void main(String[] args) {
	        Safe safe = new Safe(2);
	        safe.addItem("item");
	        System.out.println(safe);
	    }
	}

