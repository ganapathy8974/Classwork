package day27;

//Genarics accepts what the class name you given <> this area that obj only this will accept. if you are give other class name it will throws you the error msg.
//on compaile time not run time.... so it's good idea <-- becouse u avoid run time Exception chech the line 14

public class BasicGenerics {

	public static void main(String[] args) {
		Ball ball = new Ball();
		Sky sky = new Sky();
		
		Accept<Ball> accept = new Accept<Ball>();
		accept.setT(ball);
		// accept.setT(sky); it will create compile time exception 
		
	}

}

class Ball{
	
}


class Sky{
	
}

class Accept<T>{
	T obj;
	public void setT(T obj){
		this.obj = obj;
	}
	
	public T getT() {
		return this.obj;
	}
}