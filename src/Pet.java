import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Pet {

    private String name;
    private String type;
    private int age;
    private String colour;


    public Pet(String name, String type, int age, String colour) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public String getColour() {
        return colour;
    }

    public void setName(String name) {
        if(name.length()>=2){
            this.name = name;
        }
        else
            throw new IllegalArgumentException(name + " length must be 2.");
    }

    public void setType(String type)
    {
        String typeLower  = type.toLowerCase(Locale.ROOT);
        List<String> types =  Arrays.asList("dog", "cat","reptile", "bird", "fish");
        if(types.contains(typeLower)) {
            this.type = typeLower;
        }
        else{
            throw new IllegalArgumentException(type + " is not valid");
        }
    }

    public void setAge(int age){
        if(age >= 0 && age<=60) {
            this.age = age;
        }
        else {
            throw new IllegalArgumentException(age + " not valid age.");

        }

    }

    public void setColour(String colour) {
        String colourValid = colour.toLowerCase(Locale.ROOT);
        List<String> clours = Arrays.asList("yellow","brown","black","blue","red","white","grey");

        if(clours.contains(colourValid)) {
            this.colour = colourValid;
        }
        else
            throw new IllegalArgumentException(colour  + " is not a valid.");

    }

    public String speak(){
        if(this.name == "dog")
        {
            return "woof woof";
        }
        else if (this.name == "cat")
        {
            return "meow meow";
        }
        else if (this.name == "bird")
        {
            return "chirp chirp";
        }
        else if(this.name == "reptile")
        {
            return "hiss";
        }
        else if(this.name == "fish")
        {
            return "<swimming sound>";
        }
        else {
            return "Invalid";
        }
    }




}
