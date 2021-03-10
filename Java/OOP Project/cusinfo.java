package proj_oop;

import javax.swing.JOptionPane;
public class cusinfo {
    static String id;
    static String pass;
    static String name;
    static String surname;
    public cusinfo(){
    }
    public void setid(String id){
        this.id = id;
    }
    public void setpass(String pass){
        this.pass = pass;
    }
    public void setname(String name){
        this.name = name;
    }
    public void setsurname(String surname){
        this.surname = surname;
    }


   
    public String getid(){
        return (id);
    }
    public String getpass(){
        return (pass);
    }
    public String getname(){
        return (name);
    }
    public String getsurname(){
        return (surname);
    }



}
