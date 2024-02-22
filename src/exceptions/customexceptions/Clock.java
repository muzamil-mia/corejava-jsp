package exceptions.customexceptions;

public class Clock {
	
	private int hr, min, sec;
	public Clock(int hr, int min, int sec) {
		if((hr >= 1 && hr <= 12) && (min >= 0 && min <= 59 )&& (sec >= 0 && sec <= 59)) {
			this.hr = hr;
			this.min = min;
			this.sec = sec;
		}else {
			try {
				throw new TimeInvalidException("watch cannot be manufactured");
			} catch(TimeInvalidException ex) {
				System.out.println(ex);
			}
		}
	}
	
	public void setr(int hr) {
		if(hr >= 1 && hr <= 12) {
			this.hr = hr;
		}else {
			try {
				throw new TimeInvalidException("invalid hour");
			} catch(TimeInvalidException ex) {
				System.out.println(ex);
			}
		}
	}
	
	public void setMin(int min) {
		if(min >= 0 && min <= 59) {
			this.min = min;
		}else {
			try {
				throw new TimeInvalidException("inavlid min");
			}catch(TimeInvalidException ex) {
				System.out.println(ex);
			}
		}
	}
	public void setSec(int sec) {
		if(sec >= 0 && sec <= 59) {
			this.sec = sec;
		}else {
			try {
				throw new TimeInvalidException("invalid sec");
			}catch(TimeInvalidException ex) {
				System.out.println(ex);
			}
		}
	}
	public void display() {
		System.out.println("hr: " + this.hr + " Min: " + this.min + " Sec: " + this.sec);
	}
}
