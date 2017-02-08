package Chapter3SelfTestQuestionsSCJP;

class CardBoard {

    Short story = 200;

    CardBoard go(CardBoard cb) {
        cb = null;
        return cb;
    }

    public static void main(String[] args) {
        CardBoard c1 = new CardBoard();
        CardBoard c2 = new CardBoard();
        CardBoard c3 = c1.go(c2);
        c1 = null;
// do Stuff
    }
}

//look up before seeing a solution
//When // doStuff is reached, how many objects are eligible for GC?
//A. 0
//B. 1
//C. 2
//D. Compilation fails
//E. It is not possible to know
//F. An exception is thrown at runtime


//Solution
//Exactly C because c1 were initialized with null  and the object itself associated has Short wrapper which is eligible for gc