package jdbctrainning;

public class Student {
	private int id;
	private int sex;
	private String name;
	private String score;

	public int getId(int id) {
		return this.id = id;
	}
    public int setId(int id) {
    	return this.id = id;
    }

    public int getSex() {
    	return id;
    }
    public void setSex(int sex) {
    	this.sex = sex;
    }

    public String getName() {
    	return name;

    }
    public void setName(String name) {
    	this.name = name;
    }
    public String getScore() {
    	return score;
    }
    public void setScore(String score) {
    	this.score = score;
    }
}
