package com.MapCountryName;

public class Country {
private String nameEn,nameTh,nameJp;

public String getNameJp() {
	return nameJp;
}

public void setNameJp(String nameJp) {
	this.nameJp = nameJp;
}

public String getNameTh() {
	return nameTh;
}

public void setNameTh(String nameTh) {
	this.nameTh = nameTh;
}

public String getNameEn() {
	return nameEn;
}

public void setNameEn(String nameEn) {
	this.nameEn = nameEn;
}


public Country(String nameEn, String nameTh, String nameJp) {
	super();
	this.nameEn = nameEn;
	this.nameTh = nameTh;
	this.nameJp = nameJp;
}

//@Override
//public String toString() {
//	return "Country [nameEn=" + nameEn + ", nameTh=" + nameTh + ", nameJp=" + nameJp + "]";
//}


}
