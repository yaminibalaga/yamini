package serialization;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws Exception{
		
			
		Dog d1= new Dog();
		try {
			FileOutputStream fos= new FileOutputStream("dxc.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(d1);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//deserializtion
		
		FileInputStream fis;
		
		try {
			fis= new FileInputStream("dxc.txt");
			
			ObjectInputStream ois= new ObjectInputStream(fis);
			Dog d2= (Dog)ois.readObject();
			System.out.println(d2.i+"\t"+d2.j);
			
		} catch (FileNotFoundException e)  {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)  {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
