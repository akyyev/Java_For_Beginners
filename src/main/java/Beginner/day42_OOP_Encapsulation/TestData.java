package Beginner.day42_OOP_Encapsulation;

public class TestData {
	
		/*
		 Name
		 ID
		 */
	
		private String Name = "Alice";  // the data is not visible to any other classes
		private int ID = 200;
	
	//getters:	Read the data
		public String getName() {  // read the private data only
			return Name;
		}
		
		public int getID() {
			return ID;
		}
		
	
	// setters:  modify the data
		public void setName(String Name) {
			this.Name = Name;
		}
		
		public void setID(int ID) {
			this.ID = ID;
		}
		
		
		
		
		
		

}
