import io.restassured.response.Response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class ReverseNumTest {
    public static void main(String[] args) {
        Response response = given().baseUri("https://dummyjson.com").get("/users").then()
                .extract()
                .response();

        List<Map<String, Object>> users = response.jsonPath().getList("users");
        System.out.println(users.size());
        List<Map<String, Object>> usersWithAgeFiltered =  users.stream().filter(user -> {
            Object ageObj = user.get("age");
            int age = Integer.parseInt(ageObj.toString());
            return age >=25 && age <=30;
        }).toList();
        System.out.println("age " + usersWithAgeFiltered.size());

        List<Map<String, Object>> usersWithHeghtFiltered =  users.stream().filter(user -> {
            Object heightObj = user.get("height");
            double height = Double.parseDouble(heightObj.toString());
            return height >=190 && height <=195;
        }).toList();
        System.out.println("height "+usersWithHeghtFiltered.size());

        List<Map<String, Object>> maleUser =  users.stream().filter(user -> {
            Object genderObj = user.get("gender");
            return genderObj.equals("male");
        }).toList();
        System.out.println("Male User count:  "+maleUser);

        List<Map<String, String>> maleUserWithFirstname =  users.stream().filter(user -> {
            Object genderObj = user.get("gender");
            return genderObj.equals("male");
        }).map(male -> {
            Map<String, String> maleUserMap = new HashMap();
            String fname = male.get("firstName").toString();
            String lname = male.get("lastName").toString();
            maleUserMap.put("firstName", fname);
            maleUserMap.put("lastName",lname);
            return maleUserMap;
        } ).toList();

        System.out.println("This is users with fnama nad lname: "+maleUserWithFirstname);

    }
}
