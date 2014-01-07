import java.util.ArrayList;
public class JumpSpace {
	
	//Jumspace Alpha 0.5 - Started
	
	public static void main(String args[]) {
		double cx = 50;
		double cy = 10;
		double oldcx = 0;
		ArrayList<Integer[]> platforms = new ArrayList<Integer[]>(); // X Length, Y Height, X Position
		Integer[] one = {10, 20, 15};
		platforms.add(one);
		int jump = 0;
		double floor = 3;
		String main = "Quote.png";
		while (true) {
			if (oldcx > cx) {main = "Quote.png";}
			else if (oldcx < cx) {main = "Quote2.png";}
			oldcx = cx;
			StdDraw.clear();
			StdDraw.setXscale(0, 100);
			StdDraw.setYscale(0, 100);
			StdDraw.picture(cx, cy, main, 5, 5);
			StdDraw.square(50, 50, 50);
			for (int i = 0; i< platforms.size(); i++) {
				one = platforms.get(i);
				StdDraw.line(one[2] - (one[0]/2), one[1], one[2] + (one[2]/2), one[1]);
				}
			if (StdDraw.isKeyPressed(65)) {cx--;}
			if (StdDraw.isKeyPressed(68)) {cx++;}
			if ((StdDraw.isKeyPressed(87) || StdDraw.isKeyPressed(32)) && cy == 3 ) {jump = 15;}
			if (jump > 0) {cy = cy + 2; jump--;}
			if (cy > floor) {cy--;}
			if (cx > 97) {cx--;}
			if (cx < 3) {cx++;}
			StdDraw.show(0);
			System.out.println(cy);
			}
	}
}
