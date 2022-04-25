package clone;

public class E implements Cloneable{
    public Object clone(){
        try {
            return super.clone();
        }catch (CloneNotSupportedException e){
            return null;
        }

    }
}
