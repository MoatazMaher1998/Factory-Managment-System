package Pirahna;

public class Item {
 private String Name="Not Determined Yet";
 private int ProductID=0;
 private String Category="Not Determined Yet";
 private String MaterialUsed="Not Determined Yet";
 private String UnderLayMaterial="Not Determined Yet";
 private String Colour="Not Determined Yet";
 private boolean New=true;
 private int PatronCode=0;
 private int NumberOfPieces=0;
 private float totalcost=0;
public String getName() {
	return Name;
}
public int getProductID() {
	return ProductID;
}
public String getCategory() {
	return Category;
}
public String getMaterialUsed() {
	return MaterialUsed;
}
public String getColour() {
	return Colour;
}
public int getPatronCode() {
	return PatronCode;
}
public int getNumberOfPieces() {
	return NumberOfPieces;
}
public float getTotalcost() {
	return totalcost;
}
public void setName(String name) {
	Name = name;
}
public void setProductID(int productID) {
	ProductID = productID;
}
public void setCategory(String category) {
	Category = category;
}
public void setMaterialUsed(String materialUsed) {
	MaterialUsed = materialUsed;
}
public void setColour(String colour) {
	Colour = colour;
}
public void setPatronCode(int patronCode) {
	PatronCode = patronCode;
}
public void setNumberOfPieces(int numberOfPieces) {
	NumberOfPieces = numberOfPieces;
}
public void setTotalcost(float f) {
	this.totalcost = f;
}
public String getUnderLayMaterial() {
	return UnderLayMaterial;
}
public void setUnderLayMaterial(String underLayMaterial) {
	UnderLayMaterial = underLayMaterial;
}
public boolean isNew() {
	return New;
}
public void setNew(boolean new1) {
	New = new1;
}


}
