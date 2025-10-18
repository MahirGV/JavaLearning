package javaConstructor;

public class Main {

	int modelYear;
	String modelName;

	public Main(String modelName) {
		this.modelName = modelName;
	}

	public Main(int modelYear, String modelName) {
		this.modelName = modelName;
		this.modelYear = modelYear;
	}

	public void printinfo() {
		System.out.println(modelName + " ," + modelYear);
	}

}
