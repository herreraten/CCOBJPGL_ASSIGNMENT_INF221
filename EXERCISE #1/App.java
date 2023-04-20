public class App {


    static boolean iwillNotCheat  = true;
    static boolean iwillWin = true;


    public static void main(String[] args) throws Exception {


    App myApp = new App();


    //precondition
    assert iwillNotCheat == true: "eme ka!";


    myApp.enterCompetition();


    //postcondition
    assert iwillWin == true: "true sis!";


 }
   static void enterCompetition(){


     iwillWin = false;
   }


}
