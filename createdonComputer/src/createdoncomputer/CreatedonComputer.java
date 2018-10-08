/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createdoncomputer;

/**
 *
 * @author root
 */
public class CreatedonComputer extends T {
    final  int x;
    public void ekranabas(String yazi){
        System.out.println("cratea ekranaa basıldı "+yazi);
    }
    public CreatedonComputer(int sayi1){
        super(sayi1-1);
        
        System.out.println(" selam ben Createdoncomputer sınıfı "+sayi1);
   x=4;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   CreatedonComputer c1=new CreatedonComputer(5);
   
   c1.ekranabas("para"); 
   System.out.println("Create içindeki static int x degeri : "+c1.x);
   // T t2=new T("birinci string parametere");
  //  T t3=new T("birinci parametere ve hemen devamında int deger 55", 55);
    //    System.out.println(t1.toString());
    }
    
}
class T extends C{
    public  void ekranabas(String yazi){ // if i wirte here final i cant ovverding in other extends class
        System.out.println("class T ekrana basıldı. "+yazi);
    }
    
    public T(int sayi1){
        super(sayi1-1);
        System.out.println("merhaba ben T sınfı "+ sayi1);
    }
    
   
}
class C{
    public C(int sayi1){
        System.out.println(" selam ben c sınıfı "+ sayi1);
    }
}
