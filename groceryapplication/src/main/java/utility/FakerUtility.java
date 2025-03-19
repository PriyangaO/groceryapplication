package utility;

import com.github.javafaker.Faker;
//faker method is used to generate the faker utlity


public class FakerUtility 
{
   Faker fake= new Faker();
   
   
 public String generateFirstName()
 {
	 return fake.name().firstName();
 }
   
 public String generateLastName()
 {
	 return fake.name().lastName();
 }
 
 
 public String generateEmail()
 {
	 return fake.internet().emailAddress();
 }
   
 public String generateAddress()
 {
	 return fake.address().fullAddress();
 }
 
 public int generateRandomNumber()
 {
	 return (int) fake.number().randomNumber();
 }
 
 public String generatePhno()
 {
	 return fake.phoneNumber().toString();
 }
 
 
}
