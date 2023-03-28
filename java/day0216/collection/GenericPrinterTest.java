package day0216.collection;

public class GenericPrinterTest {

	public static void main(String[] args) {

		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();

		powderPrinter.setMaterial(new Powder());

		System.out.println(powderPrinter);

		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();

		plasticPrinter.setMaterial(new Plastic());

		System.out.println(plasticPrinter);

	}

}