package user_defined_pakages;

//to access the sub folder/package of a folder the syntax is:
//  package folder_name.sub_folder_name;

public class AAA1 {

    int num = 19;

    public void dispaaa1() {
        System.out.println("This is the method of class AAA1 of user_defined_packages's package");
        System.out.println("The number in the class AAA1 is: " + num);
        System.out.println("Remember............\nIf you import a package using fully qualified name, subpackage will not be imported.");
    }
}
