public final class Dog extends Pet{
    private String name;
    private String breed;
    private String commands;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

    public Dog() {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
    }
    public Dog(String name, String breed,Color color,Shelter shelter) {
        this.name = name;
        this.breed = breed;
    }
    public Dog(String name, String breed,Color color,Shelter shelter, String commands) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
    }

    void makeVoice(String voice, int number){
        System.out.println("gav");
        System.out.println(1);

    }


    public String getInfo() {
        return "naim: " + name + " breed: " + breed + "commands: " + commands;
    }

}
