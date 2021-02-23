/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermreviewcodeforpartc;

/**
 *
 * @author jacob
 */
public class UserNameValidator {
 
    public boolean isValid(String username){
        if(!username.isEmpty()){
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
