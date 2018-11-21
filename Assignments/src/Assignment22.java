//Printer Question

public class Assignment22{
	private static int tonerLevel;
	private static int numberOfPagePrinted=0;
	private String printerType;
	
	public Assignment22(int tonerLevel, int numberOfPagePrinted) {
		this.tonerLevel = tonerLevel;
		this.numberOfPagePrinted = numberOfPagePrinted;
		printerType = "duplex";
	}

	public static int fillUpToner(int fillUp) {
		if(tonerLevel+fillUp <=100 && tonerLevel+fillUp>=0) {
			return tonerLevel + fillUp;
		}else {
			return 100;
		}
	}
	
	public static int printPage() {
		return numberOfPagePrinted++;
	}
}