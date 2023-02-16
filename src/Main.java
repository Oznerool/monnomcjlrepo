import com.animalerie.Chat;
import com.animalerie.Chien;

import java.util.Random;

public class Main {
//    public static void main(String[] args) {

//        Chien dog = new Chien("charo", 20, "doritos", "Jean-Luc", true);
//        dog.setType("chien");
//        System.out.println(dog.toString());
//        System.out.println(dog.attaque(true));
//
//        Scanner name = new Scanner(System.in);
//        System.out.println("Veuillez saisir un prenom :");
//        String strname = name.nextLine();
//        Scanner surname = new Scanner(System.in);
//        System.out.println("Veuillez saisir un nom :");
//        String strsurname = surname.nextLine();
//        System.out.println("Vous avez saisi : " + strname);
//        System.out.println("Vous avez saisi : " + strsurname);

//    }


    static void main(String[] args) {
        Chien chien = new Chien();
        Chat chat = new Chat();
        if (tirageausort().equals("chien")){
            chien.Action();
        }else {
            chat.Action();
        }
    }

    static String tirageausort() {
        Random r = new Random();
        if (r.nextInt((1) + 1) == 1) {
             return "chien";
        } else {
            return "chat";
        }
    }


}