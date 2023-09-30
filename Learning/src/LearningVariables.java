class LearningVariables {
    // class variable (static field)
    // one copy of this variable in existence
    // the value will apply to every instance even if changed
    static int SameAcrossAllInstances = 5;
    int nonStatic = 10;
    public void staticVar() {
        System.out.println(SameAcrossAllInstances);
    }

    // local variables
    // methods store their temporary states in local variables
    // they are only visible and accessible in the methods in which they are declared
    public int changeVar() {
        int localvar = 5;
        localvar += 2;
        return SameAcrossAllInstances += 5;
    }

    public int changeNonStatic(int a) {
        return nonStatic += a;
    }

    public void printNonStatic() {
        System.out.println("Printing non static var: " + nonStatic);
    }

    public static void main(String[] args) {
        LearningVariables learning = new LearningVariables();
        learning.staticVar();
        learning.changeVar();
        learning.staticVar();

        // instance variables (non-static fields)
        // objects store their individual states in "non-static fields"
        // their values are unique to each instance
        learning.changeNonStatic(5); // this change will not after the value of another instance
        learning.printNonStatic(); // should now be 15

        LearningVariables learning2 = new LearningVariables();
        learning2.staticVar();
        learning2.changeVar();
        learning2.staticVar();

        learning2.changeNonStatic(15);
        learning2.printNonStatic(); // should now be 25
    }
}