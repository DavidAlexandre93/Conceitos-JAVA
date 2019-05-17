package TesteCalendar;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class Solution {

	static Calendar c = Calendar.getInstance();
	static Date data = c.getTime();

	// DIA ATUAL DA SEMANA
	public String weekDay(Calendar cal) {
		return new DateFormatSymbols().getWeekdays()[cal.get(Calendar.DAY_OF_WEEK)];
	}

	public static void main(String[] args) throws ParseException {

		// FORMATANDO HORA
		DateFormat hora = DateFormat.getTimeInstance();
		System.out.println("Hora formatada: " + hora.format(data));

		// FORMATANDO DATA
		DateFormat dtHora = DateFormat.getDateTimeInstance();
		System.out.println(dtHora.format(data));

		Calendar c1 = Calendar.getInstance();
		int hora1 = c1.get(Calendar.HOUR_OF_DAY);

		for (hora1 = 0; hora1 > 1; hora1++) {

			System.out.println("Fim da Reuniao");
		}

	}
}
