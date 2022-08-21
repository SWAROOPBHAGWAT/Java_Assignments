
class Box{
	
	double width; 
	double height;
	double depth;
	
	Box() {
		System.out.println("constructing Box");
		width = 10;
		height = 10;
		depth = 10;
	}
	
	Box(double w, double h, double d){
		width = w;
		height = h;
		depth = d;	
	}
	
	void volume() {
		System.out.print("volume is ");
		System.out.print(width*height*depth);
	}
	
	double computeVolume(){
		return width*height*depth;
	}

	void setDim(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}
}	

