package sec3;

public class Shape {
	private int shapeType; //0 원 3 3각 4 4각
	private int length;
	private int height;
	
	public int getShapeType() {
		return shapeType;
	}
	public void setShapeType(int shapeType) {
		if(shapeType==0 || shapeType==3 || shapeType ==4){
			this.shapeType = shapeType;
		}else {
			System.out.println("도형을 잘 못 고르셨습니다.");
		}
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double shapeArea(int length, int height){
		if(this.shapeType==3){
			return length*height/2;
		}else
			return length*height;
	}
	public double shapeArea(int length){
		return length*length*3.14;
	}
	
}
