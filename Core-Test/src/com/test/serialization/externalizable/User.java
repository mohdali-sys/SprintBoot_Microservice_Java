package com.test.serialization.externalizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class User implements Externalizable {  
    private String name;  
    private int age;  
    public User(){}  
    public User(String userName,int age){  
        this.name= userName;  
        this.age=age;  
    }  
    @Override  
    public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException {  
        name=(String) in.readObject();  
        age=in.readInt();  
    }  
    @Override  
    public void writeExternal(ObjectOutput out) throws IOException {  
        out.writeObject(name);  
        out.writeInt(age);  
    }  
      
    public String getUserName() {  
        return name;  
    }  
    public void setUserName(String userName) {  
        this.name = userName;  
    }  
    public int getAge() {  
        return age;  
    }  
    public void setAge(int age) {  
        this.age = age;  
    }  
}  
