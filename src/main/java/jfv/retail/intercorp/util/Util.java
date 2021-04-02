package jfv.retail.intercorp.util;

import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;

public class Util {

	public static double promedioEdades(List<Integer> ages) {
		int summation = 0;
		summation = ages.stream().reduce(0, Integer::sum);
		return summation / ages.size();
	}

	public static double desviacionEstandar(List<Integer> ages) {
		//function standar download
		float media = 0;
		double var = 0.0;
		double desv = 0.0;
		int sumatoria = 0;
		sumatoria = ages.stream().reduce(0, Integer::sum);
		media = sumatoria / ages.size();
		for (Integer edad : ages) {
			double rango;
			rango = Math.pow(edad - media, 2f);
			var = var + rango;
		}
		var = var / ages.size();
		desv = Math.sqrt(var);
	
		return desv;
	}

	public static Date fechaPosibleMuerte(Date birthDate) {
		//function download
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(birthDate);
		int averageLifeMax = 82;
		int averageLifeMin = 35;
		int randomYearsPerson = new Random().nextInt((averageLifeMax - averageLifeMin) + 1) + averageLifeMin;
		int yearDeath = calendar.get(Calendar.YEAR) + randomYearsPerson;
		int monthDeath = new Random().nextInt((12)) + 1;
		YearMonth yearMonth = YearMonth.of(yearDeath, monthDeath);
		int daysInMonth = yearMonth.lengthOfMonth();
		return new GregorianCalendar(yearDeath, monthDeath, daysInMonth).getTime();
	}
}
