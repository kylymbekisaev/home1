public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Dori");
        dog.setBreed("borzoi");
        dog.setCommands("barking");
        dog.setAge(6);
        dog.makeVoice("gav",1);
        dog.setColor(Color.BLACK);

        Dog dog1 =new Dog();
        dog1.setName("Finn");
        dog1.setBreed("beagle");
        dog1.setCommands("sound");
        dog1.setAge(8);
        dog1.makeVoice("gav gav",2);
        dog1.setColor(Color.GRAY);

        Dog dog2 = new Dog();
        dog2.setName("Helli");
        dog2.setBreed("vizsla");
        dog2.setCommands("sound!");
        dog2.setAge(5);
        dog2.makeVoice("gav gav gav",3);
        dog2.setColor(Color.WHITE);

        System.out.println(dog.getName());
        System.out.println(dog.getBreed());
        System.out.println(dog.getCommands());
        System.out.println(dog.getAge());
        System.out.println(dog.getColor());

        System.out.println(dog1.getName());
        System.out.println(dog1.getBreed());
        System.out.println(dog1.getCommands());
        System.out.println(dog1.getAge());
        System.out.println(dog1.getColor());

        System.out.println(dog2.getName());
        System.out.println(dog2.getBreed());
        System.out.println(dog2.getCommands());
        System.out.println(dog2.getAge());
        System.out.println(dog2.getColor());


    }
}