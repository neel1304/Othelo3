package in.othelo.othelo.Model;

public class Users
{
    private String name,phone,password;
    public Users()
    {

    }
    public Users(String name,String phone,String password)
    {
        this.name=name;
        this.phone=phone;
        this.password=password;
    }
    public String getName()
    {
        return name;
    }
    public void setName()
    {
        this.name=name;
    }
    public String getPhone()
    {
        return phone;
    }
    public void setPhone()
    {
        this.phone=phone;
    }
    public String getPassword()
    {
        return password;
    }
    public void setPassword()
    {
        this.password=password;
    }

}
