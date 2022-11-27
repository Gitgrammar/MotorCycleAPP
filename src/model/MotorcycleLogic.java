package model;

public class MotorcycleLogic {
	public void execute(Motorcycle motorcycle) {
		String choise=motorcycle.getType();
		String []kinds = {"ZOOMER","PCX125","PCX150","FUSION","FTR223","SR400B","W800","隼","HarleyR"};

		String resulted =kinds[Integer.parseInt(choise)];
		String path ="";
	System.out.println(motorcycle.getNumber());
	motorcycle.setResulted(resulted);
	System.out.println(resulted+path);

}
}

