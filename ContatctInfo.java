package com.company;

public class ContatctInfo {
    private String Name;
    private String Id;
    private int age;
    private String Gender;
    private String PhoneNumber;

    public ContatctInfo(String name, String id, int age, String gender, String phoneNumber) {
        Name = name;
        Id = id;
        this.age = age;
        Gender = gender;
       this.PhoneNumber = phoneNumber;
    }

   public void detect(String PhoneNumber) {
       if (this.PhoneNumber == "+88017")
       {
           System.out.println("Number is GP" + " " + this.PhoneNumber);
       }
       else if(this.PhoneNumber=="+88018"){
               System.out.println("Number is Robi" + " " + this.PhoneNumber);
           }
       else if(this.PhoneNumber=="+88019"){
           System.out.println("Number is Bl"+" "+this.PhoneNumber);
       }
       else if(this.PhoneNumber=="+88016"){
           System.out.println("Number is Airtel"+" "+this.PhoneNumber);
       }
       else if(this.PhoneNumber=="+88015"){
           System.out.println("Number is Tl"+" "+this.PhoneNumber);
       }
       else{
           System.out.println("wrong number"+" "+this.PhoneNumber);
       }
   }

    public String getName() {
        return Name;
    }

    public String getId() {
        return Id;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return Gender;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setId(String id) {
        Id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "ContatctInfo{" +
                "Name='" + Name + '\'' +
                ", Id='" + Id + '\'' +
                ", age=" + age +
                ", Gender='" + Gender + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                '}';
    }
    public void Show(){
        System.out.println("Name is "+""+Name);
        System.out.println("Gender="+Gender);
        System.out.println("Age="+age);
        System.out.println(this.PhoneNumber);

    }
}
