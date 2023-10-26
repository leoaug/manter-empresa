package br.com.bb.amb.tecnotour.util;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.joda.time.DateTime;

import br.com.bb.amb.tecnotour.constantes.Constantes;




public class DataUtil {

	public static List <Date> getDatasPorSemana(Date dataInicio, Date dataFim, int diaDaSemana) throws Exception { // object


		Calendar c1 = Calendar.getInstance();
		c1.setTime(dataInicio);
		Calendar c2 = Calendar.getInstance();
		c2.setTime(dataFim);
		//int sundays = 0;
		List <Date> lista = new ArrayList<Date>();
		while (c2.after(c1)) {
			// System.out.println(" came here ");
			//checks to see if the day1 ....so on next days are sundays if sunday goes inside to increment the counter
			if (c1.get(Calendar.DAY_OF_WEEK) == diaDaSemana) {
				//System.out.println(c1.getTime().toString() + " is a sunday ");
				//System.out.println(sundays + " is a sunday ");
				lista.add(c1.getTime());
				//sundays++;

			}
			c1.add(Calendar.DATE, 1);
		}

		return lista;
	}
	

	public static List <Date> pegarIntervaloDatas(Date dt1, Date dt2) {
		DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
        //Date dt1 = df.parse ("10/07/2009");
        //Date dt2 = df.parse ("02/10/2009");
        Calendar cal = Calendar.getInstance();
        cal.setTime (dt1);
        List <Date> datas = new ArrayList<Date>();
        for (Date dt = dt1; dt.compareTo (dt2) <= 0; ) {
            System.out.println (df.format (dt));
            cal.add (Calendar.DATE, +1);
            dt = cal.getTime();
            datas.add(dt);
        }
        return datas;
	}
	
	
	
	 public static int getDiferencaEmDias(Date dataInicio, Date dataFim){
	   
		 DateTime dateTimeInicio = new DateTime(dataInicio);
		 
		 DateTime dateTimeFim = new DateTime(dataFim);
		 
		 return (int) TimeUnit.MILLISECONDS.toDays(dateTimeFim.getMillis()- dateTimeInicio.getMillis());
	  }
	 
	 /*
	 public static int getDiferencaEmSemanas(Date dataInicio, Date dataFim){
		   
		 DateTime dateTimeInicio = new DateTime(dataInicio);
		 
		 DateTime dateTimeFim = new DateTime(dataFim);
		 
		 return (int) TimeUnit.MILLISECONDS.toDays(dateTimeFim.getMillis()- dateTimeInicio.getMillis()) / 7;
	  }
	 
	 public static int getDiferencaEmQuinzenas(Date dataInicio, Date dataFim){
		   
		 DateTime dateTimeInicio = new DateTime(dataInicio);
		 
		 DateTime dateTimeFim = new DateTime(dataFim);
		 
		 return (int) TimeUnit.MILLISECONDS.toDays(dateTimeFim.getMillis()- dateTimeInicio.getMillis()) / 15;
	  }
	 */
	 
	 
	 /**
	  * Calcula a diferenca de duas datas em horas <br>
	  * <b>Importante:</b> Quando realiza a diferenca em horas entre duas datas,
	  * este metodo considera os minutos restantes e os converte em fracao de
	  * horas.
	  * 
	  * @param dataInicial
	  * @param dataFinal
	  * @return quantidade de horas existentes entre a dataInicial e dataFinal.
	  */
	 public static double getDiferencaEmHoras(Date dataInicial, Date dataFinal) {
		 double result = 0;
		 long diferenca = dataFinal.getTime() - dataInicial.getTime();
		 long diferencaEmHoras = (diferenca / 1000) / 60 / 60;
		 long minutosRestantes = (diferenca / 1000) / 60 % 60;
		 double horasRestantes = minutosRestantes / 60d;
		 result = diferencaEmHoras + (horasRestantes);

		 return result;
	 }
	 
	 public static double getDiferencaEmMeses(Date dataInicial, Date dataFinal) {
			// SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

			/*
			 * valor de um mes em milisegundos, sendo que os valores sao: 30 dias no
			 * mes, 24 horas no dia, 60 minutos por hora, 60 segundos por minuto e
			 * 1000 milisegundos
			 */
			final double MES_EM_MILISEGUNDOS = 30.0 * 24.0 * 60.0 * 60.0 * 1000.0;
			// final double MES_EM_MILISEGUNDOS = 2592000000.0;

			return (double) ((dataFinal.getTime() - dataInicial.getTime()) / MES_EM_MILISEGUNDOS);
		}
	 
	 public static double getDiferencaEmAnos(Date dataInicial, Date dataFinal) {
			// SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

			/*
			 * valor de um mes em milisegundos, sendo que os valores sao: 30 dias no
			 * mes, 24 horas no dia, 60 minutos por hora, 60 segundos por minuto e
			 * 1000 milisegundos
			 */
			final double MES_EM_MILISEGUNDOS = 30.0 * 24.0 * 60.0 * 60.0 * 1000.0;
			// final double MES_EM_MILISEGUNDOS = 2592000000.0;

			return (double) ((dataFinal.getTime() - dataInicial.getTime()) / MES_EM_MILISEGUNDOS) / 12;
		}
	 
	
	
	public static int contarIntervaloDatas(Date dt1, Date dt2) {
		DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
        //Date dt1 = df.parse ("10/07/2009");
        //Date dt2 = df.parse ("02/10/2009");
        Calendar cal = Calendar.getInstance();
        cal.setTime (dt1);
        int count = 0;
        for (Date dt = dt1; dt.compareTo (dt2) <= 0; ) {
            System.out.println (df.format (dt));
            cal.add (Calendar.DATE, +1);
            dt = cal.getTime();
            count++;
        }
        return count;
	}
	
	
	public static String getMesPorDate(Date data) {

		DateFormat dfmt = new SimpleDateFormat("MM");
		return dfmt.format(data);

	}
	public static String getAnoPorDateString(Date data) {

		DateFormat dfmt = new SimpleDateFormat("yyyy");
		return dfmt.format(data);

	}
	public static Integer getDiaPorDate(Date data) {

		DateFormat dfmt = new SimpleDateFormat("dd");
		return Integer.parseInt(dfmt.format(data));

	}
	
	public static Integer getHoraPorDate(Date data) {

		DateFormat dfmt = new SimpleDateFormat("HH");
		return Integer.parseInt(dfmt.format(data));

	}
	
	public static Integer getMinutoPorDate(Date data) {

		DateFormat dfmt = new SimpleDateFormat("mm");
		return Integer.parseInt(dfmt.format(data));

	}
	
	public static Date stringToDate(String dataString, String formato)
			throws Exception {
		Date dataR = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(formato);
			dataR = sdf.parse(dataString);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return dataR;
	}
	public static double getDiferencaEmSegundos(Date dataInicial, Date dataFinal) {
		double result = 0;
		long diferenca = dataFinal.getTime() - dataInicial.getTime();
		double diferencaEmMinutos = (diferenca / 1000) / 60; // resultado 
																// diferenca
																// entre as
																// datas em
																// minutos
		long segundosRestantes = (diferenca / 1000) % 60; // calcula os segundos
															// restantes
		result = diferencaEmMinutos + (segundosRestantes / 60d); // transforma
																	// os
																	// segundos
																	// restantes
																	// em
																	// minutos

		return result * 60;
	}
	
	
	public static List<String> getDiasDaSemanaDoMes(Date data) throws Exception {
		List<String> diasDaSemanaList = new ArrayList<String>();
		try {

			Calendar cal = Calendar.getInstance();
			cal.setTime(data);
			cal.set(Calendar.DAY_OF_MONTH, 1);
			// int diaPrimeiro = cal.get(Calendar.DAY_OF_WEEK); //
			// Calendar.SUNDAY ... Calendar.SATURDAY
			int ultimoDia = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			// int pos = diaPrimeiro - Calendar.SUNDAY;
			// -- Pondo os dias de 1 a ultimoDia

			String mes = getMesPorDate(data);
			String ano = getAnoPorDateString(data);

			for (int diaDoMes = 1; diaDoMes <= ultimoDia; ++diaDoMes /* ,++pos */) {
				String dataString = Integer.toString(diaDoMes) + "/" + mes
						+ "/" + ano;

				if (dataString.length() == 9) {
					dataString = "0" + dataString;
				}

				diasDaSemanaList.add(getDiasDaSemanaDescritivo(stringToDate(
						dataString, "dd/MM/yyyy")) + " - " + dataString);
			}

		} catch (Exception e) {
			throw e;
		}

		return diasDaSemanaList;
	}
	
	public static Integer getAnoPorDate(Date data) {

		DateFormat dfmt = new SimpleDateFormat("yyyy");
		return Integer.parseInt(dfmt.format(data));

	}
	
	public static String getDiasDaSemanaDescritivo(Date data) {

		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(data);

		return new DateFormatSymbols().getWeekdays()[calendar
				.get(Calendar.DAY_OF_WEEK)];
	}
	
	public static Date acrescendarDataEmSegundos(Date dataInserida,
			int numeroDeSegundos) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInserida);
		calendar.add(Calendar.SECOND, numeroDeSegundos);

		return calendar.getTime();
	}
	
	public static Date getDataInicioDoMes(Date data) throws Exception {

		try {

			Calendar cal = Calendar.getInstance();
			cal.setTime(data);
			cal.set(Calendar.DAY_OF_MONTH, 1);
			// int diaPrimeiro = 1;
			String mes = getMesPorDate(data);
			String ano = getAnoPorDateString(data);

			return stringToDate("01" + "/" + mes + "/" + ano,
					"dd/MM/yyyy");

		} catch (Exception e) {
			throw e;
		}
	}
	
	
	public static Date getDataInicioDodia() throws Exception {
		try {
			String dataInicioDoDIaString = DataUtil.dateToString(new Date(),
					"dd/MM/yyyy HH:mm:ss").substring(0, 10)
					+ " 00:00:00";
			return DataUtil.stringToDate(dataInicioDoDIaString,
					"dd/MM/yyyy HH:mm:ss");
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static Date getDataFimDodia() throws Exception {
		try {
			String dataInicioDoDIaString = DataUtil.dateToString(new Date(),
					"dd/MM/yyyy HH:mm:ss").substring(0, 10)
					+ " 23:59:59";
			return DataUtil.stringToDate(dataInicioDoDIaString,
					"dd/MM/yyyy HH:mm:ss");
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static Date getDataFimDodia(Date data) throws Exception {
		try {
			String dataInicioDoDIaString = DataUtil.dateToString(data,
					"dd/MM/yyyy HH:mm:ss").substring(0, 10)
					+ " 23:59:59";
			return DataUtil.stringToDate(dataInicioDoDIaString,
					"dd/MM/yyyy HH:mm:ss");
		} catch (Exception e) {
			throw e;
		}
	}
	
	
	public static Date getDataFimDoMes(Date data) throws Exception {

		try {

			Calendar cal = Calendar.getInstance();
			cal.setTime(data);
			cal.set(Calendar.DAY_OF_MONTH, 1);
			int ultimoDia = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			String mes = getMesPorDate(data);
			String ano = getAnoPorDateString(data);

			return stringToDate(Integer.toString(ultimoDia) + "/"
					+ mes + "/" + ano, "dd/MM/yyyy");

		} catch (Exception e) {
			throw e;
		}
	}
	
	public static boolean verificaDataIsFinalDesemana(Date data) {
		if(getDiasDaSemanaDescritivo(data).equals(Constantes.LABEL_SABADO) ||
		  getDiasDaSemanaDescritivo(data).equals(Constantes.LABEL_DOMINGO)){
			return true;
		} else {
			return false;
		}
			
	}
	
	public static String dateToString(Date data, String formatoDestino)
			throws Exception {

		String dataString = "";
		try {
			if(data != null){
				SimpleDateFormat sdfDestino = new SimpleDateFormat(formatoDestino);
				dataString = sdfDestino.format(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

		return dataString;
	}
	
	
	public static Date acrescendarDataEmDias(Date dataInserida, int numeroDeDias) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInserida);
		calendar.add(Calendar.DAY_OF_MONTH, numeroDeDias);

		return calendar.getTime();
	}

	public static Date acrescendarDataEmHoras(Date dataInserida,
			int numeroDeHoras) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInserida);
		calendar.add(Calendar.HOUR_OF_DAY, numeroDeHoras);

		return calendar.getTime();
	}

	public static Date acrescendarDataEmMinutos(Date dataInserida,
			int numeroDeMinutos) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInserida);
		calendar.add(Calendar.MINUTE, numeroDeMinutos);

		return calendar.getTime();
	}
	
	public static Date retirarDataEmMinutos(Date dataInserida,
			int numeroDeHoras) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInserida);
		calendar.add(Calendar.MINUTE, -numeroDeHoras);

		return calendar.getTime();
	}
	
	public static Date acrescendarDataEmMeses(Date dataInserida,
			int numeroDeAnos) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInserida);
		calendar.add(Calendar.MONTH, numeroDeAnos);

		return calendar.getTime();
	}

	
	public static Date retirarDataEmMeses(Date dataInserida, int numeroDeDias) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInserida);
		calendar.add(Calendar.MONTH, -numeroDeDias);

		return calendar.getTime();
	}

	public static Date acrescendarDataEmAno(Date dataInserida, int numeroDeAnos) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInserida);
		calendar.add(Calendar.YEAR, numeroDeAnos);

		return calendar.getTime();
	}

	public static Date retirarDataEmAnos(Date dataInserida, int numeroDeDias) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInserida);
		calendar.add(Calendar.YEAR, -numeroDeDias);

		return calendar.getTime();
	}

	public static Date retirarDataEmDias(Date dataInserida, int numeroDeDias) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInserida);
		calendar.add(Calendar.DAY_OF_MONTH, -numeroDeDias);

		return calendar.getTime();
	}

	public static Date retirarDataEmHoras(Date dataInserida, int numeroDeDias) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInserida);
		calendar.add(Calendar.HOUR_OF_DAY, -numeroDeDias);

		return calendar.getTime();
	}

	
	
	 
	 public static void main(String[] args) {
		 try {
			
			 
			 List<Date> lista = getDatasPorSemana(getDataInicioDoMes(new Date()), 
					 										getDataFimDoMes(new Date()), 
					 										Constantes.SEGUNDA);
		 
			 for(Date data : lista){
				 System.out.println(dateToString(data, "dd")); 				
			 }
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }


	 public static Date getDataInicializandoHoras(Date data,String hora) throws Exception {
		 try {
			 int ano = DataUtil.getAnoPorDate(data);
			 String mes =   DataUtil.getMesPorDate(data);
			 int dia = DataUtil.getDiaPorDate(data);
			 //DataUtil.getHoraPorDate(dataHoje);
			 return DataUtil.stringToDate(dia + "/" + mes + "/" + ano + " " + hora, "dd/MM/yyyy HH:mm");
		 } catch (Exception e) {
			 e.printStackTrace();
			 throw e;
		 }
	 }	 	
}
