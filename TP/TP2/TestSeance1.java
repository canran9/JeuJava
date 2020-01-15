/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

/**
 *
 * @author muruowang
 */
public class TestSeance1 {

    public static void main(String[] args) {

        World w1 = new World();
        w1.creeMondeAlea();

        w1.robin.affiche();
         System.out.println();
        w1.peon.affiche();
         System.out.println();
        w1.bugs.affiche();

        System.out.println();
        System.out.println("Initialisation d'un nouvel archer :");
        Archer arc = new Archer(7, "Archer_test", 99, 99,
                3, 5, 2,
                8, 17, 1,
                60, new Point2D(28, 10));
        System.out.println("Le lapin possède " + arc.getNbFleches() + " fleches");
        arc.setNbFleches(4);
        System.out.println("Modificaition le nombre fleches :");
        arc.affiche();

        System.out.println();
        System.out.println("Initialisation d'un nouvel lapin :");
        Lapin l = new Lapin(20,
                5, 19,
                6, new Point2D(0, 10));
        System.out.println("Le lapin possède " + l.getPtVie() + " points de vie");
        l.setPtVie(30);
        System.out.println("Modificaition les points de vie de lapin :");
        l.affiche();

    }

}
