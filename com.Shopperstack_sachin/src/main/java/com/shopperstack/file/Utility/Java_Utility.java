package com.shopperstack.file.Utility;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class Java_Utility {
	public int GeneraterandomNumber( ) {
		
		Random r= new Random();
		int num=r.nextInt(1000);
		return num;
	}
	public String getLocalDate() {
		
		String date = LocalDate.now().toString().replace("-", "");
		return date;
	}

	public String getLocalDateandTime() {
		String datetime = LocalDateTime.now().toString().replace("-", "").replace(":","").replace(".", "");
		return datetime;
	}
}
