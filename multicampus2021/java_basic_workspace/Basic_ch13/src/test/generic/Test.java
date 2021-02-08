package test.generic;

import java.util.ArrayList;
public class Test {
	public static void main(String[] args) {
		Cat cat=new Cat();
		AnimalList<LandAnimal> zoo=new AnimalList<LandAnimal>();
		zoo.add(cat);

		AnimalList<WaterAnimal> zoo2=new AnimalList<WaterAnimal>();
		Fish fish = new Fish();
		zoo2.add(fish);
	}

}

class AnimalList<T>{
	ArrayList<T> al=new ArrayList<T>();//빈상자
	public void cryingAnimalList() {//모든 동물을 울게
		
	}
	public void add(T o) {//동물 추가
		al.add(o);
	}
	public void get(){//동물 리턴
		
	}
	public void remove() {//동물 삭제
		
	}
}

class WaterAnimal{
	public void swim() {
		System.out.println("수중동물");
	}
}

class Fish extends WaterAnimal{
	@Override
	public void swim() {
		System.out.println("물고기");
	}
}

class LandAnimal{
	public void crying() {
		System.out.println("육지동물");
	}
}
class Cat extends LandAnimal{
	@Override
	public void crying() {
		System.out.println("냐옹냐옹");
	}
}
class Dog extends LandAnimal{
	@Override
	public void crying() {
		System.out.println("멍멍");
	}
}
class Sparrow extends LandAnimal{
	@Override
	public void crying() {
		System.out.println("짹짹");
	}
}
