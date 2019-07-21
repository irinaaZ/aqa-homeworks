package lesson10;

public class RegistrationPageBuilder{
    private String email;
    private String password;
    private String zip;
    private String city;
    private String country;
    private String address;
    private String phone;
    private String firstName;
    private String lastName;
    private String mobile;

    public RegistrationPageBuilder withEmail(String email){
        this.email = email;
        return this;
    }

    public RegistrationPageBuilder withPassword(String password){
        this.password = password;
        return this;
    }

    public RegistrationPageBuilder withZip(String zip){
        this.zip = zip;
        return this;
    }

    public RegistrationPageBuilder withCity(String city){
        this.city = city;
        return this;
    }

    public RegistrationPageBuilder withAddress(String address){
        this.address = address;
        return this;
    }

    public RegistrationPageBuilder withPhone(String phone){
        this.phone = phone;
        return this;
    }

    public RegistrationPageBuilder withCountry(String country){
        this.country = country;
        return this;
    }

    public RegistrationPageBuilder withFirstName(String firstName){
        this.firstName = firstName;
        return this;
    }

    public RegistrationPageBuilder withLastName(String lastName){
        this.lastName = lastName;
        return this;
    }

    public RegistrationPageBuilder withMobile(String mobile){
        this.mobile = mobile;
        return this;
    }

    public RegistrationPageMain build(){
        return new RegistrationPageMain(email,password,zip,city,country,address,phone,firstName,lastName,mobile);
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getZip() {
        return zip;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobile() {
        return mobile;
    }
}
