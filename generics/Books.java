package generics;

public class Books<K, V, I> extends Dictionary<K, V> {
	private I infor;
	
	 public Books(K key, V value) {
	        super(key, value);
	    }
	
	public Books(K key, V value, I infor) {
		super(key, value);
		this.infor = infor;
	}
	
	public I getInfor() { 
		return infor;
	}
	
	public void setInfor(I infor) {
		this.infor = infor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Books<String, String, Integer> l = new Books<String, String, Integer>("Study", "hoc", 123);
		String english = l.getKey();
        String vietnamese = l.getValue();
        int quanity = l.getInfor();
        System.out.println(english + ": " + vietnamese + "\nQuantity: " + quanity);
	}
	
}
