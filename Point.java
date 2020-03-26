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

	Point(double x, double y) {
		this.x = x;
		this.y = y;
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

class Canvas extends Point{
	List<Point> pointsList = new ArrayList<Point>();
	int N; // number of points for example, as parametar in method findingNClosestPoints

	public Canvas( List<Point> pointsList, int N, String id, double x, double y, String dotColor) {
		super(id, x, y, dotColor);
		this.pointsList = pointsList;
		this.N = N;
	}

	public void addPoint(){
		for (Point point : pointsList){
			pointsList.add(point);
		}
	}

	public void deletePoint(Point point){
		if (pointsList.contains(point)){
			pointsList.remove(point);
		}
	}

	public void moveAllPoints(char xDirection, char yDirection){
		for( Point point : pointsList) {
			point.move(xDirection,yDirection);
		}
	}

	public Point middlePointOfAllPoints(Point point){
		double pointCoordinateX = (point.x + x)/2;
		double pointCoordinateY = (point.y + y)/2;
		return new Point(pointCoordinateX, pointCoordinateY);
	}

	public static double pointsDistance(double x1, double y1, double x2, double y2) {
		x1 -= x2;
		y1 -= y2;
		return Math.sqrt(pow(x1 ,2) + pow(y1,2));
	}

	public void findingNClosestPoints(int N, Point toPoint, List<Point> pointsList){

		for (toPoint : pointsList){
			for (int i=0;i<N;i++){
				Point closestPoint = pointsList.get(i);
				double closestDistace = pointsDistance(toPoint.x, toPoint.y, pointsList.get(i).x, pointsList.get(i).y);
				double distance = pointsDistance(x1, y1, x2, y2);

				if (distance < closestDistace && distance != 0){
					closestDistace = distance;
					closestPoint = pointsList.get(i);
				}
			}
		}
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