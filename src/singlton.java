public class singlton {
  //holds single instatance
    private static singlton instance=null;
  // private constructor to prevent other objects
    private singlton(){

    }
// return single instance
// Make instance
    public static singlton getInstance(){
//initalize
         if(instance==null){

           instance = new singlton();

         }

         return instance;


    }

    public void print(){
        System.out.println("welcome, with singleton");
    }


    public static void main(String [] args)
    {

        singlton s1 = new singlton();
        singlton s2 =new singlton();
        s1.print();

    }






}
