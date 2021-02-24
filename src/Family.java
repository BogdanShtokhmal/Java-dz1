import java.util.Arrays;

public class Family {
    private String father;
    private String mother;
    private String wife;
    private String[] children;

    public Family(){

    }

    public Family(String father, String mother, String wife, String[] children){
        this.father=father;
        this.mother=mother;
        this.wife=wife;
        this.children=children;
    }

    public String getFather(){
        return father;
    }
    public void setFather(String father){
        this.father=father;
    }

    public String getMother(){
        return mother;
    }
    public void setMother(String mother){
        this.mother=mother;
    }

    public String getWife(){
        return wife;
    }
    public void setWife(String wife){
        this.wife=wife;
    }

    public String[] getChildren(){
        return children;
    }
    public void setChildren(String[] children){
        this.children=children;
    }

    public String toString(){
        return "father-"+father+" "+"mother-"+mother+" "+"wife-"+wife+" "+"children:"+Arrays.toString(children);
    }
}
