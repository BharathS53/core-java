public class PetAnimalsRunner {
    public static void main(String args[]){
        PetAnimals petAnimals=new PetAnimals();
        System.out.println(petAnimals.getName());
        System.out.println(petAnimals.getAge());
        petAnimals.setName("Dog");
        String name=petAnimals.getName();
        System.out.println(name);

        petAnimals.setAge(3);
        int age=petAnimals.getAge();
        System.out.println(age);
    
    }
    
}
