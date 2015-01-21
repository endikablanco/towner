import java.util.Timer;
import java.util.TimerTask;


public class Fechas {
	public static int horas = 1;
	public static int dias = 1;
	public static int meses = 1;
	public static int anios = 2015;
	String mesesString = "Enero";

	public String hora(){

		horas++;


		if (horas == 25){
			horas=1;
			dias++;
		}
		if(horas>0 && horas<10){
			return "0" + horas;
		}
		else
			return String.valueOf(horas);


	}

	public String dia(){


		if (dias == 31){
			meses++;
			dias=1;
		}
		
		if(dias>0 && dias<10){
			return "0" + dias;
		}

		return String.valueOf(dias);
	}

	public String mes(){

		switch (meses) {
		case 1:  mesesString = "Ene";
		break;
		case 2:  mesesString = "Feb";
		break;
		case 3:  mesesString = "Mar";
		break;
		case 4:  mesesString = "Abr";
		break;
		case 5:  mesesString = "May";
		break;
		case 6:  mesesString = "Jun";
		break;
		case 7:  mesesString = "Jul";
		break;
		case 8:  mesesString = "Aug";
		break;
		case 9:  mesesString = "Sep";
		break;
		case 10: mesesString = "Oct";
		break;
		case 11: mesesString = "Nov";
		break;
		case 12: mesesString = "Dic";
		break;
		default: mesesString = "Inv";
		break;

		} 

		if (meses == 13){
			meses=1;
			anios++;
		}

		return mesesString;
	}






	public int anios(){
		return anios;
	}

	public String mensaje(){
		return anios() + "/" + mes() + "/" + dia() + " " + hora()+":00";
	}


}