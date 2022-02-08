package utils;

import com.google.common.annotations.VisibleForTesting;
import net.bytebuddy.utility.RandomString;

import java.util.Random;

public class RandomGenerator {

    public static void main(String args[])
    {
        Random rand = new Random();  //Random class
        int randPhoneNo = rand.nextInt(1000); //range 0-1000
        String phoneNo =("989645"+randPhoneNo);
        System.out.println("random phone no :" +phoneNo);

        }



    /*public  static  String getRandomString(String name) //FUNCTION FOR GENERATING  RANDOM NAME
    {
        String randomString = null; //if am passing a name, that name with 4/5 strings will be generated
        //code to generate random string
        return  randomString;
    }*/
}
