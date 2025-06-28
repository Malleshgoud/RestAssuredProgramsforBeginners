package corejava;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDatafromPropertiesfromEnvFolder {

	public static void main(String args[]) throws IOException {
	      Properties prop = readPropertiesFile("config.properties");
	      System.out.println("username: "+ prop.getProperty("username"));
	      System.out.println("password: "+ prop.getProperty("password"));
	      
	      String fullName= prop.getProperty("QA_CREATE_ACCOUNT_URL");
	      String surName=fullName.split(" ")[fullName.split(" ").length-1];
	      String firstName = fullName.substring(0, fullName.length() - surName.length());
	      System.out.println(firstName );
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