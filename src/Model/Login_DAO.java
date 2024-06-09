package Model;

import javax.swing.JOptionPane;

public class Login_DAO {
    
    public static void login(){
        String login = Viewe.Login_GUI.login_txt.getText();
        String senha = Viewe.Login_GUI.senha_txt.getText();
        
        
        if (login.equals("1") && senha.equals("2")){
            new Viewe.Sistema_GUI().setVisible(true);
            dispose();
        }
        else{
        JOptionPane.showMessageDialog(null, "Usúario ou senha não combinam");
                }
}
    public static void sair(){
        JOptionPane.showMessageDialog(null, "Encerrando.");
    }

    private static void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    }

