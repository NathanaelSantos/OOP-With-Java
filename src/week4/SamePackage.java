package week4;

public class SamePackage {
    public void AcessTest() {
        Reference reference = new Reference();

        reference.modifierDefault = 10;
        reference.modifierProtected = 12;
        //reference.modifierPrivate = 15; 'modifierPrivate' has private access in 'week4.Reference'
        reference.modifierPublic = 16;
    }
}
