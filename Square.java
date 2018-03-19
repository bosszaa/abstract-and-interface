
public class Square extends Polygon{
	public Square(int side){
		super(4);
		for(int i = 0;i<sides.length;i++){
			sides[i] = side;
		}
	}
	public void calArea() {
		area=sides[0]*sides[0];
	}
}