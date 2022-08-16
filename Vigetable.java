package stream;

@FunctionalInterface
public interface Vigetable {

	//override method of object class in functional interface
	
	public void vigetable();
	
	public String toString();
	
	public boolean equals(Object obj);
	
	default void add() {
		System.out.println("\n\ninside default method of vegitable interface");
	}
	
}
