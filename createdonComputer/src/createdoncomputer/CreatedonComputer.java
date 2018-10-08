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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    T t1=new T();
    T t2=new T("birinci string parametere");
    T t3=new T("birinci parametere ve hemen devamında int deger 55", 55);
    }
    
}
class T{
    public T(){
        System.out.println("yapılandırıcı metodsuz");
    }
    public T(String a){
        System.out.println("küçücük bir parametrre alan yordam alınana parametere String "+a);
    }
    public T(String a,int x){
        System.out.println("iki parametere alan bir yapılandırcı String "+a+"  ve int deger "+x);
    }
}
