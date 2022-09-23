package Week_11th;

class Point {
	 
    private int x, y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
 
    public int getX() {
        return x;
    }
 
    public void setX(int x) {
        this.x = x;
    }
 
    public int getY() {
        return y;
    }
 
    public void setY(int y) {
        this.y = y;
    }
 
    public String toString() {
        return "ÁÂÇ¥ : (" + x + ",  " + y + ")";
    }
 
}
class MovablePoint extends Point {

    private int xSpeed, ySpeed;
    
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
 
    public int getxSpeed() {
        return xSpeed;
    }
 
    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }
 
    public int getySpeed() {
        return ySpeed;
    }
 
    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }
 
    public String toString() {
        String result = "ÁÂÇ¥ : (" + getX() + ",  " + getY() + ")\tÀÌµ¿¼Óµµ : (" + xSpeed + ", " + ySpeed + ")";
        return result;
    }
 
}

public class MovablePointTest {
	 public static void main(String[] args) {
		 
	        Point point = new Point(0, 0);
	        MovablePoint movablePoint = new MovablePoint(0, 0, 0, 0);
	        
	        System.out.println(point);            
	        System.out.println(movablePoint);
	        
	    }
}