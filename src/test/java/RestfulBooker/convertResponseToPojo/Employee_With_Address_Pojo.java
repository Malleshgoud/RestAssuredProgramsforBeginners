package RestfulBooker.convertResponseToPojo;

import RestfulBooker.PojoExamples.nestedJsonObjects.Address;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee_With_Address_Pojo {
    private String firstName;
    private String lastName;

    private String profession;
    private List<Address_Pojo> address; // ← array, not single object

    public List<Address_Pojo> getAddress() {
        return address;
    }

    public void setAddress(List<Address_Pojo> address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

}
