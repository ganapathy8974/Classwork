package day27;

public class GenericsDemo {

	public static void main(String[] args) {
		Paint paint = new RedPaint();
		Powder powder = new RosePowder();
		PaintBrush brush = new PaintBrush();
		brush.obj = powder;
		brush.excute();

	}

}

abstract class Paint{
	abstract public void dopaint();
}
class RedPaint extends Paint{
	@Override
	public void dopaint() {
		System.out.println("Ready To Paint Red Colour");
		
	}
}
class BluePaint extends Paint{
	@Override
	public void dopaint() {
		System.out.println("Ready To Blue Red Colour");
		
	}
}

abstract class Powder{
	abstract public void doPowder();
}

class RosePowder extends Powder{
	@Override
	public void doPowder() {
		System.out.println("Ready to do Rose Power");
		
	}
}

class PaintBrush{
	Object obj;
	public void excute() {
		if(obj instanceof Paint) {
			Paint paint = (Paint)obj;
			paint.dopaint();
		}else if(obj instanceof Powder) {
			Powder powder = (Powder)obj;
			powder.doPowder();
		}
		
	}
}