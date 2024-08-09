package DailyChallenge;

public class Letters implements Comparable<Letters> {
	char c;
	int freq;
	
	public Letters(char c, int freq) {
		super();
		this.c = c;
		this.freq = freq;
	}


	public char getC() {
		return c;
	}


	public void setC(char c) {
		this.c = c;
	}


	public int getFreq() {
		return freq;
	}


	public void setFreq(int freq) {
		this.freq = freq;
	}


	@Override
	public int compareTo(Letters o) {
		// TODO Auto-generated method stub
		return o.freq - this.freq;
	}


	@Override
	public String toString() {
		return "Letters [c=" + c + ", freq=" + freq + "]";
	}
	

	

}
