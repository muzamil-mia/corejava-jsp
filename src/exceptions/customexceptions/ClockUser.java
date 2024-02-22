package exceptions.customexceptions;

public class ClockUser {

	public static void main(String[] args) throws TimeInvalidException {
		Clock obj = new Clock(13,12,12);
		//obj.setHr(13);
		obj.display();
	}

}
