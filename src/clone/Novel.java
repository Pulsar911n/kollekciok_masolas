package clone;

public class Novel extends E{
    private Writer writer;
    private Writer mark;
    public Object clone(){
        Novel n3 = (Novel)super.clone();
        n3.writer = writer;
        n3.mark = mark;
        return n3;
    }
}
