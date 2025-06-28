package corejava;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class ReadDatafromproperties {

	public static void main(String args[]) throws IOException {
	      Properties prop = readPropertiesFile("config.properties");
	      System.out.println("username: "+ prop.getProperty("username"));
	      System.out.println("password: "+ prop.getProperty("password"
	    		  ));
	      
	      try {
			for (Map.Entry<Object, Object> entry : prop.entrySet()) {
				   System.out.println(entry.getKey() + " = " + entry.getValue());
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      String fullName= prop.getProperty("QA_CREATE_ACCOUNT_URL");
	      String surName=fullName.split(" ")[fullName.split(" ").length-1];
	      String firstName = fullName.substring(0, fullName.length() - surName.length());
	      System.out.println("name from prop..."+firstName );
	   }
	   public static Properties readPropertiesFile(String fileName) throws IOException {
	      FileInputStream fis = null;
	      Properties prop = null;
	      String path = System.getProperty("user.dir") + "\\src\\test\\resources\\";
	      try {
	         fis = new FileInputStream(path+fileName);
	         prop = new Properties();
	         prop.load(fis);
	      } catch(FileNotFoundException fnfe) {
	         fnfe.printStackTrace();
	      } catch(IOException ioe) {
	         ioe.printStackTrace();
	      } finally {
	         fis.close();
	      }
	      return prop;
	   }
	}