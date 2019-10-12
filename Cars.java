package Queue;

class Cars{ 
    private String name;
    private int ID;
	public Cars(String name, int iD) {
		super();
		this.name = name;
		this.ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	@Override
	public String toString() {
		return "Cars [name=" + name + ", ID=" + ID + "]";
	}
	
} 
