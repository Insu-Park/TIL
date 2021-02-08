package test.generic;

import java.util.ArrayList;
import java.util.List;
public class Test {
	public static void main(String[] args) {
		
		AnimalList<LandAnimal> zoo=new AnimalList<LandAnimal>();
		
		Cat cat=new Cat();
		Dog dog=new Dog();
		zoo.add(cat);
		zoo.add(dog);
		AnimalList<WaterAnimal> zoo2=new AnimalList<WaterAnimal>();
		Fish fish = new Fish();
		zoo2.add(fish);
		
		AnimalList.cryingAnimalList(zoo);
	}

}

class AnimalList<T>{
	ArrayList<T> al=new ArrayList<T>();//빈상자
	
	static public void cryingAnimalList(AnimalList<? extends LandAnimal> al) {//모든 동물을 울게
		
		int index=0;
		while(index<1000) {
			try {
				LandAnimal la = al.get(index);
				la.crying();
			}
			catch(IndexOutOfBoundsException e) {
				
			}
			index++;
		}
	}
	public void add(T o) {//동물 추가
		al.add(o);
	}
	
	public T get(int index){//동물 리턴
		return al.get(index);
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
