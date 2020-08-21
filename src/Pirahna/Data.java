package Pirahna;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
public class Data {
	 ObservableList<Job> CurrentJobsOAData = FXCollections.observableArrayList();
	 ObservableList<Job> OldJobsOAData = FXCollections.observableArrayList();
	// ObservableList<String> OldJobsOAString = FXCollections.observableArrayList();
	 ObservableList<String> CurrentJobsOAStrings = FXCollections.observableArrayList();
	 ObservableList<Item> ItemsOAData= FXCollections.observableArrayList();
	 ObservableList<String> ItemsOAString= FXCollections.observableArrayList();
	 ObservableList<Worker> WorkersOAData = FXCollections.observableArrayList();
	 ObservableList<String> WorkersOAStrings = FXCollections.observableArrayList();
	 ObservableList<String> MaterialsStrings= FXCollections.observableArrayList();
	 ObservableList<String> UnderLayMaterials= FXCollections.observableArrayList();
	// ObservableList<String> y= FXCollections.observableArrayList();
	 int OrderNumber,ItemID;
	 
    public void refreshfile(String FileName) throws IOException {
   	 FileWriter y = new FileWriter(FileName);
     BufferedWriter z = new BufferedWriter(y);
	 String Passer="Wrong here";
	switch(FileName) {
	 case "Items.txt" :
    for(int i=0;i< ItemsOAData.size();i++) {
    z.write(ItemsOAData.get(i).getProductID()+","+ItemsOAData.get(i).getCategory()+","+ItemsOAData.get(i).getName()+","+ItemsOAData.get(i).getColour()+","+ItemsOAData.get(i).getMaterialUsed()+","+ItemsOAData.get(i).getUnderLayMaterial()+","+ItemsOAData.get(i).getPatronCode()+","+ItemsOAData.get(i).getNumberOfPieces()+","+ItemsOAData.get(i).getTotalcost()+","+ItemsOAData.get(i).isNew()+",");
    z.newLine();}
    z.close();
    break;
	 case "CurrentJobs.txt":
    CurrentJobsOAStrings.clear();
    for(int i=0;i<CurrentJobsOAData.size();i++) {
        Passer = CurrentJobsOAData.get(i).getCondition()+","+CurrentJobsOAData.get(i).getCuttingPrice()+","+CurrentJobsOAData.get(i).getDateCutting()+","+CurrentJobsOAData.get(i).getDateEnd()+","+CurrentJobsOAData.get(i).getDateSewing()+","+CurrentJobsOAData.get(i).getDateStart()+","+CurrentJobsOAData.get(i).getExtra()+","+CurrentJobsOAData.get(i).getMetersCutMain()+","+CurrentJobsOAData.get(i).getMetersCutSec()+","+CurrentJobsOAData.get(i).getNumberOfTotalUnits()+","+CurrentJobsOAData.get(i).getNumberOfUnitsCut()+","+CurrentJobsOAData.get(i).getNumberOfUnitsPrinted()+","+CurrentJobsOAData.get(i).getOrderNumber()+","+CurrentJobsOAData.get(i).getPrintingPrice()+","+CurrentJobsOAData.get(i).getSewingPrice()+","+CurrentJobsOAData.get(i).getItem().getCategory()+","+CurrentJobsOAData.get(i).getItem().getColour()+","+CurrentJobsOAData.get(i).getItem().getMaterialUsed()+","+CurrentJobsOAData.get(i).getItem().getName()+","+CurrentJobsOAData.get(i).getItem().getNumberOfPieces()+","+CurrentJobsOAData.get(i).getItem().getPatronCode()+","+CurrentJobsOAData.get(i).getItem().getProductID()+","+CurrentJobsOAData.get(i).getItem().getTotalcost()+","+CurrentJobsOAData.get(i).getItem().getUnderLayMaterial()+","+CurrentJobsOAData.get(i).getJobWorker().getName()+","+CurrentJobsOAData.get(i).getItem().isNew()+","+CurrentJobsOAData.get(i).getDatePrinting()+","+CurrentJobsOAData.get(i).getNumberOfUnitsSewed()+","+CurrentJobsOAData.get(i).getNumberOfUnitsOutForPrinting()+","+CurrentJobsOAData.get(i).getLosses()+",";
  //  Passer = CurrentJobsOAData.get(i).getOrderNumber()+","+CurrentJobsOAData.get(i).getItem().getCategory()+","+CurrentJobsOAData.get(i).getItem().getName()+"       "+CurrentJobsOAData.get(i).getItem().getColour()+"       "+CurrentJobsOAData.get(i).getCondition()+"       "+CurrentJobsOAData.get(i).getDateStart()+"       ";
    z.write(Passer);
	z.newLine();
	Passer = ToStringFormat(CurrentJobsOAData.get(i));
	CurrentJobsOAStrings.add(Passer);
    }
    z.close();
    
    break;
	 case "counter.txt" :
	z.write(OrderNumber+","+ItemID+",");
    z.close();
    break;
	 case "OldJobs.txt":
	//	 	OldJobsOAString.clear();
		    for(int i=0;i<OldJobsOAData.size();i++) {
		        Passer = OldJobsOAData.get(i).getCondition()+","+OldJobsOAData.get(i).getCuttingPrice()+","+OldJobsOAData.get(i).getDateCutting()+","+OldJobsOAData.get(i).getDateEnd()+","+OldJobsOAData.get(i).getDateSewing()+","+OldJobsOAData.get(i).getDateStart()+","+OldJobsOAData.get(i).getExtra()+","+OldJobsOAData.get(i).getMetersCutMain()+","+OldJobsOAData.get(i).getMetersCutSec()+","+OldJobsOAData.get(i).getNumberOfTotalUnits()+","+OldJobsOAData.get(i).getNumberOfUnitsCut()+","+OldJobsOAData.get(i).getNumberOfUnitsPrinted()+","+OldJobsOAData.get(i).getOrderNumber()+","+OldJobsOAData.get(i).getPrintingPrice()+","+OldJobsOAData.get(i).getSewingPrice()+","+OldJobsOAData.get(i).getItem().getCategory()+","+OldJobsOAData.get(i).getItem().getColour()+","+OldJobsOAData.get(i).getItem().getMaterialUsed()+","+OldJobsOAData.get(i).getItem().getName()+","+OldJobsOAData.get(i).getItem().getNumberOfPieces()+","+OldJobsOAData.get(i).getItem().getPatronCode()+","+OldJobsOAData.get(i).getItem().getProductID()+","+OldJobsOAData.get(i).getItem().getTotalcost()+","+OldJobsOAData.get(i).getItem().getUnderLayMaterial()+","+OldJobsOAData.get(i).getJobWorker().getName()+","+OldJobsOAData.get(i).getItem().isNew()+","+OldJobsOAData.get(i).getDatePrinting()+","+OldJobsOAData.get(i).getNumberOfUnitsSewed()+","+OldJobsOAData.get(i).getNumberOfUnitsOutForPrinting()+","+OldJobsOAData.get(i).getLosses()+",";
		  //  Passer = CurrentJobsOAData.get(i).getOrderNumber()+","+CurrentJobsOAData.get(i).getItem().getCategory()+","+CurrentJobsOAData.get(i).getItem().getName()+"       "+CurrentJobsOAData.get(i).getItem().getColour()+"       "+CurrentJobsOAData.get(i).getCondition()+"       "+CurrentJobsOAData.get(i).getDateStart()+"       ";
		    z.write(Passer);
			z.newLine();
			Passer = ToStringFormat(OldJobsOAData.get(i));
	//		OldJobsOAString.add(Passer);
		    }
		    z.close();
		    
		    break;}
}
	public void readfile(String FileName) throws IOException {
	
    FileReader f = new FileReader(FileName);
	BufferedReader Read = new BufferedReader(f);
	String Passer;
	switch(FileName) {
	case "CurrentJobs.txt":
		Pirahna.Main.Database.CurrentJobsOAData.clear();
		Pirahna.Main.Database.CurrentJobsOAStrings.clear();
		for(int i=0;i<Pirahna.Main.LineCounter("CurrentJobs.txt");i++) {
			Item AddItem = new Item();
		    Worker AddWorker = new Worker();
		    Job Addjob = new Job(AddItem);
		    boolean helper;
		Passer=Read.readLine();
		if(Passer==null) {break;}
        String[] d = Passer.split(",");
        Addjob.setCondition(d[0]);
        Addjob.setCuttingPrice(Float.parseFloat(d[1]));
        Addjob.setDateCutting(d[2]);
        Addjob.setDateEnd(d[3]);
        Addjob.setDateSewing(d[4]);
        Addjob.setDateStart(d[5]);
        Addjob.setExtra(Integer.parseInt(d[6]));
        Addjob.setMetersCutMain(Integer.parseInt(d[7]));
        Addjob.setMetersCutSec(Integer.parseInt(d[8]));
        Addjob.setNumberOfTotalUnits(Integer.parseInt(d[9]));
        Addjob.setNumberOfUnitsCut(Integer.parseInt(d[10]));
        Addjob.setNumberOfUnitsPrinted(Integer.parseInt(d[11]));
        Addjob.setOrderNumber(Integer.parseInt(d[12]));
        Addjob.setPrintingPrice(Float.parseFloat(d[13]));
        Addjob.setSewingPrice(Float.parseFloat(d[14]));
        Addjob.getItem().setCategory(d[15]);
        Addjob.getItem().setColour(d[16]);
        Addjob.getItem().setMaterialUsed(d[17]);
        Addjob.getItem().setName(d[18]);
        Addjob.getItem().setNumberOfPieces(Integer.parseInt(d[19]));
        Addjob.getItem().setPatronCode(Integer.parseInt(d[20]));
        Addjob.getItem().setProductID(Integer.parseInt(d[21]));
        Addjob.getItem().setTotalcost(Float.parseFloat(d[22]));
        Addjob.getItem().setUnderLayMaterial(d[23]);
        Addjob.setJobWorker(AddWorker);
        Addjob.getJobWorker().setName(d[24]);
        if(d[25].equals(true)==true) {helper=true;}
        else helper=false;
        Addjob.getItem().setNew(helper);
        Addjob.setDatePrinting(d[26]);
        Addjob.setNumberOfUnitsSewed(Integer.parseInt(d[27]));
        Addjob.setNumberOfUnitsOutForPrinting(Integer.parseInt(d[28]));
        Addjob.setLosses((Float.parseFloat(d[29])));
        Pirahna.Main.Database.CurrentJobsOAData.add(Addjob);
        String Passer2 = ToStringFormat(Addjob);
        Pirahna.Main.Database.CurrentJobsOAStrings.add(Passer2);
}
		Read.close();
		break;
	case "Items.txt" :
		ItemsOAData.clear();
		ItemsOAString.clear();
		for(int i=0;i < Pirahna.Main.LineCounter("Items.txt");i++) {
		Item AddItem2 = new Item();
		String[] d ;
		String Stringer;
		Passer=Read.readLine();
		if(Passer==null) {break;}
		d=Passer.split(",");
		boolean Helper;
        if(d[9]=="true") {Helper=true;}
        else Helper=false;
		AddItem2.setCategory(d[1]);
		AddItem2.setColour(d[3]);
		AddItem2.setMaterialUsed(d[4]);
		AddItem2.setName(d[2]);
		AddItem2.setNew(Helper);
		AddItem2.setNumberOfPieces(Integer.parseInt(d[7]));
		AddItem2.setPatronCode(Integer.parseInt(d[6]));
		AddItem2.setProductID(Integer.parseInt(d[0]));
		AddItem2.setTotalcost(Float.parseFloat(d[8]));
		AddItem2.setUnderLayMaterial(d[5]);
		Stringer=ToStringFormat(AddItem2);
        Pirahna.Main.Database.ItemsOAString.add(Stringer);
		Pirahna.Main.Database.ItemsOAData.add(AddItem2);
		}
	break;
	case "counter.txt" :
	    String[] x = Read.readLine().split(",");
	    OrderNumber=Integer.parseInt(x[0]);
	    ItemID=Integer.parseInt(x[1]);
		Read.close();
    break;
	case "OldJobs.txt" :
		Pirahna.Main.Database.OldJobsOAData.clear();
//		Pirahna.Main.Database.OldJobsOAString.clear();
		for(int i=0;i<Pirahna.Main.LineCounter("OldJobs.txt");i++) {
			Item AddItem3 = new Item();
		    Worker AddWorker3 = new Worker();
		    Job Addjob3 = new Job(AddItem3);
		    boolean helper1;
		Passer=Read.readLine();
		if(Passer==null) {break;}
        String[] d1 = Passer.split(",");
        Addjob3.setCondition(d1[0]);
        Addjob3.setCuttingPrice(Float.parseFloat(d1[1]));
        Addjob3.setDateCutting(d1[2]);
        Addjob3.setDateEnd(d1[3]);
        Addjob3.setDateSewing(d1[4]);
        Addjob3.setDateStart(d1[5]);
        Addjob3.setExtra(Integer.parseInt(d1[6]));
        Addjob3.setMetersCutMain(Integer.parseInt(d1[7]));
        Addjob3.setMetersCutSec(Integer.parseInt(d1[8]));
        Addjob3.setNumberOfTotalUnits(Integer.parseInt(d1[9]));
        Addjob3.setNumberOfUnitsCut(Integer.parseInt(d1[10]));
        Addjob3.setNumberOfUnitsPrinted(Integer.parseInt(d1[11]));
        Addjob3.setOrderNumber(Integer.parseInt(d1[12]));
        Addjob3.setPrintingPrice(Float.parseFloat(d1[13]));
        Addjob3.setSewingPrice(Float.parseFloat(d1[14]));
        Addjob3.getItem().setCategory(d1[15]);
        Addjob3.getItem().setColour(d1[16]);
        Addjob3.getItem().setMaterialUsed(d1[17]);
        Addjob3.getItem().setName(d1[18]);
        Addjob3.getItem().setNumberOfPieces(Integer.parseInt(d1[19]));
        Addjob3.getItem().setPatronCode(Integer.parseInt(d1[20]));
        Addjob3.getItem().setProductID(Integer.parseInt(d1[21]));
        Addjob3.getItem().setTotalcost(Float.parseFloat(d1[22]));
        Addjob3.getItem().setUnderLayMaterial(d1[23]);
        Addjob3.setJobWorker(AddWorker3);
        Addjob3.getJobWorker().setName(d1[24]);
        if(d1[25].equals(true)==true) {helper1=true;}
        else helper1=false;
        Addjob3.getItem().setNew(helper1);
        Addjob3.setDatePrinting(d1[26]);
        Addjob3.setNumberOfUnitsSewed(Integer.parseInt(d1[27]));
        Addjob3.setNumberOfUnitsOutForPrinting(Integer.parseInt(d1[28]));
        Addjob3.setLosses((Float.parseFloat(d1[29])));
        Pirahna.Main.Database.OldJobsOAData.add(Addjob3);
     //   String Passer21 = ToStringFormat(Addjob3);
   //    Pirahna.Main.Database.OldJobsOAString.add(Passer21);
}
		Read.close();
		break;
}}
    public String ToStringFormat(Job Currentjob) {
    	String Passer="NO IF'S Entered";
    	if(Currentjob.getCondition().toString().equals("READY FOR CUTTING")==true) {Passer = Currentjob.getOrderNumber()+"       "+Currentjob.getItem().getCategory()+"       "+Currentjob.getItem().getName()+"       "+Currentjob.getItem().getColour()+"       "+Currentjob.getCondition()+"       "+Currentjob.getDateStart()+"       "+Currentjob.getNumberOfTotalUnits()+"   Unit";}
    	else if(Currentjob.getCondition().toString().equals("READY FOR PRINTING")==true) {Passer = Currentjob.getOrderNumber()+"       "+Currentjob.getItem().getCategory()+"       "+Currentjob.getItem().getName()+"       "+Currentjob.getItem().getColour()+"       "+Currentjob.getCondition()+"       "+Currentjob.getDateCutting()+"       "+Currentjob.getItem().getTotalcost()+"  L.E / Unit"+"       "+Currentjob.getNumberOfUnitsCut()+"/"+Currentjob.getNumberOfTotalUnits()+"  Units";}
    	else if(Currentjob.getCondition().toString().equals("READY FOR SEWING")==true) {Passer = Currentjob.getOrderNumber()+"       "+Currentjob.getItem().getCategory()+"       "+Currentjob.getItem().getName()+"       "+Currentjob.getItem().getColour()+"       "+Currentjob.getCondition()+"       "+Currentjob.getDatePrinting()+"       "+Currentjob.getItem().getTotalcost()+"  L.E / Unit"+"       "+((Currentjob.getNumberOfUnitsCut()*Currentjob.getItem().getNumberOfPieces())-(Currentjob.getNumberOfUnitsOutForPrinting()-Currentjob.getNumberOfUnitsPrinted()))+"/"+Currentjob.getNumberOfUnitsCut()*Currentjob.getItem().getNumberOfPieces()+"   Pieces"+"        "+Currentjob.getLosses()+"   L.E LOSSES";}
    	else if(Currentjob.getCondition().toString().equals("READY")==true) {Passer = Currentjob.getOrderNumber()+"       "+Currentjob.getItem().getCategory()+"       "+Currentjob.getItem().getName()+"       "+Currentjob.getItem().getColour()+"       "+Currentjob.getCondition()+"       "+Currentjob.getDateSewing()+"       "+Currentjob.getItem().getTotalcost()+"  L.E / Unit"+"       "+Currentjob.getNumberOfUnitsSewed()+"/"+Currentjob.getNumberOfTotalUnits()+"   Units";}
    	else if(Currentjob.getCondition().toString().equals("OUT FOR PRINTING")==true) {Passer = Currentjob.getOrderNumber()+"       "+Currentjob.getItem().getCategory()+"       "+Currentjob.getItem().getName()+"       "+Currentjob.getItem().getColour()+"       "+Currentjob.getCondition()+"       "+Currentjob.getDatePrinting()+"       "+Currentjob.getNumberOfUnitsOutForPrinting()+"/"+Currentjob.getNumberOfUnitsCut()*Currentjob.getItem().getNumberOfPieces()+"   Pieces";}
    	else if(Currentjob.getCondition().toString().equals("DONE")==true) {Passer = Currentjob.getOrderNumber()+"       "+Currentjob.getItem().getName()+"       "+Currentjob.getItem().getColour()+"       "+Currentjob.getItem().getProductID()+"      "+Currentjob.getDateStart()+"---->"+Currentjob.getDateEnd();}

    	return Passer;}
    public String ToStringFormat(Item CurrentItem) {
    	String Passer;
    	Passer=CurrentItem.getCategory()+"       "+CurrentItem.getColour()+"       "+CurrentItem.getMaterialUsed()+"       "+CurrentItem.getName()+"       "+CurrentItem.isNew()+"       "+CurrentItem.getNumberOfPieces()+"       "+CurrentItem.getPatronCode()+"       "+CurrentItem.getProductID()+"       "+CurrentItem.getTotalcost()+"       "+CurrentItem.getUnderLayMaterial();
    	
 
    	return Passer;

    }
}
