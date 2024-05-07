package practice3.model.vo;
// Annimal extends
public class Rabbit extends Animal {
//필드
	private int weight;
	private String color;
	
//메서드
	
	//Setter
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//Getter
	
	public int getWeight() {
		return weight;
	}
	public String getColor() {
		return color;
	}
	//생성자 : 기본
	public Rabbit() {
	
	}
	//생성자 : 필수 부모클래스에서 있는 필드 추가
	public Rabbit(String name, String kinds, int weight, String color) {
		super(name, kinds);
		this.weight = weight;
		this.color = color;
	}
	
	//@override speak 가지고와서 출력하기
	@Override
	public void speak() {
		System.out.println(super.toString() + "토끼의 무게 " + weight + ", 토끼의 털색 : "+ color +"입니다.");
	}
	
}
