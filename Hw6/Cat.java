package lesson6.Hw6;

 class Cat extends Animal {

     public Cat(String name) {
         super();
     }
     @Override
    public void run(int runDistance) {
         if(runDistance <= 200) {
             System.out.println("Кот " + name + " пробежал " + runDistance + "м");
         } else {
             System.out.println("Кот не бегает так далеко");
         }
    }
    @Override
    public void swim(int swimDistance) {
        System.out.println("Кот не умеет плавать");
    }
}
