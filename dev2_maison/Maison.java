public class Maison {
    //Instances de la maison
    
    String Adresse;
    int Nb_piece;
    double Prix;
    int year;
    Types type;
    
    //Types de maison en enumeration
    
    private enum Types {
        jumelée ("jumelée"), duplex ("duplex"), triplex ("triplex"), individuelle ("individuelle");
        private String type;
        private Types(final String types){
            this.type=types; 
        }
         
       
        public String toString(){
            return type;
        } 
    }
    
    //Constructeur de la Maison avec les parametres
    public Maison(final String Uneadresse,final int Despieces,final double unprix,final int Uneannee,Types type)
    {
         Adresse = Uneadresse;
         Nb_piece = Despieces;
         Prix = unprix;
         year = Uneannee;
    }
    //Mutateur pour le prix 
    public void setPrix(final int Price ) {
        
        Prix=Price;
    }
     
        //Accesseur pour l’année de construction ; 
public int getyear(final int year ) {
    return year;
}
//ToString pour le return d'informations
    public String toString() 
    {        return "Adresse : " + Adresse +" Nombre de pieces "+Nb_piece+ " Année : " + year + " Prix : " + Prix+ " types : "+type; }
    
}
