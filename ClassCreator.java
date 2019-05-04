import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import ru.smarteps.scl.SCL;

public class Unmarsh {
//	public static Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
	
	public static void main(String[] args) {
		File file = new File("src/new.scd");
		
		JAXBContext jaxbContext;
		SCL tsub = null;
		try {
			jaxbContext = JAXBContext.newInstance(SCL.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			tsub = (SCL) jaxbUnmarshaller.unmarshal(file);
			System.out.println(tsub);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Gson gson = new Gson();
//		Gson g2 = new GsonBuilder().addSerializationExclusionStrategy(new ExclusionStrategy() {
//			
//			@Override
//			public boolean shouldSkipField(FieldAttributes f) {
//				if (f.getName().contains("private") || f.getName().contains("isas")) {
//					return true;
//				}
//				return false;
//			}
//			
//
//			@Override
//			public boolean shouldSkipClass(Class<?> clazz) {
//				return false;
//			}
//		}).create();
//		String gStr = g2.toJson(tsub);
//		
//		 try(FileWriter writer = new FileWriter("json.txt", false))
//	        {
//	            writer.write(gStr);
//	            writer.flush();
//	        }
//	        catch(IOException ex){
//	             
//	            System.out.println(ex.getMessage());
//	        } 
		System.out.println("gStr");
	}
	
	
}
