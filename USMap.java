
public class USMap {
	
	public static void main (String[] args) {
		
		/** Set up the canvas size and scale */
		StdDraw.setTitle("USMap");
		StdDraw.setCanvasSize(900, 512);
		StdDraw.setXscale(128.0, 65.0);
		StdDraw.setYscale(22.0, 52.0);
		
		
		FileUtils file = new FileUtils();
		writeFile = file.openToWrite("database.txt");
		readFile = file.openToRead("cities.txt");
		while (readFile.hasNext()){
			writeFile.println(readFile.next());
			e
		}
			
	}
}

