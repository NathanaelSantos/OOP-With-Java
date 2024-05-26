package week4.packageTestAcess;

import week4.Reference;

public class AnotherPackage {
    public void AcessTest() {
        Reference reference = new Reference();

        //reference.modifierDefault = 10;       'modifierDefault' is not public in 'week4.Reference'. Cannot be accessed from outside package
        //reference.modifierProtected = 12;     'modifierProtected' has protected access in 'week4.Reference'
        //reference.modifierPrivate = 15;       'modifierPrivate' has private access in 'week4.Reference'
        reference.modifierPublic = 16;
    }
}
