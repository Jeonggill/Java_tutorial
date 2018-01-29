package Algorithmus_test;

class count {
	
	private String word;
	private int count;
	
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "{ " + word + ", " + count + "}" ;
	}
	@Override
	public boolean equals(Object obj){
		
	}

      
}
