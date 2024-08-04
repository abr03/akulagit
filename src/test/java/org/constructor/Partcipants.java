package org.constructor;

public class Partcipants {

	 String name;
	    int number;
	    char gender;
	    String show;


	    public Partcipants(){
	        System.out.println("Good morning");

	    }

	    public Partcipants(String name, int number, char gender, String show){
	        this.name=name;
	       this.number=number;
	     this.gender=gender;
	      this.show=show;
	    }

	    public static void main(String[] args) {

	        Partcipants p = new Partcipants();
	        
	        Partcipants p1= new Partcipants("Bhaskar", 130, 'f', "paid");
	        System.out.println(p1.name +"  " +  p1.number + "  "+p1.show);


	    }
}
