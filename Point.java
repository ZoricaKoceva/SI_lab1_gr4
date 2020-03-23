class Point {
	String id;
	double x,y;

	//TODO add new variable
	String dotColor;

	//TODO constructor
	public Point(String id, double x, double y, String dotColor) {
		this.id = id;
		this.x = x;
		this.y = y;
		this.dotColor = dotColor;
	}

	//TODO setters and getters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getDotColor() {
		return dotColor;
	}

	public void setDotColor(String dotColor) {
		this.dotColor = dotColor;
	}

	public void move (char xDirection, char yDirection) {
		//TODO
		/*
			Method to move the point one unit:
				-left, right, up, down
		 */

		if(xDirection == 'L'){ // moving the point one unit left
			x-=1;
		}

		if(xDirection == 'R'){ // moving the point one unit right
			x+=1;
		}

		if(yDirection == 'U'){ // moving the point one unit up
			y+=1;
		}

		if(yDirection == 'D'){ // moving the point one unit down
			y-=1;
		}

	}

	public void draw () {
		//TODO
		System.out.println("( " + getX() + ", " + getY() + " )");
	}

}

// public class Point{ //testing the functionality of class Point
// 	public static void main(String[] args) {
// 		Point point = new Point("1", 2.0, 4.0, "magenta");

// 		point.move('L','U');
// 		point.draw();

// 		point.move('R','U');
// 		point.draw();

// 	    System.out.println("This point is colored " + point.getDotColor());
// 	}
// }