/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

import java.util.Random;

/**
 *
 * @author muruowang
 */
public class World {

    public Archer robin;
    public Paysan peon;
    public Lapin bugs;

    public World() {
        this.robin = new Archer();
        
        this.peon = new Paysan();
        this.bugs = new Lapin();

    }

    // méthode : creeMondeAlea
    // •  Ilsnedoiventpasêtresurlamêmeposi'on2D
    // •  Assurez-vousqu’ilssoientrela'vementprocheslesunsdesautres(i.e.la distance entre deux éléments ne doit pas dépasser 5 unités
    public void creeMondeAlea() {
        // nombres pseudo-aleatoires
        Random generateurAleatoire = new Random();
        // génération la position de Archer personnage
        Point2D posRobin = new Point2D(generateurAleatoire.nextInt(10), generateurAleatoire.nextInt(10));
        this.robin.setPos(posRobin);

        // génération la position de Paysan personnage
        Point2D posPeon = new Point2D(generateurAleatoire.nextInt(10), generateurAleatoire.nextInt(10));

        // vérifier la distance entre Archer et Paysan
        while (posRobin.equals(posPeon) || posRobin.distance(posPeon) > 5) {
            posPeon.setPosition(generateurAleatoire.nextInt(10), generateurAleatoire.nextInt(10));
        }
        // si oui , set la position de Paysan
        this.peon.setPos(posPeon);

        // génerer la position de Lapin
        Point2D posBugs = new Point2D(generateurAleatoire.nextInt(10), generateurAleatoire.nextInt(10));
        // vérifier la distance entre Lapin et Paysan , la distance entre Lapin et Archer
        while (posBugs.equals(posPeon) || posBugs.distance(posPeon) > 5 || posBugs.equals(posRobin) || posBugs.distance(posRobin) > 5) {
            posBugs.setPosition(generateurAleatoire.nextInt(10), generateurAleatoire.nextInt(10));
        }
        // si oui , set la position de Lapin
        this.bugs.setPos(posBugs);
        System.out.println("Monde aléatoire est crée !");

    }

}
