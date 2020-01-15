/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jean-Marie Normand (jean-marie.normand@ec-nantes.fr)
 */
public class Point2D {
    
    /**
     * Coordonnee X du point
     */
    private int x;
    
    /**
     * Coordonnee Y du point
     */
    private int y;
    
    // Constructeurs
    
    /**
     * Un constructeur avec deux entiers en parametres.
     * @param x un entier représentant la coordonnee X du point
     * @param y un entier représentant la coordonnee Y du point
     */
    Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Un constructeur sans parametres.
     * On initialise par défaut les coordonnees à (0,0).
     */
    Point2D() {
        this(0,0);
    }
    
    /**
     * Un constructeur de recopie qui recopie un Point2D.
     * @param p un objet de type Point2D
     */
    Point2D(Point2D p) {
        this.x = p.x;
        this.y = p.y;
    }
    
    // Accesseurs
    
    /**
     * Accesseur de l'attribut 'X'
     * @return l'abscisse du point 2D
     */
    public int getX() {
        return this.x;
    }
    
    /**
     * Accesseur de l'attribut 'Y'
     * @return l'ordonnee du point 2D
     */
    public int getY() {
        return this.y;
    }
    
    // Modificateurs
    /**
     * Modificateur de l'attribut 'X'
     * @param x : la nouvelle valeur de la coordonnee X du point
     */
    public void setX(int x) {
        this.x = x;
    }
    
    /**
     * Modificateur de l'attribut 'Y'
     * @param y : la nouvelle valeur de la coordonnee Y du point
     */
     public void setY(int y) {
        this.y = y;
    }
    
    /**
     * Modification des deux attributs a la fois
     * @param x : la nouvelle valeur de la coordonnee X du point
     * @param y : la nouvelle valeur de la coordonnee Y du point
     */
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Modification des deux coordonnees 
     * en fonction de celles d'un autre objet de type Point2D
     * @param p un objet de type Point2D
     */
    public void setPosition(Point2D p) {
        this.x = p.x;
        this.y = p.y;
    }
    
    // Methodes de la classe Point2D
    // qui permettent une manipulation plus simple d'un objet de type Point2D
    
    /**
     * Methode permettant de translater un point 2D
     * @param x : l'increment de translation en X
     * @param y : l'increment de translation en Y
     */
    public void translate(int x, int y) {
        this.x += x;
        this.y += y;
    }
    
    /**
     * Methode permettant de tester si deux points sont egaux
     * i.e. si ils ont les memes coordonnees 
     * @param p un objet de type Point2D
     * @return true si le point courant et le point 'p' ont les memes coordonnees, faux sinon
     */
    public boolean equals(Point2D p) {
        return (this.x == p.x && this.y == p.y);
    }
      
    /**
     * Methode permettant de representer l'objet de type Point2D
     * sous forme de chaine de caracteres
     * l'annotation @Override permet de signaler à Java 
     * que l'on surcharge une methode (ici de la classe Object)
     * @return la chaine de caracteres representant le point 2D
     */
    @Override
    public String toString() {
        String s = "["+this.x+","+this.y+"]";
        return s;
    }
    
}
