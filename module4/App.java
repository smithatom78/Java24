package module4;

public class App {
	 public static void main(String[] args) {
	  // Assemble all the pieces of the MVC
	  Model m = new Model("Smitha", "Jacob");
	  View v = new View("MVC with Smith");
	  Controller c = new Controller(m, v);
	  c.initController();
	 }
	}




