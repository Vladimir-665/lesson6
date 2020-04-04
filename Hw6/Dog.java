package lesson6.Hw6;

 class Dog extends Animal {

     @Override
    public void run(int runDistance) {
         if(runDistance <= 500) {
             System.out.println("Собака пробежала " + runDistance + "м");
         } else {
             System.out.println("Собака не бегает так далеко");
         }
    }
     @Override
     public void swim(int swimDistance) {
         if(swimDistance <= 10) {
             System.out.println("Собака проплыла " + swimDistance + "м");
         } else {
             System.out.println("Собака не плавает так далеко");
         }
     }
}
