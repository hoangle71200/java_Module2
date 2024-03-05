package CaseStudy.View;

import Baitap20_2_1.input.Input;
import CaseStudy.Controller.UserController;
import CaseStudy.IOFile.IOFileUser;
import CaseStudy.Model.User;

public class FormMenu {
    static User currentUser = null;
    UserController userController = new UserController();
    public void showFormMenu() {
        FormCharacter formCharacter = new FormCharacter();
        FormUser formUser = new FormUser();
        int choice;
        do {
            System.out.println("======== Welcome user " + currentUser.getUsername() + " ========");
            System.out.println("======== Menu ========");
            System.out.println("1.Character Menu");
            System.out.println("2.User Menu");
            System.out.println("3.Change Password");
            System.out.println("4.Log Out");
            System.out.println("Enter choice: ");
            choice = Input.getNumber();
            switch (choice) {
                case 1:
                    formCharacter.showFormCharacter();
                    break;
                case 2:
                {
                    if (currentUser.getPosition().equals("admin")) {
                        formUser.showFormUser();
                        break;
                    } else {
                        System.out.println("You 're not Admin, Can't use this Service");
                        break;
                    }
                }
                case 3:
                    changePassword();
                    break;
                case 4:
                    currentUser = null;
                    return;
            }
        } while (choice != 0);
    }
    public void changePassword() {
        System.out.println("Enter new password");
        String newPassword = Input.getString();
        System.out.println("Rewrite new password");
        String newPassword2 = Input.getString();
        if (newPassword.equals(newPassword2)) {
            User editPasswordUser = new User(currentUser.getId(), currentUser.getUsername(), newPassword, currentUser.getPosition());
            userController.edit(currentUser.getId()-1, editPasswordUser);
            IOFileUser.writeFileUser(userController.findAll());
            System.out.println("Change password Success");
        } else {
            System.out.println("Wrong password");
        }
    }
}
