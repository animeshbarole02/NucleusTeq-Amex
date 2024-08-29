public class Customer {
   private int id;
   private String name;
   private Gender gender;

   public Customer(int id, String name, Gender gender) {
      this.id = id;
      this.name = name;
      this.gender = gender;
   }

   public Gender getGender() {
      return gender;
   }
}