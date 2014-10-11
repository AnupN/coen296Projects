import sun.security.util.Length

object HelloWorld {
	def main(args: Array[String]){
		println("Hello This Is Internet of THings");
		abc("Third Week", "Start of", "Industrial", "Project")
	}
	
	def abc(args: String*){
	  var string = "";
	  for(i <- 0 until args.length ){
	    string += args(i) + " ";
	  }
	  println(string);
	}
}