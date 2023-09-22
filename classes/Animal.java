// Animal.java
public class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Cat.java
public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat quarrels.");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();        
        animal.makeSound();
        cat.makeSound();
    }
}

public static String GMTDateToLocalString(Date d, String tzid) {
  SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
  sdf.setTimeZone(TimeZone.getTimeZone(tzid));
  return sdf.format(d);
}

public static Date LocalStringToGMTDate(String s, String tzid) {
  SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
  sdf.setTimeZone(TimeZone.getTimeZone(tzid));
  try {
    return sdf.parse(s);
  } catch (Exception e) {
    return null;
  }
}
