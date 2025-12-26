public class runnable {
      public static void main(String[] args) {
        Runnable obj1=()->  //Lamda Expression
          {
              for(int i=0;i<5;i++)
              {
                System.out.println("hi");
                try {
                    Thread.sleep(50);
                } catch (Exception e) {
                  System.out.println(e.getMessage());
                }

              }
          };
          Runnable obj2=()->
          {
              for(int i=0;i<5;i++)
              {
                System.out.println("hello");
                try {
                    Thread.sleep(50);
                } catch (Exception e) {
                  System.out.println(e.getMessage());
                }

              }
          };
          Thread t1=new Thread(obj1);
          Thread t2=new Thread(obj2);
          
          t1.start();
          t2.start();

        
      }
}
