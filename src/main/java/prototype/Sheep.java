package prototype;

import java.util.Date;

public class Sheep implements Cloneable {

    private String name;
    private Date birthday;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object o = super.clone();
        Sheep s = (Sheep) o;
        s.birthday = (Date) this.birthday.clone();
        return o;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
