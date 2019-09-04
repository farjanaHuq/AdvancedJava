package lesson.fourteen;

//Cat is a Subclass of Animal
//You create subclasses with the extends keyword
//Now Cat has all the Methods and Fields that Animal defined
//This is known as inheritance because Cat inherits all
//the methods and fields defined in Animal

public class Cats extends Animal{
   public String favToy = "Yarn";
   
   public void playWith() {
	   System.out.println(this.getName() + " plays with" + favToy);
   }
   
   public void walkAround() {
	   System.out.println(this.getName()+ " stalks around");
   }
   
   public Cats() {}
   
   public Cats(String name, String favFood, String favToy) {
	   super(name, favFood);
	   this.favToy = favToy;
   }
   
}
