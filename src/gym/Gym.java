/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gym;

/**
 *
 * @author SHADOW
 */
public class Gym {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        splashscreen obj=new splashscreen();
        obj.setVisible(true);
        
        
        login log=new login();
        
        try{
        
            
            for(int i=0;i<=100;i++)
            {
            
                Thread.sleep(10);
                //obj.jLabel2.setText(Integer.toString(i)+"%");
                obj.jProgressBar1.setValue(i);
                
                
                if(i==100)
                {
                    obj.setVisible(false);
                    log.setVisible(true);
                }
            
            }
        }
        catch(Exception e)
        {
        
        }
        
        
    }
    }
    

