/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package immobilier.utilities;

import java.util.HashMap;

/**
 *
 * @author Youcode
 */
public class UsersAccount {
   public static HashMap<String, String> Users = new HashMap<String, String>();

   public static void createUser(String userName,String password){
      Users.put(userName, password);
   }
}
