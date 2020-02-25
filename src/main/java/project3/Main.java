package project3;

import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;

public class Main {
	  public static void main(String[] args) {
	    // Use Year/*from   w  w  w .ja v  a  2  s  .  c o m*/
	    Year y1 = Year.of(2012);    // 2012
	    y1.plusYears(1);
	    if (y1.isLeap()) {
	      System.out.println(y1 + " is a leap year.");
	    } 
	    else {
	      System.out.println(y1 + " is not a leap year.");
	    }

	    // Use YearMonth
	    YearMonth ym1 = YearMonth.of(2012, Month.MAY); // 2012-05
	    
	    // Get the number of days in the month
	    int monthLen = ym1.lengthOfMonth(); // 31
	    System.out.println("Days in month in " + ym1 + ": " + monthLen);
	    
	    // Get the number of days in the year
	    int yearLen = ym1.lengthOfYear(); // 366
	    System.out.println("Days in year in " + ym1 + ": " + yearLen);
	    
	    MonthDay.of(Month.DECEMBER, 25);
	    MonthDay md2 = MonthDay.of(Month.FEBRUARY, 29);
	    if (md2.isValidYear(2009)) {
	      System.out.println(md2 + " occurred in 2009");
	    } 
	    else {
	      System.out.println(md2 + " did not occur in 2009");
	    }
	  }
	}