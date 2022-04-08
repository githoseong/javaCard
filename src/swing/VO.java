package swing;

public class VO {
	public int idx;
	public String id;
	public String pwd;
	public String mail;
	public String champ;
	public int win;
	public int lose;
	
	public VO() {
	}	
	
	
	
	public int getLose() {
		return lose;
	}



	public void setLose(int lose) {
		this.lose = lose;
	}



	public int getWin() {
		return win;
	}


	public void setWin(int win) {
		this.win = win;
	}


	public VO(int idx, String id, String pwd, String mail, String champ) {
		super();
		this.idx = idx;
		this.id = id;
		this.pwd = pwd;
		this.mail = mail;
		this.champ = champ;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getChamp() {
		return champ;
	}

	public void setChamp(String champ) {
		this.champ = champ;
	}



	@Override
	public String toString() {
		return "VO [idx=" + idx + ", id=" + id + ", pwd=" + pwd + ", mail=" + mail + ", champ=" + champ + ", win=" + win
				+ ", lose=" + lose + "]";
	}


	
	
	
	
}
