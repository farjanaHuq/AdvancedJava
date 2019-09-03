package lesson.fourteen;

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
