public class Person{

    // atribute dari class Person

    public String name;         // public <type data> name      --> Attribute 1
    public String birthDate;    // public <type data> birthDate --> Attribute 2
    public String department;
    public String major;
    public int age;
    public double height;
    public double weight;
    public int distance;
    public double time;         

    // end attribute but not stop with }
public static void main(String[] args){ // start main function

    System.out.println("");
    System.out.println("* Data Class Person *");
    double speed = 80.0;
    Person person1 = new Person();             // mengubah class menjadi sebuah object
    person1.setName("Ryan Roshandy Sachio");   // membuat setter
    String name = person1.getName();           // membuat getter
    System.out.println("Name       = " +name);  // Execute properties
    
    //Person test1 = new Person();
    person1.setbirthDate("26/10/2002");
    String birthDate = person1.getbirthDate();
    System.out.println("Birth Date = " +birthDate);

    //Person test2 = new Person();
    person1.setdepartment("IBIK Kesatuan Bogor");
    String department = person1.getdepartment();
    System.out.println("Departemen = " +department);

    //Person test3 = new Person();
    person1.setmajor("IT");
    String major = person1.getmajor();
    System.out.println("Major      = " +major);

    //Person test4 = new Person();
    person1.setage(18);
    int age = person1.getage();
    System.out.println("Age        = " +age+ " years");

    //Person test5 = new Person();
    person1.setheight(167.7);
    double height = person1.getheight();
    System.out.println("height     = "+height+" Cm");

    //Person test6 = new Person();
    person1.setweight(75.6);
    double weight = person1.getweight();
    System.out.println("Weight     = "+weight+" Kg");

    //Person test7 = new Person();
    person1.setdistance(1);
    int distance = person1.getdistance();
    
    //Person test8 = new Person();
    person1.settime(distance/speed);
    double time = person1.gettime();

    System.out.println("Distance = " +distance+" Km");
    System.out.println("Time     = " +time+ " menit");
    System.out.println("");
    System.out.println("");
   /** 
    System.out.println("Distance from house to Campus = " +distance+ " Km");
    System.out.println("Jika saya menuju kampus menggunakan motor dengan"); 
    System.out.println("kecepatan 80 km/jam berapakah waktu yang dibutuhkan"); 
    System.out.println("untuk sampai ke kampus?");
    System.out.println("");
    System.out.println("untuk mencari jarak gunakan Jarak/Kecepatan");
    System.out.println("Time = "+time+" minute");
    System.out.println("");
   */
    //end main function

}

    // start setter & getter

    public void setName(String a){  // memasukan perintah setter
         this.name = a;
    }
    public String getName(){        // memasukan perintah getter
        return this.name;
    }

    public void setbirthDate(String b){
        this.birthDate = b;
    }
    public String getbirthDate(){
        return this.birthDate;
    }

    public void setdepartment(String c){
        this.department = c;
    }
    public String getdepartment(){
        return this.department;
    }

    public void setmajor (String d){
        this.major = d;
    }
    public String getmajor(){
        return this.major;
    }

    public void setage(int e){
        this.age = e;
    }

    public int getage(){
        return this.age;
    }

    public void setheight(double f){
        this.height = f;
    }
    public double getheight(){
        return this.height;
    }

    public void setweight(double g){
        this.weight = g;
    }
    public double getweight(){
        return this.weight;
    }

    public void setdistance(int h){
        this.distance = h;
    }
    public int getdistance(){
        return this.distance;
    }

    public void settime(double i){
        this.time = i;
    }
    public double gettime(){
        return this.time;
    }

    // end setter & getter
}
/**
public class Person{

    // atribute dari class Person

    public String name;         // public <type data> name      --> Attribute 1
    public String birthDate;    // public <type data> birthDate --> Attribute 2
    public String department;
    public String major;
    public String age;
    public String height;
    public String weight;
    public double distance;
    public double time;

    public static void main(String[]args){
        int speed = 80;
        Person person_Obj = new Person();
        person_Obj.setInformation("Nama : Ryan Roshandy Sachio", "\nBirth Date : 26-10-2002", // SetInformation - set
        "\nMajor : IT","\nAge : 18","\nHeight : 167.7","\nWeight : 75.5");

        System.out.println(person_Obj.getInformation());
        person_Obj.distance = 0.5;
        person_Obj.time = person_Obj.distance/speed;
        person_Obj.setDistanceTime(person_Obj.distance ,person_Obj.time);
        System.out.println(person_Obj.getDistanceTime());

    }

    public void setInformation(String a, String b, String c, String d, String e, String f){
        this.name = a;
        this.birthDate = b;
        this.major = c;
        this.age = d;
        this.height = e;
        this.weight = f;
    }

    public String getInformation(){
        return this.name+this.birthDate+this.major+this.age+this.height+this.weight;
    }

    public void setDistanceTime(double xx, double yy){
        this.distance = xx;
        this.time =yy;
    }

    public String getDistanceTime(){
        return "Distance: " +String.valueOf(this.distance)+ "\nTime : " +String.valueOf(this.time);
    }

}
*/