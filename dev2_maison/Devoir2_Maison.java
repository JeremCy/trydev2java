public class Devoir2_Maison {

    public static void main(String[] args) {
        Maison maison1 = new Maison("trois rivieres", 9, 200015, 2010,type.duplex);  
        
        Maison maison2 = new Maison("Chicoutimi", 05, 201006, 2016,"triplex"); 

        System.out.println(maison1);  
        System.out.println(maison2); 

        maison1.setPrix(27000); 
        System.out.println(maison1);

        System.out.println(maison2.getyear(2010)); 
        
        
    }

}