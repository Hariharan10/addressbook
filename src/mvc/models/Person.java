/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.models;

/**
 *
 * @author Admin
 */
public class Person {
    private String name;
    private String mob;
    private String email;
    private String facebookid;
    
    
   /* public User(){
        x=0;
    }
    
    public User(int x){
        this.x=x;
    }
    
    public void incX(){
        x++;
    }
    
    public void decX(){
        x--;
    }
    public int getX(){
        return x;
    }*/
    public String getName(){
        return this.name; 
   }
    
    public String getMob(){
        return this.mob; 
   }
    
    public String getEmail(){
        return this.email; 
   }
    
    public String getFacebookid() {
        return this.facebookid; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public void setData(String name, String mob,String email,String facebookid){
        this.name = name;
        this.mob = mob;
        this.email = email;
        this.facebookid = facebookid;
    }

    /**
     *
     * @param name
     * @param mobile
     * @param email
     */
    public void setData(String name, String mobile, String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getfacebookid() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

  
}
