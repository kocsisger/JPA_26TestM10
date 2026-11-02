package hu.unideb.inf;

public class AnimalManager {

    public static AnimalDAO aDAO;

    public static void setaDAO(AnimalDAO aDAO) {
        AnimalManager.aDAO = aDAO;
    }

    public static void manageAnimals(){
        Animal animal = new Animal("Tiger", 10, Animal.GenderType.MALE);
        Animal animal2 = new Animal("Bear", 20, Animal.GenderType.FEMALE);

       // aDAO.saveAnimal(animal);
       // aDAO.saveAnimal(animal2);

        Zoo zoo = new Zoo();
        zoo.setName("Debrecen Zoo");
        zoo.getAnimals().add(animal);
        zoo.getAnimals().add(animal2);

        aDAO.saveZoo(zoo);
    }
}
