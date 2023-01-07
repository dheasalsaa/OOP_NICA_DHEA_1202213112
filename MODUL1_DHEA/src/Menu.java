public class Menu {
    Database database = new Database();
    do {
        database.show_menu();

        switch (database.insert_menu()) {
            System.out.println("Menu");
            
        }
    }
    // TODO Create Attribute of Menu; Name, Category, and Price then Create Setter

}
