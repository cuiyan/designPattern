package prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ArrayListToDeepClone {
	
	
	 public static void main(String[] args) {
		 List<Book> bookList1 = new ArrayList<Book>();
		 List<Book> bookList2 = null;
	     ArrayListToDeepClone clone = new ArrayListToDeepClone();
	     Book book = new Book(17.8,"天涯一别，勿忘心安","钟小书");
	     bookList1.add(book);
	     try {
	    	 bookList2 = clone.deepCopy(bookList1);
	     } catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
	     }
	     System.out.println(bookList2.get(0).getBookName()+":"+bookList2.get(0).getPrice()+":"+bookList2.get(0).getAuthor());
	 }
	
	
	/**
     * 深层拷贝对象
     * 
     * @param src
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    @SuppressWarnings("rawtypes")
    public List deepCopy(List src) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(byteOut);
        out.writeObject(src);
 
        ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
        ObjectInputStream in = new ObjectInputStream(byteIn);
        List dest = (List) in.readObject();
        return dest;
    }
}