package domain;

import lombok.Data;

@Data
public class Catdog {

	//フィールド
	private Integer id;
	private String animal;

	//コンストラクタ
	public Catdog() {

	}

	public Catdog(Integer id, String animal) {
		this.id = id;
		this.animal = animal;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}
}
