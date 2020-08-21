package Pirahna;


public class Job {
private int OrderNumber=0;
private String Condition="Not Determined Yet";
private String DateStart="Not Determined Yet";
private String DateCutting="Not Determined Yet";
private String DatePrinting="Not Determined Yet";
private String DateSewing="Not Determined Yet";
private String DateEnd="Not Determined Yet";
private Item Item;
private int NumberOfUnitsOutForPrinting=0;
private float CuttingPrice=0;
private float SewingPrice=0;
private float PrintingPrice=0;
private float Losses=0;
private int MetersCutMain=0;
private int MetersCutSec=0;
private int NumberOfUnitsCut=0;
private int NumberOfUnitsPrinted=0;
private int NumberOfUnitsSewed=0;
private Worker JobWorker;
public int getMetersCutMain() {
	return MetersCutMain;
}

public int getMetersCutSec() {
	return MetersCutSec;
}

public int getNumberOfUnitsCut() {
	return NumberOfUnitsCut;
}

public int getNumberOfUnitsPrinted() {
	return NumberOfUnitsPrinted;
}

public void setItem(Item item) {
	Item = item;
}

public void setMetersCutMain(int metersCutMain) {
	MetersCutMain = metersCutMain;
}

public void setMetersCutSec(int metersCutSec) {
	MetersCutSec = metersCutSec;
}

public void setNumberOfUnitsCut(int numberOfUnitsCut) {
	NumberOfUnitsCut = numberOfUnitsCut;
}

public void setNumberOfUnitsPrinted(int numberOfUnitsPrinted) {
	NumberOfUnitsPrinted = numberOfUnitsPrinted;
}

private int NumberOfTotalUnits;
private int Extra;

public Job(Pirahna.Item item) {
	super();
	Item = item;
}

public int getOrderNumber() {
	return OrderNumber;
}

public String getDateStart() {
	return DateStart;
}

public String getDateCutting() {
	return DateCutting;
}

public String getDateSewing() {
	return DateSewing;
}

public String getDateEnd() {
	return DateEnd;
}

public Item getItem() {
	return Item;
}

public float getCuttingPrice() {
	return CuttingPrice;
}

public float getSewingPrice() {
	return SewingPrice;
}

public float getPrintingPrice() {
	return PrintingPrice;
}
public int getNumberOfTotalUnits() {
	return NumberOfTotalUnits;
}

public int getExtra() {
	return Extra;
}

public void setOrderNumber(int orderNumber) {
	OrderNumber = orderNumber;
}

public void setDateStart(String dateStart) {
	DateStart = dateStart;
}

public void setDateCutting(String dateCutting) {
	DateCutting = dateCutting;
}

public void setDateSewing(String dateSewing) {
	DateSewing = dateSewing;
}

public void setDateEnd(String dateEnd) {
	DateEnd = dateEnd;
}

public void setCuttingPrice(float f) {
	CuttingPrice = f;
}

public void setSewingPrice(float f) {
	SewingPrice = f;
}

public void setPrintingPrice(float f) {
	PrintingPrice = f;
}

public void setNumberOfTotalUnits(int numberOfTotalUnits) {
	NumberOfTotalUnits = numberOfTotalUnits;
}

public void setExtra(int extra) {
	Extra = extra;
}

public String getCondition() {
	return Condition;
}

public void setCondition(String condition) {
	Condition = condition;
}
public Worker getJobWorker() {
	return JobWorker;
}

public void setJobWorker(Worker jobWorker) {
	JobWorker = jobWorker;
}

public String getDatePrinting() {
	return DatePrinting;
}

public void setDatePrinting(String datePrinting) {
	DatePrinting = datePrinting;
}

public int getNumberOfUnitsSewed() {
	return NumberOfUnitsSewed;
}

public void setNumberOfUnitsSewed(int numberOfUnitsSewed) {
	NumberOfUnitsSewed = numberOfUnitsSewed;
}

public int getNumberOfUnitsOutForPrinting() {
	return NumberOfUnitsOutForPrinting;
}

public void setNumberOfUnitsOutForPrinting(int numberOfUnitsOutForPrinting) {
	NumberOfUnitsOutForPrinting = numberOfUnitsOutForPrinting;
}

public float getLosses() {
	return Losses;
}

public void setLosses(float losses) {
	Losses = losses;
}


}
